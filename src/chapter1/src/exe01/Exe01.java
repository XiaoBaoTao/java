package exe01;

/*

请编写程序，将某位学员的个人信息输出到屏幕上。信息包括姓名（字符串常量）、性别（字符常量）、年龄（整型常量）、身高（单位米，小数常量）、婚否（布尔常量）。输出格式如下：

张三
男
18
1.78
false
 */
public class Exe01 {
    public static void main(String[] args) {
        String name = "张三";
        String sex = "男";
        int age = 18;
        float height = 1.78f;
        boolean married = false;
        System.out.println(name);
        System.out.println(sex);
        System.out.println(age);
        System.out.println(height);
        System.out.println(married);

    }
}

