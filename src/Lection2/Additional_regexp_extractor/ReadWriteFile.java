package Lection2.Additional_regexp_extractor;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by bondar on 4/2/2015.
 */
public class ReadWriteFile {
    public static void main(String[] args) {

    }

    //solution here http://stackoverflow.com/questions/1656797/how-to-read-a-file-into-string-in-java
    public static String readFileAsString(String filePath) throws IOException {
        StringBuilder fileData = new StringBuilder();
        BufferedReader reader = new BufferedReader(
                new FileReader(filePath));
        char[] buf = new char[1024];
        int numRead=0;
        while((numRead=reader.read(buf)) != -1){
            String readData = String.valueOf(buf, 0, numRead);
            fileData.append(readData);
        }
        reader.close();
        return fileData.toString();
    }

    public static Date extractDateFromFile(String filePath) throws IOException, ParseException {
        String inputString = readFileAsString(filePath);
        return DateExtractor.getUnifiedDateFromString(inputString);
    }

    public static String extractStringDateFromFile(String filePath) throws IOException {
        String inputString = readFileAsString(filePath);
        return DateExtractor.getDateFromString(inputString);
    }

    public static void writeStringToFile(String inputString, String filePath) throws FileNotFoundException {
        PrintWriter out = new PrintWriter(filePath);
        out.println(inputString);
        out.close();
        System.out.println("Data was written to file " + filePath);
    }
}
