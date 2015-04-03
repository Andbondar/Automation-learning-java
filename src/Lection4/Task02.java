package Lection4;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by bondar on 4/3/2015.
 *
 * Написать программу, которая вводит с клавиатуры строку текста.
 Программа заменяет в тексте первые буквы всех слов на заглавные.
 Вывести результат на экран.
 */
public class Task02 {
    public static void main(String[] args) throws AWTException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Press [ENTER] to generate random string");
        System.in.read();
        InputGenerator.generateRandomInputFromKeyboard(200);

        String inputString = reader.readLine();
        String[] splittedString =  inputString.split(" +");

        System.out.println();
        for (String aSplittedString : splittedString) {
            System.out.print(StringParser.firstLetterInWordToUpperCase(aSplittedString) + " ");
        }
        System.out.println();

    }
}
