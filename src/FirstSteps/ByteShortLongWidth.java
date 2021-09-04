package FirstSteps;

public class ByteShortLongWidth {

    public static void main(String[] args) {

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Max Byte value" + myMaxByteValue);
        System.out.println("Min Byte value" + myMinByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Max Short value" + myMaxShortValue);
        System.out.println("Min Short value" + myMinShortValue);

        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Max Long value" + myMaxLongValue);
        System.out.println("Min Long value" + myMinLongValue);

    }
}
