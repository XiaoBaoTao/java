package student;

public class Student {
    String name;
    int age;
    float height;

    public Student(String name, int age, float height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", height='" + height + '\'' +
                '}';
    }
}
