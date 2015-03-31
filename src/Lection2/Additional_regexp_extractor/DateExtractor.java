package Lection2.Additional_regexp_extractor;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by bondar on 3/31/2015.
 */

// In this class string is generated and then parsed to extract the date in a specified format
public class DateExtractor {
    public static void main(String[] args) {

    }

    //Simple date extractor for specified date format YYYY-MM-DD
    public static String extractDate(String inputString){
        Pattern pattern = Pattern.compile("[0-9]{1,4}[.-][[0-9]\\w]{1,3}[.-][0-9]{1,4}");//pattern matches dates. Month can be specified either by number or by 3-letter name like 'JUN'
        Matcher matcher = pattern.matcher(inputString);
        if (matcher.find()) return matcher.group();
        else return "No date found";
    }

    //Advanced Date extractor (by matching regular expressions). First date found in input string is extracted
    public static String getDateFromString(String inputString){
        List<String> regExpressions = new ArrayList<String>();
        regExpressions.add("[0-9]{1,2}-\\w{3}-[0-9]{4}");//DD-MON-YYYY, D-MON-YYYY
        regExpressions.add("[0-9]{1,2}-[0-9]{1,2}-[0-9]{4}");//DD-MM-YYYY, D-M-YYYY
        regExpressions.add("[0-9]{1,2}\\.[0-9]{1,2}\\.[0-9]{2,4}");//DD.MM.YYYY, D.M.YYYY, DD.MM.YY
        regExpressions.add("[A-Z]\\w* [0-9]{1,2}, [0-9]{4}");//March 12, 2008
        regExpressions.add("[0-9]{4}-[0-9]{1,2}-[0-9]{1,2}");//YYYY-MM-DD, YYYY-M-D
        regExpressions.add("Q[1-4] [0-9]{4}");//Q4 2014
        regExpressions.add("[0-9] Q[1-4]");//2012 Q3

        for (String regExpression : regExpressions) {
            Pattern pattern = Pattern.compile(regExpression);//check string by all regexps. If date is found - return it
            Matcher matcher = pattern.matcher(inputString);
            if (matcher.find()) return matcher.group();
        }
        return "No date found";
    }
}

