public class FindMissingNum {

    public static void main(String[] args) {

        int[] arr = {4, 5, 6, 8, 9, 10, 11};

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int v : arr) {
            if (v > max) {
                max = v;
            }
        }

        for (int v : arr) {
            if (v < min) {
                min = v;
            }
        }

        int sum = 0;

        for (int i=min; i<=max; i++) {
            sum = sum + i;
        }

        int arrSum = 0;

        for (int v: arr) {
            arrSum+=v;
        }

        System.out.println(sum - arrSum);

    }
}
