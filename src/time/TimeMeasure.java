package time;

import algorithms.BubbleSort;
import algorithms.MergeSort;
import algorithms.QuickSort;
import algorithms.SelectionSort;
import file.FileWrite;
import sampleData.ArraysSample;

public class TimeMeasure {

    public void measureBubbleSort(BubbleSort bubbleSort, ArraysSample arrays) {
        FileWrite fileWrite = new FileWrite();
        fileWrite.writeToFile("BUBBLE SORT:");

        long startTime = System.nanoTime();
        bubbleSort.bubbleSort(arrays.getRandomArray1());
        long estimatedTime = System.nanoTime() - startTime;
        fileWrite.writeToFile("Random array 10^3 sorting time: " + estimatedTime);

        startTime = System.nanoTime();
        bubbleSort.bubbleSort(arrays.getSortedArray1());
        estimatedTime = System.nanoTime() - startTime;
        fileWrite.writeToFile("Sorted array 10^3 sorting time: " + estimatedTime);

        startTime = System.nanoTime();
        bubbleSort.bubbleSort(arrays.getReversedSortedArray1());
        estimatedTime = System.nanoTime() - startTime;
        fileWrite.writeToFile("Reversed sorted array 10^3 sorting time: " + estimatedTime);

        startTime = System.nanoTime();
        bubbleSort.bubbleSort(arrays.getRepeatedValuesArray1());
        estimatedTime = System.nanoTime() - startTime;
        fileWrite.writeToFile("Repeated values array 10^3 sorting time: " + estimatedTime);

        startTime = System.nanoTime();
        bubbleSort.bubbleSort(arrays.getRandomArray2());
        estimatedTime = System.nanoTime() - startTime;
        fileWrite.writeToFile("Random array 10^5 sorting time: " + estimatedTime);

        startTime = System.nanoTime();
        bubbleSort.bubbleSort(arrays.getSortedArray2());
        estimatedTime = System.nanoTime() - startTime;
        fileWrite.writeToFile("Sorted array 10^5 sorting time: " + estimatedTime);

        startTime = System.nanoTime();
        bubbleSort.bubbleSort(arrays.getReversedSortedArray2());
        estimatedTime = System.nanoTime() - startTime;
        fileWrite.writeToFile("Reversed sorted array 10^5 sorting time: " + estimatedTime);

        startTime = System.nanoTime();
        bubbleSort.bubbleSort(arrays.getRepeatedValuesArray2());
        estimatedTime = System.nanoTime() - startTime;
        fileWrite.writeToFile("Repeated values array 10^5 sorting time: " + estimatedTime);

        startTime = System.nanoTime();
        bubbleSort.bubbleSort(arrays.getRandomArray3());
        estimatedTime = System.nanoTime() - startTime;
        fileWrite.writeToFile("Random array 10^7 sorting time: " + estimatedTime);

        startTime = System.nanoTime();
        bubbleSort.bubbleSort(arrays.getSortedArray3());
        estimatedTime = System.nanoTime() - startTime;
        fileWrite.writeToFile("Sorted array 10^7 sorting time: " + estimatedTime);

        startTime = System.nanoTime();
        bubbleSort.bubbleSort(arrays.getReversedSortedArray3());
        estimatedTime = System.nanoTime() - startTime;
        fileWrite.writeToFile("Reversed sorted array 10^7 sorting time: " + estimatedTime);

        startTime = System.nanoTime();
        bubbleSort.bubbleSort(arrays.getRepeatedValuesArray3());
        estimatedTime = System.nanoTime() - startTime;
        fileWrite.writeToFile("Repeated values array 10^7 sorting time: " + estimatedTime);
    }

