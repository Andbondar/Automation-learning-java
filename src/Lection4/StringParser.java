package Lection4;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bondar on 4/3/2015.
 */
public class StringParser {
    public static void main(String[] args) {

    }

    //extracts int[] array from input strings. Every string surrounded by spaces is converted to int is possible and then added to array
    public static int[] extractNumbersFromString(String inputString){
        List<Integer> numberArrayList = new ArrayList<Integer>();
        int[] returnedIntArray;
        String[] splittedString =  inputString.split(" +");
        for (String aSplittedString : splittedString) {
            if (isInteger(aSplittedString)) {
                numberArrayList.add(Integer.parseInt(aSplittedString));
            }
        }
        returnedIntArray = numberArrayList.stream().mapToInt(i->i).toArray();//lets use lambda expression
        return returnedIntArray;
    }

    //http://stackoverflow.com/questions/237159/whats-the-best-way-to-check-to-see-if-a-string-represents-an-integer-in-java
    public static boolean isInteger(String str) {
        if (str == null) {
            return false;
        }
        int length = str.length();
        if (length == 0) {
            return false;
        }
        int i = 0;
        if (str.charAt(0) == '-') {
            if (length == 1) {
                return false;
            }
            i = 1;
        }
        for (; i < length; i++) {
            char c = str.charAt(i);
            if (c <= '/' || c >= ':') {
                return false;
            }
        }
        return true;
    }

    //capitalize first letter of each word in string
    public static String capitalizeWordsInString(String string) {
        char[] chars = string.toCharArray();
        boolean found = false;//this variable is needed to select only First char After whitespace
        for (int i = 0; i < chars.length; i++) {
            if (!found && !Character.isWhitespace(chars[i])) {//change character to upper case if previous character was space and this character is not space
                chars[i] = Character.toUpperCase(chars[i]);
                found = true;
            } else if (Character.isWhitespace(chars[i])) {//change found to false and search for new character after whitespace
                found = false;
            }
        }
        return String.valueOf(chars);
    }
}
