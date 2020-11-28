package _20201012.抽象1;

public class Zi extends Fu {
    @Override
    public void eat() {
        System.out.println("吃饭饭");
    }

    public Zi() {
        System.out.println("子类构造方法执行");
    }
}
