package sampleData;

import java.util.*;
import java.util.stream.IntStream;

public class ArraysSample {
    private int [] sortedArray = IntStream.rangeClosed(0, 1000).toArray();
    private int [] reversedSortedArray = IntStream.rangeClosed(1, sortedArray.length).map(i -> sortedArray[sortedArray.length-i]).toArray();;
    private int [] randomArray = IntStream.generate(() -> new Random().nextInt(1000)).limit(1000).toArray();
    private int [] repeatedValuesArray = IntStream.generate(() -> new Random().nextInt(100)+900).limit(1000).toArray();

    public int[] getSortedArray() {
        return sortedArray;
    }

    public int[] getReversedSortedArray() {
        return reversedSortedArray;
    }

    public int[] getRandomArray() {
        return randomArray;
    }

    public int[] getRepeatedValuesArray() {
        return repeatedValuesArray;
    }






}
