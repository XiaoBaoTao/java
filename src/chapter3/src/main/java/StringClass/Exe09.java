package StringClass;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exe09 {
    public static void main(String[] args) throws JsonProcessingException {
        Scanner sc = new Scanner(System.in);
        System.out.println("please input some content: ");
        Map<String, Integer> count = new HashMap<>();
        count.put("numbers", 0);
        count.put("characters", 0);
        for (char ch : sc.next().toCharArray()) {
            if (Character.isAlphabetic(ch)) {
                count.put("characters", count.get("characters") + 1);
            } else if (Character.isDigit(ch)) {
                count.put("numbers", count.get("numbers") + 1);
            } else {
                System.out.println("Not valid!");
            }
        }
        String json = new ObjectMapper().writeValueAsString(count);
        System.out.println(json);
    }
}
