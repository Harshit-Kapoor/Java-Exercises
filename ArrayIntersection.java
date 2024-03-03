import java.util.HashSet;
import java.util.Set;

public class ArrayIntersection {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5,6,7};

        int[] arr2 = {7,8,9,10,11,2,4};

        Set<Integer> s = new HashSet<Integer>();

        for (int num: arr1) {
            s.add(num);
        }

        for (int num: arr2) {
            if (s.contains(num)) {
                System.out.println(num);
            }
        }

    }

}
