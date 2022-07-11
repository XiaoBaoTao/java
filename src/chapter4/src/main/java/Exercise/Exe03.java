package Exercise;

import java.util.ArrayList;

public class Exe03 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Zoe");
        names.add("Josh");
        names.add("Ola");
        // #1 方法1
        for (String name : names) {
            System.out.println(name);
        }
        // #2 方法2
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
    }
}
