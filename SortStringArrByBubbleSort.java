import java.util.Arrays;

public class SortStringArrByBubbleSort {

    public static void main(String[] args) {

        String[] arr = {"Mars", "Mercury", "Earth", "Jupiter", "Uranus", "Pluto", "Sun", "Star"};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 1) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("C".compareTo("A"));

        Arrays.stream(arr).forEach(x -> System.out.println(x + " "));

    }

}
