package Lection4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by bondar on 4/6/2015.
 * Считать с консоли 2 имени файла.
 Вывести во второй файл все числа, которые есть в первом файле.
 Числа выводить через пробел.
 */
public class Task04 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filePathRead = reader.readLine();
        String filePathWrite = reader.readLine();

        //read input file. We use class adn methods created in Lection2
        String inputString = Lection2.Additional_regexp_extractor.ReadWriteFile.readFileAsString(filePathRead);
        System.out.println("Input: " + inputString);
        String[] parsedInput = inputString.split("[ \\n\\r]+");
        String outputString = "";
        for (int i = 0; i < parsedInput.length; i++){
            if (parsedInput[i].matches("[0-9\\.]+")) outputString += parsedInput[i] + " ";
        }

        System.out.println("Output: " + outputString);
        //again we use methods from Lection2
        Lection2.Additional_regexp_extractor.ReadWriteFile.writeStringToFile(outputString, filePathWrite);
    }
}
