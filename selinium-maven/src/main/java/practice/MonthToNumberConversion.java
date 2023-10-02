package practice;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

public class MonthToNumberConversion {
    public static void main(String[] args) throws ParseException {
        // Input month name as a string
        String monthName = "September"; // Replace with your desired month name

        // Create a SimpleDateFormat object to parse month names
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM");
        // Parse the month name into a Date object
        Date date = dateFormat.parse(monthName);

        // Convert the Date object into a month number (1-12)
        int monthNumber = date.getMonth() + 1; // Adding 1 because month numbers are 0-based

        // Print the month number
        System.out.println("Month Name: " + monthName);
        System.out.println("Month Number: " + monthNumber);

    }
}
