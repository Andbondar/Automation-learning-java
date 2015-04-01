package Lection3.TaskAdditional_getDayNumberInYear;

import Lection2.Additional_regexp_extractor.DateExtractor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by Student on 4/1/2015.
 */
public class GetDayNumberFromInputString {
    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputString = reader.readLine();

        Date inputDate = DateExtractor.getUnifiedDateFromString(inputString);
        System.out.println("Extracted date: " + DateExtractor.getDateFromString(inputString));
        int[] dateArray = {inputDate.getDay(), inputDate.getMonth(), inputDate.getYear()};
        int dayNumberCalculated = 0;
        //add day counts for all previous months
        for (int i = 0; i < (dateArray[1]); i++){
            Calendar mycal = new GregorianCalendar(dateArray[2], i, 1);
            int daysInMonth = mycal.getActualMaximum(Calendar.DAY_OF_MONTH);
            dayNumberCalculated += daysInMonth;
        }
        dayNumberCalculated += dateArray[0];//add day number for current month

        if (!"No date found".equals(DateExtractor.getDateFromString(inputString))) System.out.println("Calculated day in year: " + dayNumberCalculated);
        else System.out.println("Calculated day in year: cannot be extracted");


    }
}
