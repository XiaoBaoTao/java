import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner sc = new Scanner(System.in);
        System.out.println("please input your name: ");
        if (sc.hasNext()) {
            System.out.printf("You just inputted: %s", sc.next());
        }
    }
}
