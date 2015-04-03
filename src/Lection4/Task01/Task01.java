package Lection4.Task01;

import Lection4.InputGenerator;
import Lection4.StringParser;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by bondar on 4/3/2015.
 *
 * Написать программу, которая вводит с клавиатуры строку текста.
 Выделить из текста только целые числа и поместить их в массив.
 Вывести массив на экран.
 */
public class Task01 {
    public static void main(String[] args) throws IOException, AWTException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Press [ENTER] to generate random string");
        System.in.read();
        InputGenerator.generateRandomInputFromKeyboard(25);

        String inputString = reader.readLine();
        System.out.println(Arrays.toString(StringParser.extractNumbersFromString(inputString)));

    }
}
