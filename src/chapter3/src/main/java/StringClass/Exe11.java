package StringClass;

public class Exe11 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        char[] chars = {'[', '1', '2', '3', ']'};
        int index = 0;
        for (char ch : chars) {
            sb.append(ch);
            if (index > 0 && index < chars.length - 2) {
                sb.append(',');
            }
            index++;
        }
        System.out.println(sb);
    }
}
