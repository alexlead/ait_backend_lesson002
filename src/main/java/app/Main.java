package app;

public class Main {

    public static int[] getArray (int size) {

        if (size < 0 ) {
            throw new IllegalArgumentException("Array's size can not be below zero");
        }

        int [] result = new int[size];
        for (int i=0; i < result.length; i++) {
            result[i] = i+1;
        }
        return result;
    }
}
