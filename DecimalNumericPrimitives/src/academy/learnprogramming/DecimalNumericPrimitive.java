package academy.learnprogramming;

public class DecimalNumericPrimitive {

    public static void main(String[] args) {

        float myNumber = 25.4f;

//        double before = 10_.25; // doesn't compile
//        double after = 10._25; // doesn't compile
//        double first = _10.25; // doesn't compile
//        double last = 10.25_; // doesn't compile

        double myDouble = 2.54;
        double myDouble2 = 2.54f;
        double anotherDouble = 2.54d; // d can be used for double it is optional
        double scientfic = 5.000125E03;
        double scientfic2 = 5.000125E3;
        double myDouble3 = 5000.125;

        System.out.println("scientific= " + scientfic);
        System.out.println("scientific2= " + scientfic2);
        System.out.println("myDouble3= " + myDouble3);

        double hexPI = 0x1.91eb851eb851fp1; //p indicates hexadecimal floating point number

        System.out.println("hexPI=" + hexPI);

    }
}


