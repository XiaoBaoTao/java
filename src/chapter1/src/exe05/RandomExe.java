package exe05;

import java.util.Random;

public class RandomExe {
    public static void main(String[] args) {
        System.out.println("this is the test random class!");
        Random random = new Random();
        int number = random.nextInt(10); // produce 0-9 numbers , 10 is the bound
        System.out.println(number);
    }
}
