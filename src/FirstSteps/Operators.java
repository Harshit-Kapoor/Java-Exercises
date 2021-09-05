package FirstSteps;

public class Operators {

    public static void main(String[] args) {

        int result = 1+2;
        System.out.println(result);
        result = result-1;
        System.out.println(result);
        int previousResult = result;
        result = result * 10;
        System.out.println(result);

        result = result/4;
        System.out.println(result);

        int newRes = result%3;
        System.out.println(newRes);

        int sum = 9;
        sum++;
        System.out.println(sum);
        sum--;
        System.out.println(sum);

        sum = sum++;
        System.out.println(sum);
        sum--;
        System.out.println(sum);
    }
}
