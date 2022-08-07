package manager.controller;

import manager.domain.Teacher;
import manager.service.TeacherService;

import java.util.Scanner;

public class TeacherController {
    private final Scanner sc = new Scanner(System.in);
    private TeacherService teacherService = new TeacherService();

    public void start() {
        teacherLoop:
        while (true) {
            System.out.println("********欢迎来到<老师>管理系统********");
            System.out.println("1.添加老师  2.删除老师  3.修改老师  4.查看老师  5.退出");
            System.out.println("请输入您的选择: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    addTeacher();
                    break;
                case 2:
                    deleteTeacher();
                    break;
                case 3:
                    editStudent();
                    break;
                case 4:
                    listTeachers();
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

    private void editStudent() {
        // 1. 输入老师ID
        String id = inputValidId(true);
        if (id == null) {
            return;
        }
        // 2. 输入老师姓名
        System.out.print("请输入老师姓名:");
        String name = sc.next();
        // 3. 输入老师年龄
        System.out.print("请输入老师年龄:");
        int age = sc.nextInt();
        // 3. 输入老师生日
        System.out.print("请输入老师生日:");
        String birthday = sc.next();
        boolean isEdit = teacherService.editTeacher(id, name, age, birthday);
        if (isEdit) {
            System.out.println("修改成功!");
        } else {
            System.out.println("修改失败!");
        }


    }

    private void deleteTeacher() {
        System.out.print("请输入老师ID:");
        String id = sc.next();
        boolean isExit = teacherService.isExist(id);
        if (!isExit) {
            System.out.println("抱歉，您输入的老师ID不存在!");
        }
        boolean isDelete = teacherService.deleteTeacher(id);
        if (isDelete) {
            System.out.println("删除成功!");
            listTeachers();
        } else {
            System.out.println("删除失败！");
        }
    }

    private String inputValidId(Boolean checkExist) {

        if (checkExist) {
            boolean isEmpty = teacherService.isEmpty();
            if (isEmpty) {
                System.out.println("暂无学生, 请先添加学生！");
                return null;
            }
        }
        String id;
        while (true) {
            // 1. 输入老师ID
            System.out.print("请输入老师ID:");
            id = sc.next();
            // 1.1. 判断ID是否存在
            boolean isExit = teacherService.isExist(id);
            String message = checkExist ? "老师ID不存在，请重新输入！" : "老师ID已存在，请重新输入！";
            if (checkExist) {
                if (isExit) {
                    break;
                } else {
                    System.out.println(message);
                }
            } else {
                if (!isExit) {
                    break;
                } else {
                    System.out.println(message);
                }

            }
        }
        return id;
    }

    public void listTeachers() {
        String json = teacherService.listTeachers();
        System.out.println(json);
    }

    public void addTeacher() {
        // 1. 输入老师ID
        String id = inputValidId(false);
        // 2. 输入老师姓名
        System.out.print("请输入老师姓名:");
        String name = sc.next();
        // 3. 输入老师年龄
        System.out.print("请输入老师年龄:");
        int age = sc.nextInt();
        // 3. 输入老师生日
        System.out.print("请输入老师生日:");
        String birthday = sc.next();
        Teacher teacher = new Teacher(id, name, age, birthday);
        boolean isAdded = teacherService.addTeacher(teacher);
        if (isAdded) {
            System.out.println("添加成功！");
            // list all the teachers.
            listTeachers();
        } else {
            System.out.println("添加失败!");
        }

    }
}

