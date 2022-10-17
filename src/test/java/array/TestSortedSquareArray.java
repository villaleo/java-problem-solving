package array;

import java.util.Arrays;

import tools.utils.Cast;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestSortedSquareArray {
    @Test
    public void testSortedSquareArrayHappyPath() {
        var array = new int[]{1, 2, 3, 5, 6, 8, 9};
        var expected = new Integer[]{1, 4, 9, 25, 36, 64, 81};
        var actual = Cast.toIntegerArray(SortedSquareArray.sortedSquaredArray(array));
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSortedSquareEmptyArray() {
        var array = new int[]{};
        var expected = new Integer[]{};
        var actual = Cast.toIntegerArray(SortedSquareArray.sortedSquaredArray(array));
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSortedSquareMismatch() {
        var array = new int[]{2, 4, 6};
        var expected = new Integer[]{10, 20, 30};
        var actual = Cast.toIntegerArray(SortedSquareArray.sortedSquaredArray(array));
        Assertions.assertFalse(Arrays.equals(expected, actual));
    }
}
