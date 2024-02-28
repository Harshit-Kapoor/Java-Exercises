import java.util.LinkedHashMap;
import java.util.Map;

public class RemoveDuplicateFromString {

    public static void main(String[] args) {

        String s = "java";   // op = jav

        Map<Character, Integer> m = new LinkedHashMap<Character, Integer>();

        for(Character c : s.toCharArray()) {
            if (m.containsKey(c)) {
                int value = m.get(c);
                m.put(c, value+1);
            } else {
                m.put(c, 1);
            }
        }

        String result = "";

        for (Character c : m.keySet()) {
            result = result + c;
        }

        System.out.println(result);

    }
}
