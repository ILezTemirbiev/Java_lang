package lab11_2;

import java.util.Scanner;
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
        int seconds;

        Date date1 = new Date();

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

        System.out.println("enter seconds:");
        seconds = in.nextInt();

        Calendar calendar = new GregorianCalendar(year, month-1, day, hours, minuts, seconds);
        Date date2 = calendar.getTime();

        System.out.println(date1);
        System.out.println(date2);

        System.out.println(date1.equals(date2));
    }
}
