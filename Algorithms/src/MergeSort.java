public class MergeSort {

    public void merge(int[] L, int left , int middle , int right) {


        int size_a = middle-left+1;
        int size_b = right - middle;

        int[] a = new int[size_a];
        int[] b = new int[size_b];

        //Split the arrays
        for(int i =0; i < size_a; ++i) {
            a[i] = L[i+left];
        }
        for (int i=0; i < size_b; ++i) {
            b[i] = L[middle+1+i];
        }

        int pointer_a =0;
        int pointer_b =0;
        int pointer = left;

        while(pointer_a < a.length && pointer_b < b.length) {
            if(a[pointer_a] < b[pointer_b]) {
                L[pointer] = a[pointer_a];
                pointer_a++;
            }else{
                L[pointer] = b[pointer_b];
                pointer_b++;
            }
            pointer++;
        }

        while (pointer_a < size_a) {
            L[pointer] = a[pointer_a];
            pointer_a++;
            pointer++;
        }
        while(pointer_b < size_b) {
            L[pointer] = b[pointer_b];
            pointer_b++;
            pointer++;
        }
    }

    public void sort(int[] L ,int left , int right) {
        int middle = (left + right)/2;

        sort(L , left, middle);
        sort(L , middle+1 ,right);

        merge(L,left,middle,right);
    }
}
