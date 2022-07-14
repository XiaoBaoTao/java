package manager.controller;

import manager.domain.Student;
import manager.service.StudentService;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentController {

    private final StudentService studentService = new StudentService();
    private final Scanner sc = new Scanner(System.in);

    public void start() {
        studentLoop:
        while (true) {
            System.out.println("********欢迎来到学生管理系统********");
            System.out.println("1.添加学生  2.删除学生  3.修改学生  4.查看学生  5.退出");
            System.out.println("请输入您的选择: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("添加");
                    this.addStudent();
                    break;
                case 2:
                    System.out.println("删除");
                    this.deleteStudent();
                    break;
                case 3:
                    System.out.println("修改");
                    this.editStudent();
                    break;
                case 4:
                    System.out.println("查看");
                    this.listStudents();
                    break;
                case 5:
                    System.out.println("退出");
                    break studentLoop;
                default:
                    System.out.println("您的输入有误，请重新输入！");
                    break;
            }
        }
    }

    private void editStudent() {
        String id = ensureValidId();
        System.out.println("请输入学生姓名: ");
        String name = sc.next();
        System.out.println("请输入学生年龄: ");
        int age = sc.nextInt();
        System.out.println("请输入学生生日: ");
        String birthday = sc.next();
        boolean isEdited = studentService.editStudent(id, name, age, birthday);
        if (isEdited){
            System.out.println("修改成功！");
        }else {
            System.out.println("修改失败！");
        }

    }

    public void deleteStudent() {
        String id = ensureValidId();
        boolean isDelete = studentService.deleteStudent(id);
        if (isDelete) {
            System.out.println("删除成功!");
        } else {
            System.out.println("删除失败!");
        }
        this.listStudents();
    }

    private String ensureValidId() {
        String id;
        while (true) {
            System.out.println("请输入学生ID: ");
            id = sc.next();
            if (!studentService.isExist(id)) {
                System.out.println("您输入的学号不存在！请重新输入");
            } else {
                break;
            }
        }
        return id;
    }

    public void listStudents() {
        StudentService studentService = new StudentService();
        ArrayList<Student> students = studentService.listStudents();
        if (students.size() == 0) {
            System.out.println("暂时无学生");
            return;
        }
        for (Student student : students) {
            System.out.println(student.toString());
        }
    }

    public void addStudent() {
        // 1. 键盘接收学生信息
        String id;
        while (true) {
            System.out.println("请输入学生ID: ");
            id = sc.next();
            if (studentService.isExist(id)) {
                System.out.println("您输入的学号已经存在！请重新输入");
            } else {
                break;
            }
        }

        System.out.println("请输入学生姓名: ");
        String name = sc.next();
        System.out.println("请输入学生年龄: ");
        int age = sc.nextInt();
        System.out.println("请输入学生生日: ");
        String birthday = sc.next();
        // 2. 创建学生对象
        Student student = new Student(id, name, age, birthday);
        // 3. 将学生对象传递给Student Service，使用addStudent方法
        boolean isAdded = studentService.addStudent(student);
        if (isAdded) {
            System.out.println("添加成功！");
        } else {
            System.out.println("添加失败！");
        }
    }
}
