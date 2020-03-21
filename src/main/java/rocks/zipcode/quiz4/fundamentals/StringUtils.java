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
        if (str.length() == 1) {
            return str.toUpperCase();
        } else {
            int indexToCapitalize = (str.length() / 2);
            System.out.println(str.length() / 2);
            System.out.println(indexToCapitalize);

            return str.substring(0, indexToCapitalize) + str.substring(indexToCapitalize, indexToCapitalize + 1).toUpperCase() + str.substring(indexToCapitalize + 1);
        }
    }

    public static String lowerCaseMiddleCharacter(String str) {
        if (str.length() == 1) {
            return str.toLowerCase();
        } else {
            int indexToCapitalize = (str.length() / 2);
            System.out.println(str.length() / 2);
            System.out.println(indexToCapitalize);

            return str.substring(0, indexToCapitalize) + str.substring(indexToCapitalize, indexToCapitalize + 1).toLowerCase() + str.substring(indexToCapitalize + 1);
        }
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
        }
        return Isogram;

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
        StringBuilder result = new StringBuilder();
        if (!hasDuplicateConsecutiveCharacters(str)) {
            return str;
        } else {

            char[] output = str.toCharArray();
            result.append(output[0]);
            int idx = 1;
            while (idx < str.length()- 2) {
                if (output[idx] != output[idx - 1] && output[idx] != output[idx + 1]) {
                    result.append(output[idx]);
                    idx++;
                } else {idx++;}
                } if (output[str.length() - 1] != output[str.length() - 2]) {
                    result.append(output[str.length() - 1]);
                }
            }
            return result.toString();
        }


    public static String invertCasing(String str) {
        Integer index = str.length();
        char[] newString = str.toCharArray();
        for (int i = 0; i < index; i++) {
            if (Character.isUpperCase(newString[i])) {
                newString[i] = Character.toLowerCase(newString[i]);
            } else {
                newString[i] = Character.toUpperCase(newString[i]);
            }
        }
        return String.valueOf(newString);
    }
}