import java.util.HashMap;

public class FindMajorityElement {

    public static void main(String[] args) {

        int[] arr = {2, 4, 4, 4, 6, 7, 9, 6, 4, 3, 5, 6, 8, 7, 5, 4, 4, 3, 4, 4, 4, 4, 4};

        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

        for (int num : arr) {
            if (hm.containsKey(num)) {
                hm.put(num, hm.get(num) + 1);
            } else {
                hm.put(num, 1);
            }
        }

        int threshold = arr.length / 2;

        int ans = 0;

        for (int num : hm.keySet()) {
            System.out.println("Key -> " + num + " Value -> " + hm.get(num));
            if (hm.get(num) >= threshold) {
                ans = num;
            }
        }

        if (ans == 0) {
            System.out.println("No majority num");
        } else {
            System.out.println(ans);
        }

    }

}
