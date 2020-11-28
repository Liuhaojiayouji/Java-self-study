package _20201031.ToString;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        Person p = new Person("张三", 18);
        String s = p.toString();
        System.out.println(s);
        System.out.println(p);


        Random r = new Random();
        System.out.println(r);

        Scanner sc = new Scanner(System.in);
        System.out.println(sc);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        System.out.println(list);
    }
}
