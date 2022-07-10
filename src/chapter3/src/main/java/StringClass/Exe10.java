package StringClass;

import java.util.Scanner;

public class Exe10 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("please input some content: ");
            String input = sc.next();
            sb.append(input);
        }
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.reverse());
    }
}
