package _20201031.equals;

public class equals {
    public static void main(String[] args) {
        Person p1 = new Person("1", 18);
        Person p2 = new Person("1", 18);
//        p1=p2;
        System.out.println(p1.equals(p2));
        System.out.println(p1);
        System.out.println(p2 );
    }
}
