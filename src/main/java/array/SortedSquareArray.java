package array;

import java.util.Arrays;

public class SortedSquareArray {
    public static int[] sortedSquaredArray(int[] array) {
        return Arrays.stream(array).map(x -> x * x).sorted().toArray();
    }
}
