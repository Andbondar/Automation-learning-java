package Lection3.Task03;

import java.util.Arrays;

/**
 * Created by bondar on 4/1/2015.
 *
 * 3. Поиск элементов
 1. Создайте массив из 12 случайных целых чисел из отрезка [-15;15].
 2. Определить  какой элемент является в этом массиве максимальным и сообщите  индекс его последнего вхождения в массив.
 3. Вывести результат на экран.
 */
public class Task03 {
    public static void main(String[] args) {
        int arraySize = 12, minValue = -15, maxValue = 15;
        int[] myArray = new int[arraySize];

        myArray = ArrayGenerator.generateArray(arraySize, minValue, maxValue);
        System.out.println("Array: " + Arrays.toString(myArray));

        int actualMax = minValue;
        int actualMaxIndex = 0;
        for (int i = 0; i < myArray.length; i++){
            if (myArray[i] >= actualMax) {
                actualMax = myArray[i];
                actualMaxIndex = i;
            }
        }

        System.out.println("Maximum value: " + actualMax);
        System.out.println("Index:         " + actualMaxIndex);
    }
}
