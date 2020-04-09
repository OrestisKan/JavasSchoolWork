import java.io.*;
import java.util.*;

class Node {

    List<Node> outgoingEdges;
    int id;
    boolean marked;

    public Node(int id  ) {
        this.id = id ;
        this.outgoingEdges = new ArrayList<>();
        this.marked = false;
    }
}

class Solution {

    // Implement the solve method to return the answer to the problem posed by the inputstream.
    public static String run(InputStream in) {
        return new Solution().solve(in);
    }

    public String solve(InputStream in) {
        // TODO
        Scanner sc = new Scanner(in);
        int V = sc.nextInt();
        int E = sc.nextInt();
        int start = sc.nextInt();
        int end = sc.nextInt();

        List<Node> vertices = create(sc);

        boolean next = true;
        Node cur ;
        Node n;
        for(int i =0 ; i < vertices.size() ; i++){
            if( vertices.get(i).id == start ){
                cur = vertices.get(i);
                n = vertices.get(i).outgoingEdges.get(0);
                vertices.get(i).marked= true;
                break;
            }
        }


        while (next) {


        }





        return "";
    }

    public List<Node> create(Scanner sc) {

        //maybe put the elements sorted in the list?
        // same element must

        List<Node> toReturn = new ArrayList<>();
        while(sc.hasNext()){
            String l = sc.nextLine();

            String[] x = l.split(" ");

            Node n = new Node(Integer.parseInt(x[0]));
            n.outgoingEdges.add(new Node(Integer.parseInt(x[1])));

            toReturn.add(n);
        }

        return toReturn;
    }

    public void helper(List<Node> v , Node cur) {




    }


}

