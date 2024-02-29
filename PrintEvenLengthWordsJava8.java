import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintEvenLengthWordsJava8 {

    public static void main(String[] args) {

        String str = "Hell World";   // op - Hell

        String[] arr = str.split("\\s+");

        List<String> results1 = Arrays.stream(arr).filter(x -> x.length() % 2 == 0).collect(Collectors.toList());

        System.out.println(results1);

        List<Integer> lst = Arrays.asList(5, 6, 7, 8, 9, 3, 2, 2, 5, 6, 77, 21, 22);

        List<Integer> results = lst.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());

        System.out.println(results);

    }
}
