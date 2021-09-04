package FirstSteps;

public class LiteralsAndOperators {

    public static void main(String[] args) {

        int myfirstNumber = 10;
        int mySecondNumber = (10+29) + (23-19);
        int thirdNumber = 987;
        int fourthNumber = 11;
        int total = myfirstNumber + mySecondNumber + thirdNumber + fourthNumber;
        System.out.println(myfirstNumber);
        System.out.println(mySecondNumber);
        System.out.println(thirdNumber);
        System.out.println(fourthNumber);
        System.out.println(myfirstNumber+mySecondNumber+thirdNumber+fourthNumber);

        int myLastOne = total - 1000;
        System.out.println(myLastOne);

        int myIntMax = Integer.MAX_VALUE;
        int myIntMin = Integer.MIN_VALUE;
        System.out.println("Max int value = " + myIntMax);
        System.out.println("Min int value = " + myIntMin);
        System.out.println("Busted max int value = " + (myIntMax + 1));
        System.out.println("Busted min int value = " + (myIntMin - 1));

        int newNumberFormat = 2_14_74_83_647;
        System.out.println(newNumberFormat);

    }
}
