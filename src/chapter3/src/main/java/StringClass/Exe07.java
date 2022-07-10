package StringClass;

import java.util.Scanner;

public class Exe07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        System.out.println(word.replace("fuck", "****"));
        String[] strs = word.split("fuck");
        for (String str : strs) {
            System.out.println(str);
        }
    }
}
