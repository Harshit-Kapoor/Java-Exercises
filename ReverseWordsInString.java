import java.util.Arrays;

public class ReverseWordsInString {

    public static void main(String[] args) {

        String line = "My name is test";  // test is name My

        String[] arr = line.split(" ");

        for(int i=0; i<arr.length / 2; i++) {

            String temp = arr[0];
            arr[0] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;

        }

        System.out.println(Arrays.toString(arr));

    }
}
