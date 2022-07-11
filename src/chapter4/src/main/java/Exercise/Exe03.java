package Exercise;

import java.util.*;
import java.util.stream.Collectors;

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
        List<String> newNames = names.stream()
                .filter(x -> Objects.equals(x, "Zoe"))
                .collect(Collectors.toList());
        System.out.println(newNames);

        List<Map<String, String>> students = names.stream().map(Exe03::getMap).collect(Collectors.toList());
        System.out.println(students);
    }

    public static Map<String, String> getMap(String name) {
        Map<String, String> nameMap = new HashMap<>();
        nameMap.put("username", name);
        return nameMap;
    }
}
