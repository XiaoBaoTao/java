package exe01;

public class Exe03 {
    public static void main(String[] args) {
        /*
        请根据下列描述，选用合适的数据类型定义变量，并输出变量的值。

            1、班级里有100个学员。

            2、某商品价格55.55元。

            3、地球已经诞生超过46亿年。

            4、“5是偶数”这句话的描述是假的。
         */
        // # 1
        int studentCount = 100;
        System.out.printf("班级里有%s个学员\n", studentCount);
        // # 2
        float price = 55.55f;
        System.out.printf("某商品价格%s元\n", price);
        // # 3
        long years = 4600000000L;
        System.out.printf("地球已经诞生超过%s年\n", years);
        // # 4
        boolean isFake = false;
        System.out.printf("“5是偶数”这句话的描述是%s的\n", isFake);
    }
}
