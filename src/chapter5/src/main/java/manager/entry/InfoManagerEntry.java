package manager.entry;

import manager.controller.StudentController;

import java.util.Scanner;

public class InfoManagerEntry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("********欢迎来到信息管理系统********");
            System.out.println("1.学生管理  2.老师管理  3. 退出");
            System.out.println("请输入您的选择: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("学生");
                    // 学生管理的处理
                    StudentController studentController = new StudentController();
                    studentController.start();
                    break;
                case 2:
                    System.out.println("老师");
                    break;
                case 3:
                    System.out.println("退出");
                    System.exit(0);
                    break;
                default:
                    System.out.println("您的输入有误，请重新输入！");
                    break;
            }
        }
    }
}
