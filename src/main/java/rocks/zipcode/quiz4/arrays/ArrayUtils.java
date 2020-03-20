package rocks.zipcode.quiz4.arrays;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values) {
        return values[values.length / 2];
    }

    public static String[] removeMiddleElement(String[] values) {
        Integer middleElement = (values.length / 2);
        return rebuildArray(values, middleElement);
    }

    public static String getLastElement(String[] values) {
        return values[values.length - 1];
    }

    public static String[] removeLastElement(String[] values) {
        return null;
    }

    public static String[] rebuildArray(String[] newArray, Integer remove) {
        String[] output = new String[newArray.length - 1];
        for (int i = 0; i < remove; i++) {
            for (int j = remove; j < newArray.length - 1; j++) {
                output[j] = newArray[j + 1];
            }
        }
        return output;

    }
}