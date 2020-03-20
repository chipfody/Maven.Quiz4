package rocks.zipcode.quiz4.fundamentals;

import java.util.Arrays;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {
        return string.charAt(string.length() / 2);
    }

    public static String capitalizeMiddleCharacter(String str) {
//        if (str.length() == 1) {
//            return str.toUpperCase();
//        }
//        int indexToCapitalize = str.indexOf(getMiddleCharacter(str));
//        System.out.println(indexToCapitalize);
//
//        return str.substring(0, indexToCapitalize) + str.substring(indexToCapitalize, indexToCapitalize + 1).toUpperCase() + str.substring(indexToCapitalize + 1);
        return null;
    }

    public static String lowerCaseMiddleCharacter(String str) {
        return null;
    }

    public static Boolean isIsogram(String str) {
        char array[] = str.toCharArray();
        Boolean Isogram = false;
        Arrays.sort(array);
        for (int i = 0; i < str.length() - 1; i++) {
            if (array[i] == array[i + 1]) {
                Isogram = false;
                break;
            } else {
                Isogram = true;
            }
        }  return Isogram;

    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        char array[] = str.toCharArray();
        Boolean consecutive = false;
        for (int i = 0; i < str.length() - 1; i++) {
            if (array[i] == array[i + 1]) {
                consecutive = true;
            }
        }
        return consecutive;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
        return null;
    }

    public static String invertCasing(String str) {
        return null;
    }
}