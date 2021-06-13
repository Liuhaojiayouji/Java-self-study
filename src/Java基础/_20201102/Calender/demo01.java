package Java基础._20201102.Calender;

import java.util.Calendar;
import java.util.Date;

public class demo01 {//日历类
    public static void main(String[] args) {
        demo001();
    }

    private static void demo001() {

        Calendar c = Calendar.getInstance();
        System.out.println(c);
        c.set(Calendar.YEAR,99999999);
        c.set(1999,9,2);
        c.add(Calendar.MARCH,99);
        int year = c.get(Calendar.YEAR);
        System.out.println(year);
        int mouth = c.get(Calendar.MARCH);
        System.out.println(mouth+1);
        int date = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(date);
        Date time = c.getTime();
        System.out.println(time);
    }
}
