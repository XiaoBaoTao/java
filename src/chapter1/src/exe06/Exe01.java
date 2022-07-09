package exe06;

public class Exe01 {
    public static void main(String[] args) {
        /*
        现有一个小数数组{12.9,53.54,75.0,99.1,3.14}。请编写代码，找出数组中的最小值并打印。
         训练提示
        1. 数组的元素是小数，需要定义小数类型数组。
        2. 找最小值和找最大值的思路是一样的。
         解题方案
            使用求最大值的思路完成

        操作步骤

        1. 定义小数类型数组并存入元素。
        2. 定义小数变量min代表最小值。
        3. 遍历数组，用每个元素依次和变量min对比。
        4. 如果元素小于min,则把元素赋值给min。
        5. 遍历结束之后打印最小值。
         */
        double[] fs = {12.9, 53.54, 75.0, 99.1, 3.14};
        double mixValue = fs[0];
        for (double item : fs) {
            if (item < mixValue) {
                mixValue = item;
            }
        }
        System.out.println(mixValue);
    }
}
