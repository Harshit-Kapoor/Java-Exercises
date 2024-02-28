import java.util.Arrays;

public class CheckPalindrome {

    public static void main(String[] args) {

        String originalString = "madam";

        char[] arr = originalString.toCharArray();

        String reveresedString = "";

        for(int i=0; i<arr.length / 2; i++) {

            char temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i -1] = temp;

        }

        for (char c: arr) {
            reveresedString = reveresedString + c;
        }


        System.out.println(originalString);
        System.out.println(reveresedString);

        if (originalString.equals(reveresedString)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palndrome");
        }

    }
}
