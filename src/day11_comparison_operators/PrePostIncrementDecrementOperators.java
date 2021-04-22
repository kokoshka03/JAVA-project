package day11_comparison_operators;

public class PrePostIncrementDecrementOperators {
    public static void main(String[] args) {
        //PRE_INCREMENT
        int num1 = 10;
        int num2 = ++num1;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        //POST_INCREMENT
        int num3 =8;
        int num4 = num3++;
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);

        int apples = 5;
        int basket = ++apples;
        System.out.println("apples = " + apples);
        System.out.println("basket = " + basket);

        int kiwi = 15;
        int kiwiBasket = kiwi++;
        System.out.println("kiwi = " + kiwi);
        System.out.println("kiwiBasket = " + kiwiBasket);

        int cars = 5;
        System.out.println(++cars);
        int sedans = 10;
        System.out.println(sedans++);
        System.out.println(sedans);

        int myNumber = 44;
        myNumber++;
        System.out.println("myNumber = " + myNumber);

        myNumber =20;
        System.out.println(++myNumber);
        myNumber =33;
        System.out.println(myNumber++);
        System.out.println(myNumber);

        int myNumber1 = 15;
        int YourNumber1 = ++myNumber;
        System.out.println(myNumber1);
        System.out.println(YourNumber1);

        int myNumber2 = 99;
        int YourNumber2 = myNumber2++;
        System.out.println(YourNumber2);
        System.out.println(myNumber2);

        int a = 50;
        int b = 22;
        int c = a++ + ++b;
        //adds 1 to a here, at this step afterwards
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

    }
}
