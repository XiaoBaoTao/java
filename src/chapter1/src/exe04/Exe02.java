package exe04;

import java.util.ArrayList;

public class Exe02 {
    public static void main(String[] args) {

        ArrayList<Integer> items = new ArrayList<Integer>();
        for (int i = 1949; i <= 2019; i++) {
            items.add(i);
        }
        for (int i : items) {
            if ((2019 - i) % 12 == 0) {
                System.out.printf("%s is pig year!%n", i);
            }

        }
    }
}
