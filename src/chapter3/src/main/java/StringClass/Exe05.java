package StringClass;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exe05 {
    public static void main(String[] args) throws JsonProcessingException {
        Scanner sc = new Scanner(System.in);
        System.out.printf("please input a string: ");
        String str = sc.next();
        Map<Character, Integer> wordCount = new HashMap<>();
        for (char ch : str.toCharArray()) {
            if (!wordCount.containsKey(ch)) {
                wordCount.put(ch, 1);
            } else {
                wordCount.put(ch, wordCount.get(ch) + 1);
            }
        }
        String json = new ObjectMapper().writeValueAsString(wordCount);
        System.out.println(json);
    }
}
