package Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Exe04 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("zoe");
        names.add("test");
        names.add("Kevin");
        names.add("Josh");
        names.add("test");
        names.add("test");
        names.add("test");
        names.add("test");
        List<String> newNames = names.stream().filter(name -> !name.equals("test"))
                .collect(Collectors.toList());
        System.out.println(newNames);
        names.removeIf(name -> name.equals("test"));
        System.out.println(names);
    }
}
