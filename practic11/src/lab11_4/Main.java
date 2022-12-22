package lab11_4;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args){
        int year;
        int month;
        int day;
        int hours;
        int minuts;

        Scanner in = new Scanner(System.in);
        System.out.println("enter year:");
        year = in.nextInt();
        System.out.println("enter month:");
        month = in.nextInt();
        System.out.println("enter day:");
        day = in.nextInt();
        System.out.println("enter hours:");
        hours = in.nextInt();
        System.out.println("enter minuts:");
        minuts = in.nextInt();

        Calendar calendar = new GregorianCalendar(year, month-1, day);
        calendar.set(Calendar.HOUR, hours);
        calendar.set(Calendar.MINUTE, minuts);

        Date date = calendar.getTime();

        SimpleDateFormat formatter = new SimpleDateFormat("<yyyy><MM><dd>\nHH:mm");

        System.out.println(formatter.format(date));

    }
}
