package student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("zoe", 32, 3.25f, true);
        System.out.println(student);
        student.setMarried(false);
        System.out.println(student.isMarried());
    }
}
