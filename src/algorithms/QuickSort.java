package algorithms;

public class QuickSort {

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private int partition(int[] arr, int begin, int end) {
        int pivot = arr[end];
        int i = (begin - 1);

        for (int j = begin; j <= end - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, end);
        return (i + 1);
    }

    public void quickSort(int[] arr, int begin, int end) {
        if (begin < end) {
            int pi = partition(arr, begin, end);
            quickSort(arr, begin, pi - 1);
            quickSort(arr, pi + 1, end);
        }
    }

    public void quickSort(int[] arr) {
        try {
            quickSort(arr, 0, arr.length - 1);
        } catch (StackOverflowError e) {

        }
    }
}
