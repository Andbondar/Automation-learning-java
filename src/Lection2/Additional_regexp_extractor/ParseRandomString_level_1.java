package Lection2.Additional_regexp_extractor;

import static Lection2.Additional_regexp_extractor.DateExtractor.extractDate;

/**
 * Created by bondar on 3/31/2015.
 */
public class ParseRandomString_level_1 {
    public static void main(String[] args) {
        String characterName = CharNameGenerator.GenerateOneName();//Random character name is generated
        String birthDate = Lection2.task02.DateGenerator.getDateWithInterval(1950, 1990);//random birth date is generated. Date generator from task2 is used

        String analyzedString = characterName + " was born " + birthDate;
        System.out.println(analyzedString);
        String extractedDate = extractDate(analyzedString);//date is extracted using regexp specific for this string
        System.out.println("Date: " + extractedDate);
    }
}
