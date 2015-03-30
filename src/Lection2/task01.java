package Lection2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Student on 3/30/2015.
 */
public class task01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] myArray = new int[4];

        for (int i = 0; i < 4; i++){
            myArray[i] = Integer.parseInt(reader.readLine());
        }

        Arrays.sort(myArray);
        System.out.println("Max = " + myArray[myArray.length-1]);
    }
}
