package StringClass;


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

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public float getHeight() {
        return height;
    }

    public boolean isMarried() {
        return this.isMarried;
    }
}
