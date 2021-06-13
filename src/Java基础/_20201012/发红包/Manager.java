package Java基础._20201012.发红包;

import java.util.ArrayList;

public class Manager extends User {
    public Manager() {
    }

    public Manager(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int totalMoney, int count) {
        ArrayList<Integer> redList = new ArrayList<>();
        int letfMoney = super.getMoney();
        if (totalMoney > letfMoney) {
            System.out.println("余额不足");
            return redList;
        }
        super.setMoney(letfMoney - totalMoney);
        int avg = totalMoney / count;
        int mod = totalMoney % count;
        for (int i = 0; i < count - 1; i++) {
            redList.add(avg);

        }
        int last = avg + mod;
        redList.add(last);
        return redList;
    }
}
