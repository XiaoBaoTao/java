package exe06;

import java.util.Arrays;

public class ArrayExe {
    public static void main(String[] args) {
        System.out.println("Hello?");
        int[] items = {12, 23, 434};
        String[] names = {"zoe", "Pi", "Zh"};
        for (int item : items) {
            System.out.println(item);
        }
        System.out.println(Arrays.toString(items));
        System.out.println(Arrays.toString(names));
    }
}