    public void measureQuickSort(QuickSort quickSort, ArraysSample arrays) {
        FileWrite fileWrite = new FileWrite();
        fileWrite.writeToFile(System.lineSeparator());
        fileWrite.writeToFile("QUICK SORT:");

        long startTime = System.nanoTime();
        quickSort.quickSort(arrays.getRandomArray1());
        long estimatedTime = System.nanoTime() - startTime;
        fileWrite.writeToFile("Random array 10^3 sorting time: " + estimatedTime);

        startTime = System.nanoTime();
        quickSort.quickSort(arrays.getSortedArray1());
        estimatedTime = System.nanoTime() - startTime;
        fileWrite.writeToFile("Sorted array 10^3 sorting time: " + estimatedTime);

        startTime = System.nanoTime();
        quickSort.quickSort(arrays.getReversedSortedArray1());
        estimatedTime = System.nanoTime() - startTime;
        fileWrite.writeToFile("Reversed sorted array 10^3 sorting time: " + estimatedTime);

        startTime = System.nanoTime();
        quickSort.quickSort(arrays.getRepeatedValuesArray1());
        estimatedTime = System.nanoTime() - startTime;
        fileWrite.writeToFile("Repeated values array 10^3 sorting time: " + estimatedTime);

        startTime = System.nanoTime();
        quickSort.quickSort(arrays.getRandomArray2());
        estimatedTime = System.nanoTime() - startTime;
        fileWrite.writeToFile("Random array 10^4 sorting time: " + estimatedTime);

        startTime = System.nanoTime();
        quickSort.quickSort(arrays.getSortedArray2());
        estimatedTime = System.nanoTime() - startTime;
        fileWrite.writeToFile("Sorted array 10^4 sorting time: " + estimatedTime);

        startTime = System.nanoTime();
        quickSort.quickSort(arrays.getReversedSortedArray2());
        estimatedTime = System.nanoTime() - startTime;
        fileWrite.writeToFile("Reversed sorted array 10^4 sorting time: " + estimatedTime);

        startTime = System.nanoTime();
        quickSort.quickSort(arrays.getRepeatedValuesArray2());
        estimatedTime = System.nanoTime() - startTime;
        fileWrite.writeToFile("Repeated values array 10^4 sorting time: " + estimatedTime);

        startTime = System.nanoTime();
        quickSort.quickSort(arrays.getRandomArray3());
        estimatedTime = System.nanoTime() - startTime;
        fileWrite.writeToFile("Random array 10^5 sorting time: " + estimatedTime);

        startTime = System.nanoTime();
        quickSort.quickSort(arrays.getSortedArray3());
        estimatedTime = System.nanoTime() - startTime;
        fileWrite.writeToFile("Sorted array 10^5 sorting time: " + estimatedTime);

        startTime = System.nanoTime();
        quickSort.quickSort(arrays.getReversedSortedArray3());
        estimatedTime = System.nanoTime() - startTime;
        fileWrite.writeToFile("Reversed sorted array 10^5 sorting time: " + estimatedTime);

        startTime = System.nanoTime();
        quickSort.quickSort(arrays.getRepeatedValuesArray3());
        estimatedTime = System.nanoTime() - startTime;
        fileWrite.writeToFile("Repeated values array 10^5 sorting time: " + estimatedTime);
    }

    public void measureSelectionSort(SelectionSort selectionSort, ArraysSample arrays) {
        FileWrite fileWrite = new FileWrite();
        fileWrite.writeToFile(System.lineSeparator());
        fileWrite.writeToFile("SELECTION SORT:");

        long startTime = System.nanoTime();
        selectionSort.selectionSort(arrays.getRandomArray1());
        long estimatedTime = System.nanoTime() - startTime;
        fileWrite.writeToFile("Random array 10^3 sorting time: " + estimatedTime);

        startTime = System.nanoTime();
        selectionSort.selectionSort(arrays.getSortedArray1());
        estimatedTime = System.nanoTime() - startTime;
        fileWrite.writeToFile("Sorted array 10^3 sorting time: " + estimatedTime);

        startTime = System.nanoTime();
        selectionSort.selectionSort(arrays.getReversedSortedArray1());
        estimatedTime = System.nanoTime() - startTime;
        fileWrite.writeToFile("Reversed sorted array 10^3 sorting time: " + estimatedTime);

        startTime = System.nanoTime();
        selectionSort.selectionSort(arrays.getRepeatedValuesArray1());
        estimatedTime = System.nanoTime() - startTime;
        fileWrite.writeToFile("Repeated values array 10^3 sorting time: " + estimatedTime);

        startTime = System.nanoTime();
        selectionSort.selectionSort(arrays.getRandomArray2());
        estimatedTime = System.nanoTime() - startTime;
        fileWrite.writeToFile("Random array 10^4 sorting time: " + estimatedTime);

        startTime = System.nanoTime();
        selectionSort.selectionSort(arrays.getSortedArray2());
        estimatedTime = System.nanoTime() - startTime;
        fileWrite.writeToFile("Sorted array 10^4 sorting time: " + estimatedTime);

        startTime = System.nanoTime();
        selectionSort.selectionSort(arrays.getReversedSortedArray2());
        estimatedTime = System.nanoTime() - startTime;
        fileWrite.writeToFile("Reversed sorted array 10^4 sorting time: " + estimatedTime);

        startTime = System.nanoTime();
        selectionSort.selectionSort(arrays.getRepeatedValuesArray2());
        estimatedTime = System.nanoTime() - startTime;
        fileWrite.writeToFile("Repeated values array 10^4 sorting time: " + estimatedTime);

        startTime = System.nanoTime();
        selectionSort.selectionSort(arrays.getRandomArray3());
        estimatedTime = System.nanoTime() - startTime;
        fileWrite.writeToFile("Random array 10^5 sorting time: " + estimatedTime);

        startTime = System.nanoTime();
        selectionSort.selectionSort(arrays.getSortedArray3());
        estimatedTime = System.nanoTime() - startTime;
        fileWrite.writeToFile("Sorted array 10^5 sorting time: " + estimatedTime);

        startTime = System.nanoTime();
        selectionSort.selectionSort(arrays.getReversedSortedArray3());
        estimatedTime = System.nanoTime() - startTime;
        fileWrite.writeToFile("Reversed sorted array 10^5 sorting time: " + estimatedTime);

        startTime = System.nanoTime();
        selectionSort.selectionSort(arrays.getRepeatedValuesArray3());
        estimatedTime = System.nanoTime() - startTime;
        fileWrite.writeToFile("Repeated values array 10^5 sorting time: " + estimatedTime);
    }

