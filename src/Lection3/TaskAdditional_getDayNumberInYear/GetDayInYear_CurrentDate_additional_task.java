package Lection3.TaskAdditional_getDayNumberInYear;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by Student on 4/1/2015.
 */
public class GetDayInYear_CurrentDate_additional_task {
    public static void main(String[] args) {
        Date currentDate = new Date();
        System.out.println("Current date: " + currentDate.toString());

        Calendar calendar = Calendar.getInstance();
        int dayOfYear = calendar.get(Calendar.DAY_OF_YEAR);
        System.out.println("Day of year: " + dayOfYear);

        //array with current date {day_in_month, month, year}. Month count is started from 0
        int[] dateArray = {Calendar.getInstance().get(Calendar.DAY_OF_MONTH), Calendar.getInstance().get(Calendar.MONTH), Calendar.getInstance().get(Calendar.YEAR)};

        int dayNumberCalculated = 0;
        //add day counts for all previous months
        for (int i = 0; i < (dateArray[1]); i++){
            Calendar mycal = new GregorianCalendar(dateArray[2], i, 1);
            int daysInMonth = mycal.getActualMaximum(Calendar.DAY_OF_MONTH);
            dayNumberCalculated += daysInMonth;
        }
        dayNumberCalculated += dateArray[0];//add day number for current month

        System.out.println("Calculated result: " + dayNumberCalculated);
    }
}
