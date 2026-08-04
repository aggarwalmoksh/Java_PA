package Sorting;

public class QuickSortASC {
    static void quickSort(int[] arr, int low, int high) {
        if (low < high){
            int pivotidx = partition(arr,low,high);
            quickSort(arr,low,pivotidx - 1);
            quickSort(arr,pivotidx+1,high);
        }
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }

    public static void main(String[] args) {
        int arr1[] = {7,2,9,1,5,8,3};
        quickSort(arr1,0,arr1.length-1);
        for (int i = 0;i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}
