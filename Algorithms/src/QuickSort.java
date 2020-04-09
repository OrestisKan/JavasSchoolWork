/**
 * Quick sort has multiple implementations depending on
 * what element you pick as pivot , below you see an implementation
 * based on the principle: Always pick last element as pivot.
 *
 * Key idea of QuickSort:
 *      Pick an element x to partition as a pivot
 *      Put that element in its correct position by
 *      putting all elements that are less than x to the left
 *      and all elements that are more than x to the right
 */
public class QuickSort {

    public void quickSort(int[] arr , int low , int high) {
        if(low < high) {
            int partition_index = partition(arr, low,high);

            //traverse lower than partition
            quickSort(arr ,low, partition_index-1);

            //Traverse higher than partition index
            quickSort(arr,partition_index+1, high);

        }

    }

    public int partition(int[] arr , int low , int high) {
        //TODO make it in a way that you can choose what partitioning way you want to be used
        int pivot = arr[high];
        //index of smaller element
        int i = low-1;

        for (int j = low ; j < high; j++) {
            if(arr[j] < pivot) {
                i++;
                swap(arr,i,j);
            }

            swap(arr,i+1,high);
        }

        return i+1;
    }

    public void swap(int[] arr , int i , int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
