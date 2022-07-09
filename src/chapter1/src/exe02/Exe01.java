package exe02;

public class Exe01 {
    /*
     根据以上描述，请编写程序，定义两个整数（int类型）变量，并求这两个整数的和，将结果输出到屏幕上。输出格式如下：
    10 + 20 = 30
     */
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String result = String.format("%s + %s = %s", a, b, a + b);
        System.out.println(result);
    }

}
