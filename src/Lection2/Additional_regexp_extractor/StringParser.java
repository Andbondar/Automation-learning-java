package Lection2.Additional_regexp_extractor;

import Lection2.task02.DateGenerator;

/**
 * Created by bondar on 3/31/2015.
 */
public class StringParser {
    public static void main(String[] args) {
        String characterName = StringGenerator.GenerateOneName();//Random character name is generated
        String birthDate = Lection2.task02.DateGenerator.getDatewithInterval(1950, 1990);//random birth date is generated
        System.out.println(characterName + " was born " + birthDate);
    }
}

