package Lection3.Task02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by bondar on 4/1/2015.
 *
 * 2. Исключение элементов
 1. Ввести с клавиатуры 10 чисел и записать их в массив.
 2. Исключить из массива все одинаковые элементы массива.
 3. Вывести результат на экран.
 */
public class task02 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] myArray = new int[10];
        for (int i = 0; i < 10; i++){
            myArray[i] = Integer.parseInt(reader.readLine());
        }
        System.out.println("Input array: " + Arrays.toString(myArray));

        int[] newArray = RemoveDuplicates.removeDuplicates(myArray);
        System.out.println("Output array: " + Arrays.toString(newArray));
    }
}
