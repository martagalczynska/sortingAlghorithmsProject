package time;

import algorithms.BubbleSort;
import algorithms.MergeSort;
import algorithms.QuickSort;
import algorithms.SelectionSort;
import file.FileWrite;
import sampleData.ArraysSample;

public class TimeMeasure {

    public void measureBubbleSort(BubbleSort bubbleSort, ArraysSample arrays){
        FileWrite fileWrite = new FileWrite();
        fileWrite.writeToFile("BUBBLE SORT:");

        long startTime = System.nanoTime();
        bubbleSort.bubbleSort(arrays.getRandomArray());
        long estimatedTime = System.nanoTime() - startTime;
        fileWrite.writeToFile("Random array sorting time: "+ estimatedTime);

        startTime = System.nanoTime();
        bubbleSort.bubbleSort(arrays.getSortedArray());
        estimatedTime = System.nanoTime() - startTime;
        fileWrite.writeToFile("Sorted array sorting time: "+ estimatedTime);

        startTime = System.nanoTime();
        bubbleSort.bubbleSort(arrays.getReversedSortedArray());
        estimatedTime = System.nanoTime() - startTime;
        fileWrite.writeToFile("Reversed sorted array sorting time: "+ estimatedTime);

        startTime = System.nanoTime();
        bubbleSort.bubbleSort(arrays.getRepeatedValuesArray());
        estimatedTime = System.nanoTime() - startTime;
        fileWrite.writeToFile("Repeated values array sorting time: "+ estimatedTime);
    }

    public void measureQuickSort(QuickSort quickSort, ArraysSample arrays){
        FileWrite fileWrite = new FileWrite();
        fileWrite.writeToFile(System.lineSeparator());
        fileWrite.writeToFile("QUICK SORT:");

        long startTime = System.nanoTime();
        quickSort.quickSort(arrays.getRandomArray());
        long estimatedTime = System.nanoTime() - startTime;
        fileWrite.writeToFile("Random array sorting time: "+ estimatedTime);

        startTime = System.nanoTime();
        quickSort.quickSort(arrays.getSortedArray());
        estimatedTime = System.nanoTime() - startTime;
        fileWrite.writeToFile("Sorted array sorting time: "+ estimatedTime);

        startTime = System.nanoTime();
        quickSort.quickSort(arrays.getReversedSortedArray());
        estimatedTime = System.nanoTime() - startTime;
        fileWrite.writeToFile("Reversed sorted array sorting time: "+ estimatedTime);

        startTime = System.nanoTime();
        quickSort.quickSort(arrays.getRepeatedValuesArray());
        estimatedTime = System.nanoTime() - startTime;
        fileWrite.writeToFile("Repeated values array sorting time: "+ estimatedTime);
    }
    public void measureSelectionSort(SelectionSort selectionSort, ArraysSample arrays){
        FileWrite fileWrite = new FileWrite();
        fileWrite.writeToFile(System.lineSeparator());
        fileWrite.writeToFile("SELECTION SORT:");

        long startTime = System.nanoTime();
        selectionSort.selectionSort(arrays.getRandomArray());
        long estimatedTime = System.nanoTime() - startTime;
        fileWrite.writeToFile("Random array sorting time: "+ estimatedTime);

        startTime = System.nanoTime();
        selectionSort.selectionSort(arrays.getSortedArray());
        estimatedTime = System.nanoTime() - startTime;
        fileWrite.writeToFile("Sorted array sorting time: "+ estimatedTime);

        startTime = System.nanoTime();
        selectionSort.selectionSort(arrays.getReversedSortedArray());
        estimatedTime = System.nanoTime() - startTime;
        fileWrite.writeToFile("Reversed sorted array sorting time: "+ estimatedTime);

        startTime = System.nanoTime();
        selectionSort.selectionSort(arrays.getRepeatedValuesArray());
        estimatedTime = System.nanoTime() - startTime;
        fileWrite.writeToFile("Repeated values array sorting time: "+ estimatedTime);
    }

    public void measureMergeSort(MergeSort mergeSort, ArraysSample arrays){
        FileWrite fileWrite = new FileWrite();
        fileWrite.writeToFile(System.lineSeparator());
        fileWrite.writeToFile("MERGE SORT:");

        long startTime = System.nanoTime();
        mergeSort.mergeSort(arrays.getRandomArray());
        long estimatedTime = System.nanoTime() - startTime;
        fileWrite.writeToFile("Random array sorting time: "+ estimatedTime);

        startTime = System.nanoTime();
        mergeSort.mergeSort(arrays.getSortedArray());
        estimatedTime = System.nanoTime() - startTime;
        fileWrite.writeToFile("Sorted array sorting time: "+ estimatedTime);

        startTime = System.nanoTime();
        mergeSort.mergeSort(arrays.getReversedSortedArray());
        estimatedTime = System.nanoTime() - startTime;
        fileWrite.writeToFile("Reversed sorted array sorting time: "+ estimatedTime);

        startTime = System.nanoTime();
        mergeSort.mergeSort(arrays.getRepeatedValuesArray());
        estimatedTime = System.nanoTime() - startTime;
        fileWrite.writeToFile("Repeated values array sorting time: "+ estimatedTime);
    }
}