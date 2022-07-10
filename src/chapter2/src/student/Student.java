package student;

public class Student {
    String name;
    int age;
    float height;

    private boolean isMarried = false;

    public Student(String name, int age, float height, boolean isMarried) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.isMarried = isMarried;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", isMarried=" + isMarried +
                '}';
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }

    public boolean isMarried() {
        return this.isMarried;
    }
}
