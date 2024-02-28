import java.util.Arrays;

public class DeleteElementFromArray {

    public static void main(String[] args) {

        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int element = 7;

        int len = num.length;

        int[] resultArray = new int[len - 1];
        int j = 0;

        for (int i = 0; i < len; i++) {
            if (num[i] != element) {
                resultArray[j] = num[i];
                j++;
            }
        }

        System.out.println(Arrays.toString(resultArray));

    }
}
