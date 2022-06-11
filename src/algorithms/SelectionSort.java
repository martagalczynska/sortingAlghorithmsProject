package algorithms;

public class SelectionSort {
    public static void selectionSort(int[] arr)
        {
            int pos;
            int temp;
            for (int i = 0; i < arr.length; i++) {
                pos = i;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] < arr[pos]) {
                        pos = j;
                    }
                }

                temp = arr[pos];
                arr[pos] = arr[i];
                arr[i] = temp;
            }
        }
}
