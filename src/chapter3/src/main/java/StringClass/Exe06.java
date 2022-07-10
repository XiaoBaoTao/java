package StringClass;

public class Exe06 {
    public static void main(String[] args) {
        // 屏蔽手机号
        String phone = "15134035233";
        StringBuilder maskedPhone = new StringBuilder();
        for (int i = 0; i < phone.length(); i++) {
            if (i > 2 & i < 7) {
                maskedPhone.append("*");
            } else {
                maskedPhone.append(phone.charAt(i));
            }
        }
        System.out.println("masked phone is : " + maskedPhone);
    }
}
