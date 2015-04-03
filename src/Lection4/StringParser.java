package Lection4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by bondar on 4/3/2015.
 */
public class StringParser {
    public static void main(String[] args) {

    }

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

    //check that first character in input string is letter and if it is - change to UpperCase
    public static String firstLetterInWordToUpperCase(String inputString){
        char firstCharacter = inputString.charAt(0);
        if (Character.isLetter(firstCharacter)){
            firstCharacter = Character.toUpperCase(firstCharacter);
            return inputString.replaceFirst("\\w", Character.toString(firstCharacter));
        }
        return inputString;
    }
}
