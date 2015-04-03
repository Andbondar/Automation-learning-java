package Lection4;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Random;

/**
 * Created by bondar on 4/3/2015.
 */
public class InputGenerator {
    public static void main(String[] args) {

    }

    public static void generateRandomInputFromKeyboard(int length) throws AWTException {
        Robot robot = new Robot();

        int[] possibleKeys = new int[]{
                KeyEvent.VK_SPACE,
                //numbers
                KeyEvent.VK_0, KeyEvent.VK_1, KeyEvent.VK_2, KeyEvent.VK_3, KeyEvent.VK_4, KeyEvent.VK_5, KeyEvent.VK_6, KeyEvent.VK_7, KeyEvent.VK_8, KeyEvent.VK_9, KeyEvent.VK_0,
                KeyEvent.VK_A,
                KeyEvent.VK_PERIOD
        };

        for (int i = 0; i < length; i++) {
            Random rand = new Random();
            int key = rand.nextInt(possibleKeys.length);
            int keyCode = possibleKeys[key];

            robot.keyPress(keyCode);   // Simulating press of a key
            robot.keyRelease(keyCode); // Simulating release of a key
        }

        //end string with [ENTER]
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }
}
