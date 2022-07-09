public class ForceConvertExample {
    public static void main(String[] args) {
        byte a = 12;
        char b = 'c';
//        byte c = a + b;  error
        int c = a + b;
        byte d = (byte) (a + b);
        Object o = a;
        System.out.println(o.getClass().toString());

    }

    public static String getType(Object o) {
        return o.getClass().toString();
    }
}
