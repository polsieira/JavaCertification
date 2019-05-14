package academy.learnprogramming;

public class WholeNumericPrimitives {

    public static void main(String[] args) {
        long max = 32_123_456_789L;
        long n = 2_300;

        // octal (0-7)
        int oct = 07;
        int firstOct = 010; // 8 decimal
        int secondOct = 022; // 18 decimal

        int sumOct = firstOct + secondOct;
        System.out.println("first= " + firstOct + " second= " + secondOct);
        System.out.println("decimal sum= " + sumOct + " octSum= " + Integer.toOctalString(sumOct));

        // hexadecimal (0-9 and A-F)
        int firstHex = 0xF; // 15 decimal
        int secondHex = 0x1E; // 30 decimal
        int sumHex = firstHex + secondHex;
        System.out.println("first= " + firstHex + " second= " + secondHex);
        System.out.println("decimalSum = " + sumHex + " octSum= " + Integer.toHexString(sumHex));

        // binary (0 and 1)
        int firstBin = 0b1001; // 9 decimal
        int secondBin = 0b0111; // 7 decimal
        int sumBin = firstBin + secondBin;
        System.out.println("first =" + firstBin + " second= " + secondBin);
        System.out.println("decimalSum=" + sumBin + " binSum=" + Integer.toBinaryString(sumBin));



    }
}
