package Java基础._20201102.DataFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class demo02tesk {
    public static void main(String[] args) throws ParseException {
        demo01();
    }

    private static void demo01() throws ParseException {
        Scanner scanner=new Scanner(System.in);
        System.out.println("青输入您得到出生日期,格式为yyyy-MM-dd");
        String next = scanner.next();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date birehdayDate = sdf.parse(next);
        long birtime = birehdayDate.getTime();
        long todayTime =new Date().getTime();
        System.out.println((todayTime-birtime)/(1000*60*60*24));
    }
}
