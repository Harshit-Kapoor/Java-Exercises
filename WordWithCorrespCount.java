public class WordWithCorrespCount {

    public static void main(String[] args) {

        String str = "This is the test string";

        String[] arr = str.split("\\s+");

        for (String s : arr) {
            findCount(s);
        }

    }

    public static void findCount(String s) {
        System.out.println(s + " -> " + s.length());
    }

}
