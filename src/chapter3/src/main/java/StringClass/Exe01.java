package StringClass;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Exe01 {
    public static void main(String[] args) {
        String name = "Zoe";
        String json = getJson(name);
        System.out.println(json);
        System.out.println(name.length());
        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }

        // Test build string in different ways ;
        String s1 = "zoe";
        char[] s10 = {'z', 'o', 'e'};
        String s2 = new String(s10);
        String s3 = new String("zoe");
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s2 == s3);
    }

    public static String getJson(Object o) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            String json = mapper.writeValueAsString(o);
            System.out.println("ResultingJSONstring = " + json);
            return json;
            //System.out.println(json);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return e.toString();
        }
    }
}
