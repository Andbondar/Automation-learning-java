package Lection2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by User on 31.03.2015.
 */
public class task05 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0, add = 0;
        String userInput = "0";

        while (!("�����".equals(userInput))){
            add = Integer.parseInt(userInput);
            sum = sum+add;
            System.out.println(sum);
            userInput = reader.readLine();
        }
        System.out.println(sum);
    }
}
