package Java基础._反射;

import java.lang.reflect.Field;

public class Demo02 {
    public static void main(String[] args) throws Exception {
        Class Person = Person.class;
        Field[] fields = Person.getFields();//获取public修饰的成员变量
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println("___________________________________________________________________________");
        Field a = Person.getField("a");
        Person p = new Person();
        Object value = a.get(p);
        System.out.println(value);
        System.out.println("___________________________________________________________________________________________");

        Field d = Person.getDeclaredField("d");
        d.setAccessible(true);
        Object value2 = d.get(p);
        System.out.println(value2);
    }
}
