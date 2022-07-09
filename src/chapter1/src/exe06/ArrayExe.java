package exe06;

import java.util.Arrays;

public class ArrayExe {
    public static void main(String[] args) {
        int[] items = {12, 23, 434}; // 静态初始化
        String[] names = {"zoe", "Pi", "Zh"};
        String[] records = new String[5]; // 动态初始化
        for (int item : items) {
            System.out.println(item);
        }
        System.out.println(Arrays.toString(items));
        System.out.println(Arrays.toString(names));

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
            records[i] = names[i];
        }
        int result = Arrays.binarySearch(items, 434);
        System.out.println(result);

        int maxValue = Arrays.stream(items).max().getAsInt();
        int sumValue = Arrays.stream(items).sum();
        System.out.println("sum is " + sumValue);
        System.out.printf("the max value of %s is %s \n", Arrays.toString(items), maxValue);
        System.out.println(Arrays.toString(records));
    }
}
