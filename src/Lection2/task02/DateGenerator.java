package Lection2.task02;
import java.util.GregorianCalendar;
import static java.util.Calendar.*;

/**
 * Created by Student on 3/30/2015.
 */
//Forked from StackOverflow http://stackoverflow.com/questions/3985392/generate-random-date-of-birth
public class DateGenerator {
        public static void main(String[] args) {

            GregorianCalendar gc = new GregorianCalendar();
            int year = randBetween(1900, 2015);
            gc.set(gc.YEAR, year);
            int dayOfYear = randBetween(1, gc.getActualMaximum(DAY_OF_YEAR));
            gc.set(gc.DAY_OF_YEAR, dayOfYear);
            System.out.println(gc.get(gc.YEAR) + "-" + gc.get(gc.MONTH) + "-" + gc.get(gc.DAY_OF_MONTH));
        }

        public static int randBetween(int start, int end) {
            return start + (int)Math.round(Math.random() * (end - start));
        }

        public static String getDate() {
            GregorianCalendar gc = new GregorianCalendar();
            int year = randBetween(1900, 2015);
            gc.set(gc.YEAR, year);
            int dayOfYear = randBetween(1, gc.getActualMaximum(DAY_OF_YEAR));
            gc.set(gc.DAY_OF_YEAR, dayOfYear);
            return(gc.get(YEAR) + "-" + gc.get(gc.MONTH) + "-" + gc.get(gc.DAY_OF_MONTH));
        }

        public static String getDatewithInterval(int startYear, int endYear) {//generate random date in the specified year interval
            GregorianCalendar gc = new GregorianCalendar();
            int year = randBetween(startYear, endYear);
            gc.set(gc.YEAR, year);
            int dayOfYear = randBetween(1, gc.getActualMaximum(DAY_OF_YEAR));
            gc.set(gc.DAY_OF_YEAR, dayOfYear);
            return(gc.get(YEAR) + "-" + gc.get(gc.MONTH) + "-" + gc.get(gc.DAY_OF_MONTH));
        }

}
