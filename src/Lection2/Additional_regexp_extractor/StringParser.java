package Lection2.Additional_regexp_extractor;

import Lection2.task02.DateGenerator;//will be used as direct pth to class. Just for learning

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by bondar on 3/31/2015.
 */

// In this class string is generated and then parsed to extract the date in a specified format
public class StringParser {
    public static void main(String[] args) {
        String characterName = StringGenerator.GenerateOneName();//Random character name is generated
        String birthDate = Lection2.task02.DateGenerator.getDatewithInterval(1950, 1990);//random birth date is generated. Date generator from task2 is used

        String analyzedString = characterName + " was born " + birthDate;
        System.out.println(analyzedString);

        Pattern pattern = Pattern.compile("[0-9]{1,4}[.-][[0-9]\\w]{1,3}[.-][0-9]{1,4}");//pattern matches dates. Month can be specified either by number or by 3-letter name like 'JUN'
        Matcher matcher = pattern.matcher(analyzedString);
        if (matcher.find()) System.out.println("Date: " + matcher.group());
        else System.out.println("No date found");
    }
}

