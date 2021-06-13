package Java基础.练习;

public class Student {
    public String name;
    public int id;

    private int stuid;

    public int getStuid() {
        return stuid;
    }

    public void setStuid(int stuid) {
        this.stuid = stuid;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Student() {
    }
}
