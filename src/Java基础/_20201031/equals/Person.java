package Java基础._20201031.equals;

import java.util.Objects;

public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
//    直接打印对象的地址值没有意义,
//    需要重写object类的tostring方法打印对象的属性(name , age)

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        Person p = (Person) obj;
        boolean b = this.name.equals(p.name) && this.age == p.age;
        return b;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public Person() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
