package Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StudentManagement {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("--------欢迎来到学生管理系统--------");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查看全部学生");
            System.out.println("5.退出");
            System.out.print("请输入你的选择:");
            int command = sc.nextInt();
            switch (command) {
                case 1:
                    addUser(students);
                    break;
                case 2:
                    deleteUser(students);
                    break;
                case 3:
                    editUser(students);
                case 4:
                    showAllUser(students);
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("输入错误，请输入1-5数字");
                    break;
            }
        }
    }


    public static void addUser(ArrayList<Student> students) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学号:");
        String userId = sc.next();
        System.out.println("请输入姓名:");
        String username = sc.next();
        System.out.println("请输入生日:");
        String birthday = sc.next();
        for (Student stu : students) {
            if (stu.getUserId().equals(userId)) {
                System.out.println("用户已经存在!");
                return;
            }
        }
        Student student = new Student(userId, username, birthday);
        students.add(student);
    }

    public static void deleteUser(ArrayList<Student> students) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的学号：");
        String userId = sc.next();
        boolean deleted = students.removeIf(x -> x.getUserId().equals(userId));
        if (deleted) {
            System.out.println("删除成功!");
        } else {
            System.out.println("删除失败，用户不存在!");
        }
    }

    public static void showAllUser(ArrayList<Student> students) {
        String[] headers = {"用户ID", "用户名", "生日"};
        System.out.println(String.join("    ", headers));
        for (Student student : students) {
            System.out.println(student.info());
        }
    }

    public static void editUser(ArrayList<Student> students) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改的学号：");
        String userId = sc.next();
        List<Student> filtered = students.stream()
                .filter(s -> s.getUserId().equals(userId))
                .collect(Collectors.toList());
        if (filtered.isEmpty()) {
            System.out.println("用户不存在");
            return;
        }
        for (Student student : filtered) {
            if (userId.equals(student.getUserId())) {
                System.out.println("请输入姓名:");
                student.setUsername(sc.next());
                System.out.println("请输入生日:");
                student.setBirthday(sc.next());
                System.out.println("修改成功!");
            }
        }

    }
}
