package Lection3.Task04;

import Lection3.Task03.ArrayGenerator;

import java.util.Arrays;

/**
 * Created by bondar on 4/1/2015.
 *
 * 4. Матрица
 1. Создать квадратичную матрицу 5/5 и заполнить ее  случайными числами.
 2. Найти сумму положительных элементов матрицы.
 3. Вывести результат на экран.
 */
public class task04 {
    public static void main(String[] args) {
        int[][] randomMatrix = ArrayGenerator.generateSquareMatrixBySize(5);
        System.out.println("Randomly generated matrix:");
        System.out.println(Arrays.deepToString(randomMatrix));
        System.out.println("In matrix view:");

        int sum = 0;
        for (int i = 0; i < randomMatrix.length; i++){
            for (int j = 0; j < randomMatrix.length; j++){
                if (randomMatrix[i][j]>0) sum += randomMatrix[i][j];
                System.out.print(randomMatrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Sum of positive elements: " + sum);
    }
}
