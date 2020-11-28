package _20201115.练习;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.Arrays;

public class Demo01 {
    public static void main(String[] args) throws Exception {
        Student student = new Student();
        Class clazz1 = student.getClass();
        Class clazz2 = Student.class;
        Class clazz3 = Class.forName("_20201115.练习.Student");
        Constructor con1 = clazz1.getConstructor();
        Constructor con2 = clazz1.getConstructor(String.class, int.class);
        Student student1 = (Student) con2.newInstance("自行车", 12);
        System.out.println(student1);
        Object o = con1.newInstance();
        Field name = clazz1.getField("name");
        name.set(o, "张三");
        System.out.println(name.get(o));
        Field[] fields = clazz1.getFields();
        for (int i = 0; i < fields.length; i++) {
            System.out.println(Arrays.toString(fields));
        }
        for (Field field : fields) {
            System.out.println();
        }
    }
}
