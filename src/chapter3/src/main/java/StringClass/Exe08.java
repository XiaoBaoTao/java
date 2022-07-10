package StringClass;

public class Exe08 {
    public static void main(String[] args) {
        String name = "zoe";
        String sex = "male";
        System.out.println(String.join("-", name, sex));
        System.out.println(name.concat(sex));
    }
}
