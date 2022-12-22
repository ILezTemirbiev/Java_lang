package lab11_1;

import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main{
    public static void main(String[] args) {
        String name = "Ivanov";

        Calendar calendar = new GregorianCalendar(2022, Calendar.SEPTEMBER, 1);
        calendar.set(Calendar.HOUR, 13);
        calendar.set(Calendar.MINUTE, 00);
        calendar.set(Calendar.SECOND, 10);

        Date date1 = calendar.getTime();
        Date date2 = new Date();

        System.out.println("developer: " + name);
        System.out.println("time of receipt of the task: " + date1);
        System.out.println("task submission time: " + date2);
    }
}
