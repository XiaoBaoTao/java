package exe02;

public class Exe02 {
    /*
    某小伙想定一份外卖，商家的优惠方式如下：鱼香肉丝单点24元，油炸花生米单点8元，米饭单点3元。订单满30元8折优惠。鱼香肉丝优惠价16元，但是优惠价和折扣不能同时使用。那么这个小伙要点这三样东西，最少要花多少钱？请编写程序计算。
    【思路分析】：
    有两种购买方式，一种是不使用优惠价，另一种是使用优惠价。分别计算花费后，对两种方式的花费作对比。
    【参考方案】：
    使用算术运算符、赋值运算符和三元运算符联合完成本题
    【参考步骤】：
    1.    使用算术运算符求出不使用优惠时的总价
    2.    使用三元运算符判断总价是否满足打折条件，并求出折后总价
    3.    使用算术运算符求出使用优惠价时的总价
    4.    使用三元运算符判断最终更合算的购买方式和花费
     */
    public static void main(String[] args) {
        double fishPrice = 24d;
        double fishPrice1 = 16d;
        double nutPrice = 8d;
        double rice = 3d;
        double total = fishPrice + nutPrice + rice;
        double result1 = total > 30 ? total * 0.8 : total;
        double result2 = fishPrice1 + nutPrice + rice;
        String finalOption = result1 > result2 ? String.format("选方案1：合计%s元", result1) : String.format("选方案2：合计%s元", result2);
        System.out.println(finalOption);
    }
}
