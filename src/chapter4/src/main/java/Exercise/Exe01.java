package Exercise;

import Student.Student;

import java.util.Scanner;

public class Exe01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 数组的长度是固定的，集合的长度是可变的
        Student[] students = new Student[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("please input name: ");
            String name = sc.next();
            System.out.print("please input age: ");
            int age = sc.nextInt();
            Student student = new Student(name, age);
            students[i] = student;
        }
        for (Student student : students) {
            System.out.println(student.toString());
            System.out.println(student.toJson());
        }
    }
}
