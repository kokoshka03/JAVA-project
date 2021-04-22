package day08_casting_scanner;

public class CastingExample {
    public static void main(String[] args) {
        byte num1 =100;
        short num2 = num1;
        int num3 = num1;
        int num4 = 1000;
        long num5 = num4;
        float num6 = 124.4F;
        double num7 = num6;
        int num8 = 3458;
        double num9 = num8;
        System.out.println(num8);
        System.out.println("num 9 =" + num9);
        long num10 = 4444L;
        int num11= (int)num10;
        System.out.println("==========================");
        double num12 =55.3;
        float num13 = (float)num12;
        System.out.println("num 13 =" + num12);
        double num14 =1234.25;
        int num15= (int)num14;
        System.out.println("num15 = " + num14);
        System.out.println("num14 = " + num15);
        int num16 =300;
        byte num17 = (byte)num16;
        System.out.println("num16 = " + num16);
        System.out.println("num17 = " + num17);
        char letter ='K';
        int numLetter = letter;
        System.out.println("numLetter = " + numLetter);
        double d = 10.5;
        short sh = (short) d;
        System.out.println("sh = " + sh);




    }
}
