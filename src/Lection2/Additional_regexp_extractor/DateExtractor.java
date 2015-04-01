package Lection2.Additional_regexp_extractor;

import java.lang.reflect.Array;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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

    //list of regular expressions used for string parsing
    public List<String> regExpressionsList(){
        List<String> regExpressions = new ArrayList<String>();
        regExpressions.add("[0-9]{2}-[0-9]{2}-[0-9]{4}");//DD-MM-YYYY, case 0
        regExpressions.add("[0-9]{2}-[A-Z]{3}-[0-9]{4}");//DD-MON-YYYY, case 1
        regExpressions.add("[0-9]{2}\\.[0-9]{2}\\.[0-9]{4}");//DD.MM.YYYY, case 2
        regExpressions.add("[A-Z]\\w* [0-9]{1,2}, [0-9]{4}");//March 12, 2011, case 3
        regExpressions.add("[0-9]{1}-\\w{3}-[0-9]{4}");//D-MON-YYYY, case 4
        regExpressions.add("[0-9]{1}-[0-9]{1}-[0-9]{4}");//D-M-YYYY, case 5
        regExpressions.add("[0-9]{2}\\.[0-9]{2}\\.[0-9]{2}");//DD.MM.YY, case 6
        regExpressions.add("[0-9]{1}\\.[0-9]{1}\\.[0-9]{4}");//D.M.YYYY, case 7
        regExpressions.add("[0-9]{1}\\.[0-9]{1}\\.[0-9]{2}");//D.M.YY, case 8
        regExpressions.add("[0-9]{4}-[0-9]{2}-[0-9]{2}");//YYYY-MM-DD, case 9
        regExpressions.add("[0-9]{4}-[0-9]{1}-[0-9]{2}");//YYYY-M-DD, case 10
        regExpressions.add("[0-9]{4}-[0-9]{2}-[0-9]{1}");//YYYY-MM-D, case 11
        regExpressions.add("[0-9]{4}-[0-9]{1}-[0-9]{1}");//YYYY-M-D, case 12
        regExpressions.add("[0-9]{2}-[0-9]{1}-[0-9]{4}");//DD-M-YYYY, case 13
        regExpressions.add("[0-9]{1}-[0-9]{2}-[0-9]{4}");//D-MM-YYYY, case 14

        return regExpressions;
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
        List<String> regExpressions = new DateExtractor().regExpressionsList();
        for (String regExpression : regExpressions) {
            Pattern pattern = Pattern.compile(regExpression);//check string by all regexps. If date is found - return it
            Matcher matcher = pattern.matcher(inputString);
            if (matcher.find()) return matcher.group();
        }
        return "No date found";
    }

    //Advanced Date extractor and unifier. Returns date
    public static Date getUnifiedDateFromString(String inputString) throws ParseException {
        Date foundDate = new Date();
        List<String> regExpressions = new DateExtractor().regExpressionsList();//use list of regexpressions from this class

        for (int i = 0; i < regExpressions.size(); i++){
            Pattern pattern = Pattern.compile(regExpressions.get(i));//check regexps where order of values is DD-MM-YYYY
            Matcher matcher = pattern.matcher(inputString);
            if (matcher.find()){
                DateFormat format = new SimpleDateFormat();
                switch (i){
                    case 0://DD-MM-YYYY
                        format = new SimpleDateFormat("dd-MM-yyyy");
                        break;
                    case 1://DD-MON-YYYY
                        format = new SimpleDateFormat("dd-MMM-yyyy");
                        break;
                    case 2://DD.MM.YYYY
                        format = new SimpleDateFormat("dd.MM.yyyy");
                        break;
                    case 3://March 12, 2011
                        format = new SimpleDateFormat("MMMMM dd, yyyy");
                        break;
                    case 4://D-MON-YYYY
                        format = new SimpleDateFormat("d-MMM-yyyy");
                        break;
                    case 5://D-M-YYYY
                        format = new SimpleDateFormat("d-M-yyyy");
                        break;
                    case 6://DD.MM.YY
                        format = new SimpleDateFormat("dd.MM.yy");
                        break;
                    case 7://D.M.YYYY
                        format = new SimpleDateFormat("d.M.yyyy");
                        break;
                    case 8://D.M.YY
                        format = new SimpleDateFormat("d.M.yy");
                        break;
                    case 9://YYYY-MM-DD
                        format =  new SimpleDateFormat("yyyy-MM-dd");
                        break;
                    case 10://YYYY-M-DD
                        format = new SimpleDateFormat("yyyy-M-dd");
                        break;
                    case 11://YYYY-MM-D
                        format = new SimpleDateFormat("yyyy-MM-d");
                        break;
                    case 12://YYYY-M-D
                        format = new SimpleDateFormat("yyyy-M-D");
                        break;
                    case 13://DD-M-YYYY
                        format = new SimpleDateFormat("dd-M-yyyy");
                        break;
                    case 14://D-MM-YYYY
                        format = new SimpleDateFormat("d-MM-yyyy");
                        break;
                }
                foundDate = format.parse(matcher.group());
                break;//if matcher is found - go outside of FOR loop and return foundDate
            }//if matcher.found()
        }//FOR loop

        return foundDate;
    }
}

