package Java基础._20201102.DataFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo01DateFormat {
    public static void main(String[] args) throws ParseException {
       // demo01();
        demo02();

    }

    private static void demo02() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parse = sdf.parse("2088-08-08 17:01:10");
        System.out.println(parse);
    }

    private static void demo01() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        String format = sdf.format(date);
        System.out.println(date);
        System.out.println(format);
    }
}
