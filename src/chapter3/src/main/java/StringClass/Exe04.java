package StringClass;

import java.util.Scanner;

public class Exe04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("please input a string: ");
        String input = sc.next();
        // #1 loop the string
        for (int i = 0; i < input.length(); i++) {
            System.out.println(input.charAt(i));
        }
        // #2 loop the string
        System.out.println("#2*************");
        for (char ch: input.toCharArray()) {
            System.out.println(ch);
        }
    }
}
