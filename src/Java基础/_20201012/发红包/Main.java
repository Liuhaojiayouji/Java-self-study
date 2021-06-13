package Java基础._20201012.发红包;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("群主", 100);

        Menber one = new Menber("成员A", 0);
        Menber two = new Menber("成员B", 0);
        Menber three = new Menber("成员C", 0);


        manager.show(); // 100
        one.show(); // 0
        two.show(); // 0
        three.show(); // 0
        System.out.println("===============");

        ArrayList<Integer> redList = manager.send(20, 3);
        one.receive(redList);
        two.receive(redList);
        three.receive(redList);
        manager.show();
        one.show();
        two.show();
        three.show();
    }
}
