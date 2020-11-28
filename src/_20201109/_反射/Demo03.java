package _20201109._反射;

import java.lang.reflect.Constructor;

public class Demo03 {
    public static void main(String[] args) throws Exception {
        Class personClass = Person.class;
        Constructor constructor = personClass.getConstructor(String.class, int.class);
        System.out.println(constructor);
        Object person = constructor.newInstance("张三", 23);
        System.out.println(person);
        System.out.println("_————————————————————————————————————————————————————————————————————————————————————————————————————————————");
        Constructor constructor1 = personClass.getConstructor();
        Object person1 = constructor1.newInstance();
        System.out.println(person1);
    }
}
