package StringClass;

import java.util.Scanner;

public class Exe03 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            boolean success = login();
            if (success) {
                System.out.println("Login Success!");
                break;
            } else {
                System.out.println("Login Failed! You have " + (2 - i) + " times left!");
            }
        }
    }


    public static boolean login() {
        System.out.println("please input your username: ");
        Scanner sc = new Scanner(System.in);
        String username = sc.next();
        System.out.println("please input your password: ");
        String password = sc.next();
        return username.equals("zoe") && password.equals("123");
    }
}
