package Lection2.Additional_regexp_extractor;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by bondar on 4/2/2015.
 *
 *
 Уровень 2
 - считать данные из текстового файла(кусок текста, в котром встречается дата (желательно в разных строковых форматах , т.е 2012-02-03, 22-Mar-2014, 2012.02.02 ))
 - используя регулярные выражения найти дату в тексте и преобразовать у единый фомат (на ваш выбор)
 - вывести в новый текстовый файл
 */


public class ParseInputFile_level_2 {
    public static void main(String[] args) throws IOException, ParseException {
        String filePathRead = "D:\\date.txt";
        String filePathWrite = "D:\\testwriting.txt";

        String extractedDate = ReadWriteFile.extractStringDateFromFile(filePathRead);
        Date extractedDate_type2 = ReadWriteFile.extractDateFromFile(filePathRead);

        DateFormat dateFormat = new SimpleDateFormat("E, MMM dd yyyy");
        System.out.println("Date(non-formatted): " + extractedDate);
        if (!"No date found".equals(extractedDate)) System.out.println("Date(unified format): " + dateFormat.format(extractedDate_type2));

        if (!"No date found".equals(extractedDate)) ReadWriteFile.writeStringToFile("Date(unified format): " + dateFormat.format(extractedDate_type2), filePathWrite);
        else ReadWriteFile.writeStringToFile("Date cannot be extracted", filePathWrite);
    }
}
