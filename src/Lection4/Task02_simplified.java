package Lection4;

import org.apache.commons.lang.WordUtils;

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
public class Task02_simplified {
    public static void main(String[] args) throws IOException, AWTException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Press [ENTER] to generate random string");
        System.in.read();
        InputGenerator.generateRandomInputFromKeyboard(200);

        String inputString = reader.readLine();
        //using org.apache.commons.lang.WordUtils;   Yeah, cheats)
        System.out.println(WordUtils.capitalize(inputString));
    }
}
