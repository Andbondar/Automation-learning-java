package Lection5;

import com.google.common.base.CharMatcher;
import com.google.common.base.Splitter;

import java.util.Arrays;

/**
 * Created by bondar on 4/7/2015.
 */
//this class will be used as internal library
public class StringSplitting {
    public static void main(String[] args) {

    }
    public static void splitString(String inputString){
        System.out.println("String splitted into String array: " + Arrays.toString(Splitter.on(", ").splitToList(inputString).toArray()));
    }
    public static void splitStingWOEmptyStrings(String inputString){
        System.out.println("String splitted into String array (w/o empty Strings): " + Arrays.toString(Splitter.on(", ").omitEmptyStrings().splitToList(inputString).toArray()));
    }
    public static void splitStringAndTrimSpaces(String inputString){
        System.out.println("String splitted into String array (spaces trimmed): " + Arrays.toString(Splitter.on(", ").trimResults(CharMatcher.WHITESPACE).splitToList(inputString).toArray()));
    }
    public static void splitStringAndTrimNumbers(String inputString){
        System.out.println("String splitted into String array (numbers trimmed): " + Arrays.toString(Splitter.on(", ").trimResults(CharMatcher.inRange('0', '9')).splitToList(inputString).toArray()));
    }
}
