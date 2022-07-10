import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import StringClass.Student;


public class Main {
    public static void main(String[] args) {
        Student student = new Student("zoe", 32, 3.25f, true);
        ObjectMapper mapper = new ObjectMapper();
        try {
            String json = mapper.writeValueAsString(student);
            System.out.println("ResultingJSONstring = " + json);
            //System.out.println(json);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}
