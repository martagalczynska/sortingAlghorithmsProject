package sampleData;

import java.util.*;
import java.util.stream.IntStream;

public class ArraysSample {
    private int [] sortedArray1 = IntStream.rangeClosed(0, 1000).toArray();
    private int [] reversedSortedArray1 = IntStream.rangeClosed(1, sortedArray1.length).map(i -> sortedArray1[sortedArray1.length-i]).toArray();;
    private int [] randomArray1 = IntStream.generate(() -> new Random().nextInt(1000)).limit(1000).toArray();
    private int [] repeatedValuesArray1 = IntStream.generate(() -> new Random().nextInt(100)+900).limit(1000).toArray();

    private int [] sortedArray2 = IntStream.rangeClosed(0, 10000).toArray();
    private int [] reversedSortedArray2 = IntStream.rangeClosed(1, sortedArray1.length).map(i -> sortedArray1[sortedArray1.length-i]).toArray();;
    private int [] randomArray2 = IntStream.generate(() -> new Random().nextInt(10000)).limit(10000).toArray();
    private int [] repeatedValuesArray2 = IntStream.generate(() -> new Random().nextInt(1000)+9000).limit(10000).toArray();

    private int [] sortedArray3 = IntStream.rangeClosed(0, 100000).toArray();
    private int [] reversedSortedArray3 = IntStream.rangeClosed(1, sortedArray2.length).map(i -> sortedArray2[sortedArray2.length-i]).toArray();;
    private int [] randomArray3 = IntStream.generate(() -> new Random().nextInt(100000)).limit(100000).toArray();
    private int [] repeatedValuesArray3 = IntStream.generate(() -> new Random().nextInt(10000)+90000).limit(100000).toArray();


    public int[] getSortedArray1() {
        return sortedArray1;
    }

    public int[] getReversedSortedArray1() {
        return reversedSortedArray1;
    }

    public int[] getRandomArray1() {
        return randomArray1;
    }

    public int[] getRepeatedValuesArray1() {
        return repeatedValuesArray1;
    }

    public int[] getSortedArray2() {
        return sortedArray2;
    }

    public int[] getReversedSortedArray2() {
        return reversedSortedArray2;
    }

    public int[] getRandomArray2() {
        return randomArray2;
    }

    public int[] getRepeatedValuesArray2() {
        return repeatedValuesArray2;
    }

    public int[] getSortedArray3() {
        return sortedArray3;
    }

    public int[] getReversedSortedArray3() {
        return reversedSortedArray3;
    }

    public int[] getRandomArray3() {
        return randomArray3;
    }

    public int[] getRepeatedValuesArray3() {
        return repeatedValuesArray3;
    }
}
