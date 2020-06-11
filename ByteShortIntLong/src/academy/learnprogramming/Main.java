package academy.learnprogramming;

import jdk.swing.interop.SwingInterOpUtils;

public class Main {

    public static void main(String[] args) {
	    int integerA = 10_000;
	    int intMin = Integer.MIN_VALUE;
	    int intMax = Integer.MAX_VALUE;
        System.out.println("IntMin" + intMin + intMax);

        byte byteA = Byte.MIN_VALUE;
        byte byteB = Byte.MAX_VALUE;
        System.out.println("byte bits" + byteA + byteB);

        short shortA = Short.MIN_VALUE;
        short shortB = Short.MAX_VALUE;
        System.out.println("short bits" + shortA + shortB);

        long longVal = 1000L;
        long longMin = Long.MIN_VALUE;
        long longMax = Long.MAX_VALUE;
        System.out.println("long value" + longMax + longMin);

        float floatMin = Float.MIN_VALUE;
        float floatMax = Float.MAX_VALUE;
        System.out.println("float:" + floatMin + floatMax);

        char charA = 'A';
        boolean isCar = true;
        boolean wasCar = isCar ? true:false;
        if (wasCar){
            System.out.println(wasCar);
        }
        int wasWater = 500;
        boolean isWater = (wasWater == 200) ? true:false;
        if (!isWater){
            System.out.printf("aaa");
        }

        int test = 100 + 10 * 2;
        int test2 = 10 * 2 + 100;
        System.out.println(test2);
    }
}
