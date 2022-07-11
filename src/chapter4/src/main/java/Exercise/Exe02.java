package Exercise;

import Student.Student;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Exe02 {
    public static void main(String[] args) {
        // 如果超过3个，会自动扩容
        int initSize = 3;
        ArrayList<Student> students = new ArrayList<>(initSize);
        Scanner sc = new Scanner(System.in);
        Random random = new Random(10);
        for (int i = 0; i < initSize; i++) {
            System.out.print("please input the name: ");
            String name = sc.next();
            int age = random.nextInt(100);
            students.add(new Student(name, age));
        }

        for (Student student : students) {
            System.out.println(student.toJson());
        }
    }
}
