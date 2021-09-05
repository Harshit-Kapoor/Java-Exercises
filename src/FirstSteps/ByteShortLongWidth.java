package FirstSteps;

public class ByteShortLongWidth {

    public static void main(String[] args) {

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Max Byte value = " + myMaxByteValue);
        System.out.println("Min Byte value = " + myMinByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Max Short value = " + myMaxShortValue);
        System.out.println("Min Short value = " + myMinShortValue);



        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Max Long value" + myMaxLongValue);
        System.out.println("Min Long value" + myMinLongValue);
        //casting required for short and byte
        long cast = myLongValue/2;
        byte cast1 = (byte)(myMaxByteValue/2);
        short cast2 = (short) (myMaxShortValue/2);

        byte num1 = 78;
        short num2 = 101;
        int num3 = 890;
        long num4 = 50000+(10)*(num1+num2+num3);
        System.out.println(num4);

        float myMinFloat = Float.MIN_VALUE;
        float myMaxFloat = Float.MAX_VALUE;
        System.out.println("Min float = " + myMinFloat);
        System.out.println("Max float = " + myMaxFloat);
        double myMinDouble = Double.MIN_VALUE;
        double myMaxDouble = Double.MAX_VALUE;
        System.out.println("min double = " + myMinDouble);
        System.out.println("max double = " + myMaxDouble);

        int myInt = 5/3;
        float myFloat = 5f / 3; //5.35f
        double myDouble = 5.00 / 3.00;

        System.out.println(myInt);
        System.out.println(myFloat);
        System.out.println(myDouble);

        //convert pound to kg

        int numOfPounds = 5;
        double kgs = numOfPounds*0.45359237;
        System.out.println(kgs);

        char myChar = 'D';
        char muUniCode = '\u0044';
        System.out.println(myChar);
        System.out.println(muUniCode);

        boolean myBool = true;

        //byte, short, int, long, char, boolean, float, double

        int munum = 10;
        String val = "50";
        val = val + munum;
        System.out.println(val);


    }
}
