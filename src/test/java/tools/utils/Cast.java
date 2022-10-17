package tools.utils;

import java.util.Arrays;

public class Cast {
    public static Integer[] toIntegerArray(int[] array) {
        return Arrays.stream(array).boxed().toArray(Integer[]::new);
    }
}
