package Lection3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by bondar on 4/1/2015.
 *
 * Массив из чисел в обратном порядке 10 points
 1. Ввести с клавиатуры 10 чисел и записать их в массив.
 2. Расположить элементы массива в обратном порядке.
 3. Вывести результат на экран, каждое значение выводить с новой строки.
 */

public class task01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] myArray = new int[10];
        for (int i = 0; i < 10; i++){
            myArray[i] = Integer.parseInt(reader.readLine());
        }
        System.out.println("Input array: " + Arrays.toString(myArray));
        System.out.println();
        System.out.println("Output: ");

        int[] newArray = new int[myArray.length];
        for (int i = 0; i < newArray.length; i++){
            newArray[i] = myArray[myArray.length-1-i];
            System.out.println(newArray[i]);
        }
    }
}
