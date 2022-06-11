import algorithms.BubbleSort;
import algorithms.QuickSort;
import algorithms.MergeSort;
import algorithms.SelectionSort;
import file.FileCreator;
import sampleData.ArraysSample;
import time.TimeMeasure;

public class Main {

    public static void main(String[] args) {
        ArraysSample arrays = new ArraysSample();
        BubbleSort bubbleSort = new BubbleSort();
        QuickSort quickSort = new QuickSort();
        SelectionSort selectionSort = new SelectionSort();
        MergeSort mergeSort = new MergeSort();
        TimeMeasure timeMeasure = new TimeMeasure();
        FileCreator fileCreator = new FileCreator();

        fileCreator.createFile();

        timeMeasure.measureBubbleSort(bubbleSort, arrays);
        timeMeasure.measureQuickSort(quickSort, arrays);
        timeMeasure.measureSelectionSort(selectionSort,arrays);
        timeMeasure.measureMergeSort(mergeSort, arrays);
    }
}
