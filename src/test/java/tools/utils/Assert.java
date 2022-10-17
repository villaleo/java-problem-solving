package tools.utils;

public class Assert {
    public static <T> void equals(T[] a, T[] b) {
        org.junit.jupiter.api.Assertions.assertEquals(a.length, b.length);
        for (int i = 0; i < a.length; i++) {
            org.junit.jupiter.api.Assertions.assertEquals(a[i], b[i], "Element mismatch.");
        }
    }

    public static <T> void notEquals(T[] a, T[] b) {
        if (a.length != b.length) {
            org.junit.jupiter.api.Assertions.assertNotEquals(a.length, b.length);
        }
        for (int i = 0; i < a.length; i++) {
            org.junit.jupiter.api.Assertions.assertNotEquals(a[i], b[i], "Element match.");
        }
    }
}
