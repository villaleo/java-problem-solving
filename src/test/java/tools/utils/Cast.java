package tools.utils;

public class Cast {
    public static Integer[] toIntegerArray(int[] array) {
        var out = new Integer[array.length];
        for (int i = 0; i < array.length; i++) {
            out[i] = array[i];
        }
        return out;
    }
}
