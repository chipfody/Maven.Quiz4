package rocks.zipcode.quiz4.arrays;

import java.util.Arrays;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values) {
        return values[values.length / 2];
    }

    public static String[] removeMiddleElement(String[] values) {
        String[] output = new String[values.length -1];
        Integer midElem = (values.length / 2);
        for (int i = 0; i < midElem; i++) {
            output[i] = values[i];
        }
        for (int j = midElem; j < values.length -1; j++) {
            output[j] = values[j + 1];
        }
        return output;
    }

    public static String getLastElement(String[] values) {
        return values[values.length - 1];
    }

    public static String[] removeLastElement(String[] values) {
        String[] output = new String[values.length - 1];
        for (int i = 0; i < values.length - 1; i++ ) {
            output[i] = values[i];
        }
        return output;
    }
}