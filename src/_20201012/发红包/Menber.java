package _20201012.发红包;

import java.util.ArrayList;
import java.util.Random;

public class Menber extends User {
    public Menber(String name, int money) {
        super(name, money);
    }

    public Menber() {
    }

    public void receive(ArrayList<Integer> List) {
        int index = new Random().nextInt(List.size());
        int delta = List.remove(index);
        int money = super.getMoney();
        super.setMoney(money + delta);
    }
}
