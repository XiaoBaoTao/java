package exe03;

import java.util.Scanner;

public class Exe02 {
    public static void main(String[] args) throws Exception {
        /*
        某银行推出了整存整取定期储蓄业务，其存期分为一年、两年、三年、五年，到期凭存单支取本息。存款年利率表如下：

    存期        年利率（%）

    一年        2.25

    两年        2.7

    三年        3.25

    五年        3.6

请存入一定金额（1000起存），存一定年限（四选一），计算到期后得到的本息总额。

提示：

    存入金额和存入年限均由键盘录入

    本息计算方式：本金+本金×年利率×年限

 训练提示

1. 使用什么方式让用户输入内容？
2. 使用哪种if语句的格式对信息作出判断？

 解题方案
1. 使用Scanner和if..else...的嵌套操作。
 操作步骤
1. 键盘录入金额和年份。
2. 使用多条件if...else判断年份，计算本息金额。
3. 输出结果。
         */
        System.out.printf("please input how many years: ");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        System.out.printf("You chose %s year!", option);
        double rate;
        switch (option) {
            case 1:
                rate = 2.25;
                break;
            case 2:
                rate = 2.7;
                break;
            case 3:
                rate = 3.25;
                break;
            case 4:
                rate = 3.6;
                break;
            default:
                throw new Exception("Not Found!");
        }
        double result = 1000 * Math.pow(1 + rate / 100, option);
        System.out.println(String.format("your result is %s", result));
    }
}
