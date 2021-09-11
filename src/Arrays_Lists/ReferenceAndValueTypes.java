package Arrays_Lists;

public class ReferenceAndValueTypes {

    public static void main(String[] args) {

        int myIntValue = 10;
        int anotherIntValue = myIntValue;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        anotherIntValue++;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        int[] myIntArray = new int[5];
        int[] anptherArray = myIntArray;

        System.out.println("myIntArray = "+ java.util.Arrays.toString(myIntArray));
        System.out.println("myIntArray = "+ java.util.Arrays.toString(anptherArray));

        anptherArray[0] = 1;
        System.out.println("myIntArray after change = "+ java.util.Arrays.toString(myIntArray));
        System.out.println("myIntArray after change = "+ java.util.Arrays.toString(anptherArray));

//        anptherArray = new int[] {2,3,4,5,6,6};
        modifyArray(myIntArray);

        System.out.println("myIntArray modify change = "+ java.util.Arrays.toString(myIntArray));
        System.out.println("myIntArray modify change = "+ java.util.Arrays.toString(anptherArray));
    }

    private static void modifyArray(int[] array){
        array[0] = 2;
    }
}
