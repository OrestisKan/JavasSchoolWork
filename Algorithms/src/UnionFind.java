public class UnionFind {
    int[] parent;
    int[] rank;

    /**
     * Constructor were it initializes the arrays given a size ,
     * and initializes each nodes parent to be itself and initializes
     * each rank to be 0 (Since every node is the parent of itself).
     * @param size
     */
    public UnionFind(int size) {
        this.parent= new int[size];
        this.rank = new int[size];
        for (int i=0 ; i< size ; i++){
            parent[i]=i;
            rank[i]=0; // Maybe not needed since its default
        }
    }

    public int find(int i) {
        if (parent[i] !=i)
            parent[i] = find(parent[i]) ;
        return parent[i];
    }

    public boolean union(int a , int b ) {
        int parent_a = find(a);
        int parent_b = find(b);

        if(parent_a == parent_b) {
            return false; //Since they are in the same set already so a union is not possible
        }

        //The set with the highest rank becomes the new parent.
        if(rank[parent_a] >= rank[parent_b]) {
            parent[parent_b] = parent_a;
        }else {
            parent[parent_a] = parent_b;
        }
        return true;
    }

    // Return the rank of the trees
    public int[] getRank() {
        return rank;
    }

    // Return the parent of the trees
    public int[] getParent() {
        return parent;
    }

}
