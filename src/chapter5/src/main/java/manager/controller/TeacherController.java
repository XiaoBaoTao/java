package manager.controller;

import java.util.Scanner;

public class TeacherController {
    private final Scanner sc = new Scanner(System.in);

    public void start() {
        teacherLoop:
        while (true) {
            System.out.println("********欢迎来到<老师>管理系统********");
            System.out.println("1.添加老师  2.删除老师  3.修改老师  4.查看老师  5.退出");
            System.out.println("请输入您的选择: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("添加");
//                    this.addStudent();
                    break;
                case 2:
                    System.out.println("删除");
//                    this.deleteStudent();
                    break;
                case 3:
                    System.out.println("修改");
//                    this.editStudent();
                    break;
                case 4:
                    System.out.println("查看");
//                    this.listStudents();
                    break;
                case 5:
                    System.out.println("退出");
                    break teacherLoop;
                default:
                    System.out.println("您的输入有误，请重新输入！");
                    break;
            }
        }
    }
}

