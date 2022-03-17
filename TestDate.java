import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;

class TestDate {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please fill a day (1-31) :");
        int day = sc.nextInt();
        System.out.println("Please fill a month (1-12) :");
        int month = sc.nextInt();
        System.out.println("Please fill a year :");
        int year = sc.nextInt();
        sc.close();
        // int day = 22;
        // int month = 4;
        // int year = 2019;

        // TODO : your code after this line
        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
        try {
        Date date = sdf.parse(month + "-" + day + "-" + year);
        System.out.println("The date is : " + sdf.format(date));
        } catch (ParseException e) {
            e.printStackTrace();
        }
         
        Calendar calendar = new GregorianCalendar();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month - 1);  // Months start at 0 (Jan = 0, Dec = 11) 
        calendar.set(Calendar.DAY_OF_MONTH, day);
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        System.out.println("The day of week is : " + dayOfWeek);

    }
}