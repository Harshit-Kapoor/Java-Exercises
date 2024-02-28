import java.util.Arrays;

public class CheckAnagrams {

    public static void main(String[] args) {

        String str1 = "a gentleman";             //   elegant man (check by frequency array)
        String str2 = "elegant man";

        int[] farr1 = new int[126];
        int[] farr2 = new int[126];

        for (int i = 0; i < str1.length(); i++) {
            farr1[str1.charAt(i)] = farr1[str1.charAt(i)] + 1;
        }

        for (int i = 0; i < str2.length(); i++) {
            farr2[str2.charAt(i)] = farr2[str2.charAt(i)] + 1;
        }

        for (int i = 0; i < farr1.length; i++) {
            if (farr1[i] != farr2[i]) {
                System.out.println("Not Anagram");
            }
        }
    }
}
