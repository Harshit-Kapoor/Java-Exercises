import java.util.Arrays;

public class Panagram {

    public static boolean checkPanagram(String s) {

        int[] arr = new int[126];

        String inp = s.toUpperCase();

        for (int i = 0; i < inp.length(); i++) {
            arr[inp.charAt(i)]++;
        }

        for (int i = 65; i <= 90; i++) {
            if (arr[i] == 0) {
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args) {

        String s1 = "The quick brown fox jumps over the lazy dog";

        String s2 = "Hello World";

        System.out.println(checkPanagram(s1));
        System.out.println(checkPanagram(s2));

    }

}
