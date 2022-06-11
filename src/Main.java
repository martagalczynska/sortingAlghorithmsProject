import algorithms.BubbleSort;
import algorithms.QuickSort;
import file.FileCreator;
import sampleData.ArraysSample;
import time.TimeMeasure;

public class Main {

    public static void main(String[] args) {
        ArraysSample arrays = new ArraysSample();
        BubbleSort bubbleSort = new BubbleSort();
        QuickSort quickSort = new QuickSort();
        TimeMeasure timeMeasure = new TimeMeasure();
        FileCreator fileCreator = new FileCreator();

        fileCreator.createFile();

        timeMeasure.measureBubbleSort(bubbleSort, arrays);
        timeMeasure.measureQuickSort(quickSort, arrays);
    }
}
