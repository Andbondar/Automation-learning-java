package Lection3;

import Lection3.Task03.ArrayGenerator;

import java.util.Arrays;

/**
 * Created by bondar on 4/1/2015.
 *
 * 5. Реализуйте примеры использования следующих методов
 1. Arrays.fill()
 2. Arrays.equals()
 3. System.arraycopy()
 4. Arrays.sort()
 */
public class task05 {
    public static void main(String[] args) {
        int arr[] = new int[] {1, 6, 3, 2, 9};
        System.out.println(Arrays.toString(arr));

        Arrays.fill(arr, 12);
        System.out.println(Arrays.toString(arr));

        int[] myArray = new int[8];
        Arrays.fill(myArray, 18);

        if (Arrays.equals(arr, myArray)) System.out.println("Arrays are equal");//checks if arrays are equal
        else System.out.println("Arrays are not equal");

        System.arraycopy(myArray, 2, arr, 2, 2);//copies 2 elements from myArray to arr
        System.out.println(Arrays.toString(arr));

        System.out.println();
        int[] arrayForSorting = ArrayGenerator.generateArray(10, -10, 10);
        System.out.println(Arrays.toString(arrayForSorting));
        Arrays.sort(arrayForSorting);//sort randomly generated array
        System.out.println(Arrays.toString(arrayForSorting));

    }
}
