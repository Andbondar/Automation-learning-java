package Lection3.Task03;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by bondar on 4/1/2015.
 */
public class ArrayGenerator {
    public static void main(String[] args) {

    }

    public static int[] generateArray (int size, int min, int max){
        Random generator = new Random();
        int[] generatedArray = new int[size];

        for (int i = 0; i < generatedArray.length; i++){
            generatedArray[i] = generator.nextInt((max - min) + 1) + min;//interval conversion. +1 is used to include max value
        }
        return Arrays.copyOf(generatedArray, size);
    }

}
