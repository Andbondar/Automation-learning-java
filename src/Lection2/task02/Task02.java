package Lection2.task02;

import java.util.Date;

/**
 * Created by Student on 3/30/2015.
 */
public class Task02 {
    public static void main(String[] args) {
        String myDate = DateGenerator.getDate();
        String[] parts = myDate.split("-");
        int month = Integer.parseInt(parts[1]);
        switch (month){
            case 1:
            case 2:
            case 12:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Invalid month");
                break;
        }
    }
}
