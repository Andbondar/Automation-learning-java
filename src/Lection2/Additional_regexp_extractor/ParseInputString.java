package Lection2.Additional_regexp_extractor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by bondar on 3/31/2015.
 *
 * Уровень 1
 - ввести исходные данные с помощью консоли в программу (кусок текста, в котром встречается дата (желательно в разных строковых форматах , т.е 2012-02-03, 22-Mar-2014, 2012.02.02 ))
 - используя регулярные выражения найти дату в тексте и преобразовать у единый фомат (на ваш выбор)
 - вывести полученный текст на консоль

 Уровень 2
 - считать данные из текстового файла(кусок текста, в котром встречается дата (желательно в разных строковых форматах , т.е 2012-02-03, 22-Mar-2014, 2012.02.02 ))
 - используя регулярные выражения найти дату в тексте и преобразовать у единый фомат (на ваш выбор)
 - вывести в новый текстовый файл
 */
public class ParseInputString {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputString = reader.readLine();
        String extractedDate = StringParser.extractDate(inputString);
        System.out.println("Date: " + extractedDate);
    }
}
