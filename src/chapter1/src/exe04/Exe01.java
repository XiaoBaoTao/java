package exe04;

import java.util.ArrayList;
import java.util.Iterator;

public class Exe01 {
    public static void main(String[] args) {
        // # 1
        ArrayList<String> items = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            items.add(String.valueOf(i));
        }
        System.out.println("****2*****");
        // # 2
        for (String item : items) {
            System.out.println(item);
        }
        // # 3
        System.out.println("****3****");
        Iterator it = items.listIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }


    }
}
