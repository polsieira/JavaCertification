package academy.learnprogramming;

public class NumericPromotionAndCasting {

    public static void main(String[] args) {
        // Java auto-promotes data types to large data type and result will have same data type as promoted data type
        int x = 5;
        double y = 10.55;

//        System.out.println("x + y= " + x + y); // needs parentheses
        System.out.println("x + y= " + (x + y));

        byte b = 10;
        int c = 5;
        double d = 4.5;

        double result = b + c + d;

        System.out.println("result= " + result);

        // casting is converting bigger type to smaller type

        double myDouble = 5.55;
//        int myInt = 4 + myDouble; // trying to assign double to int
        int myInt = 4 + (int)myDouble;

        System.out.println("result= " + myInt);

        int anotherInt = 125;
        byte myByte = 15;

        int intResult = anotherInt + myByte;
        byte byteResult = (byte)(anotherInt + myByte);

        System.out.println("byteResult= " + byteResult); // overflow (be careful of losing precision)
        System.out.println("intResult= " + intResult);
    }
}


// Rules

/* 1. When two values have different data types, Java will auto promote one of the values to the larger data type
   2. When on of the values in integral and the other is floating-point, Java will auto promote the integral
      (byte, short, int, long) value to the floating point (float, double)
   3. Small data types (byte, short, char) are first promoted to int any time they are used with binary arithmetic
      operator
   4. After promotion the result value will have same value as promoted operands
 */