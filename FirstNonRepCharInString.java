import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepCharInString {

    public static void main(String[] args) {

        String str = "aaakkkuuuxggwwucsk";

        Map<Character, Integer> m = new LinkedHashMap<Character, Integer>();

        for (char c : str.toCharArray()) {
            if (m.containsKey(c)) {
                int value = m.get(c);
                m.put(c, value + 1);
            } else {
                m.put(c, 1);
            }
        }

        for (char c : m.keySet()) {
            if (m.get(c) == 1) {
                System.out.println(c);
                break;
            }
        }
    }
}
