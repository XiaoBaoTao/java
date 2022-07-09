package exe03;

import java.util.Scanner;

public class SwitchExe {
    public static void main(String[] args) {
        System.out.println("please input a number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        switch (number) {
            case 1 -> System.out.println("one");
            case 2 -> System.out.println("two");
            default -> System.out.println("default");
        }
    }
}
