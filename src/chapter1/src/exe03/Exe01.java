package exe03;

public class Exe01 {
    public static void main(String[] args) {
        /*
        李雷想买一个价值7988元的新手机，她的旧手机在二手市场能卖1500元，而手机专卖店推出以旧换新的优惠，把她的旧手机交给店家，新手机就能够打8折优惠。为了更省钱，李雷要不要以旧换新？请在控制台输出。

         训练提示

        1. 用什么知识点能够对不同购买方式的价格做判断？

         解题方案

        1. 使用if...else语句判断

        操作步骤

        1. 计算不使用以旧换新时的花费。
        2. 计算使用以旧换新时的花费。
        3. 使用if..else语句判断哪种方式更省钱，并输出结果
         */
        float phonePrice = 7988f;
        float oldPhonePrice = 1500f;

        float option1 = (float) (phonePrice * 0.8);
        float option2 = phonePrice - oldPhonePrice;

        if (option1 > option2){
            System.out.printf("选择option2, %s: %s", option1, option2);
        }else {
            System.out.printf("选择option1, %s: %s", option1, option2);
        }

    }
}
