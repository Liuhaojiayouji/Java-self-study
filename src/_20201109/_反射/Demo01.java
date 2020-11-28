package _20201109._反射;

public class Demo01 {
    public static void main(String[] args) throws Exception {
        Class aClass = Class.forName("_20201109._反射.Person");
        System.out.println(aClass);
        Class personClass = Person.class;
        System.out.println(personClass);
        Person p = new Person();
        Class aClass1 = p.getClass();
        System.out.println(aClass1);
        System.out.println(aClass == aClass1 ? (aClass == personClass ? (true) : false) : false);
    }
}
