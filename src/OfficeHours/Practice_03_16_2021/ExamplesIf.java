package OfficeHours.Practice_03_16_2021;

public class ExamplesIf {
    public static void main(String[] args) {
        int a = 10;
        int b = a-- * 2 - --a % 2 + a;
        System.out.println(b);

        if(11 % 2 == 0) {
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
    }
}