    public void measureMergeSort(MergeSort mergeSort, ArraysSample arrays) {
        FileWrite fileWrite = new FileWrite();
        fileWrite.writeToFile(System.lineSeparator());
        fileWrite.writeToFile("MERGE SORT:");

        long startTime = System.nanoTime();
        mergeSort.mergeSort(arrays.getRandomArray1());
        long estimatedTime = System.nanoTime() - startTime;
        fileWrite.writeToFile("Random array 10^3 sorting time: " + estimatedTime);

        startTime = System.nanoTime();
        mergeSort.mergeSort(arrays.getSortedArray1());
        estimatedTime = System.nanoTime() - startTime;
        fileWrite.writeToFile("Sorted array 10^3 sorting time: " + estimatedTime);

        startTime = System.nanoTime();
        mergeSort.mergeSort(arrays.getReversedSortedArray1());
        estimatedTime = System.nanoTime() - startTime;
        fileWrite.writeToFile("Reversed sorted array 10^3 sorting time: " + estimatedTime);

        startTime = System.nanoTime();
        mergeSort.mergeSort(arrays.getRepeatedValuesArray1());
        estimatedTime = System.nanoTime() - startTime;
        fileWrite.writeToFile("Repeated values array 10^3 sorting time: " + estimatedTime);

        startTime = System.nanoTime();
        mergeSort.mergeSort(arrays.getRandomArray2());
        estimatedTime = System.nanoTime() - startTime;
        fileWrite.writeToFile("Random array 10^4 sorting time: " + estimatedTime);

        startTime = System.nanoTime();
        mergeSort.mergeSort(arrays.getSortedArray2());
        estimatedTime = System.nanoTime() - startTime;
        fileWrite.writeToFile("Sorted array 10^4 sorting time: " + estimatedTime);

        startTime = System.nanoTime();
        mergeSort.mergeSort(arrays.getReversedSortedArray2());
        estimatedTime = System.nanoTime() - startTime;
        fileWrite.writeToFile("Reversed sorted array 10^4 sorting time: " + estimatedTime);

        startTime = System.nanoTime();
        mergeSort.mergeSort(arrays.getRepeatedValuesArray2());
        estimatedTime = System.nanoTime() - startTime;
        fileWrite.writeToFile("Repeated values array 10^4 sorting time: " + estimatedTime);

        startTime = System.nanoTime();
        mergeSort.mergeSort(arrays.getRandomArray3());
        estimatedTime = System.nanoTime() - startTime;
        fileWrite.writeToFile("Random array 10^5 sorting time: " + estimatedTime);

        startTime = System.nanoTime();
        mergeSort.mergeSort(arrays.getSortedArray3());
        estimatedTime = System.nanoTime() - startTime;
        fileWrite.writeToFile("Sorted array 10^5 sorting time: " + estimatedTime);

        startTime = System.nanoTime();
        mergeSort.mergeSort(arrays.getReversedSortedArray3());
        estimatedTime = System.nanoTime() - startTime;
        fileWrite.writeToFile("Reversed sorted array 10^5 sorting time: " + estimatedTime);

        startTime = System.nanoTime();
        mergeSort.mergeSort(arrays.getRepeatedValuesArray3());
        estimatedTime = System.nanoTime() - startTime;
        fileWrite.writeToFile("Repeated values array 10^5 sorting time: " + estimatedTime);
    }
}