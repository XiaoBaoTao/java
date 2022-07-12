package manager.controller;

import java.util.Scanner;

public class StudentController {


    public void start() {
        Scanner sc = new Scanner(System.in);
        studentLoop:
        while (true) {
            System.out.println("********欢迎来到学生管理系统********");
            System.out.println("1.添加学生  2.删除学生  3.修改学生  4.查看学生  5.退出");
            System.out.println("请输入您的选择: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("添加");
                    break;
                case 2:
                    System.out.println("删除");
                    break;
                case 3:
                    System.out.println("修改");
                    break;
                case 4:
                    System.out.println("查看");
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
}
