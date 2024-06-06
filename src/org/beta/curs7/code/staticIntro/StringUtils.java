package org.beta.curs7.code.staticIntro;

public class StringUtils {
    public static String replaceAndRevers(String input, String oldString, String newString) {
        String replacedString = input.replaceAll(oldString, newString);
        char[] letters = replacedString.toCharArray();
        StringBuilder result = new StringBuilder();
        for (int i = letters.length - 1; i >= 0; i--) {
            result.append(letters[i]);
        }
        return result.toString();
    }
}


// BMV -> ['B', 'M', 'V'] -> V M B