package day26_loops;

public class MultiplicationTable {
    public static void main(String[] args) {
        int number = 5;
        if (number < 1 || number >10) {
            System.out.println("ERROR : Invalid number");
            return;
        }
        for (int i = 1; i <=10; i++){

            System.out.println(number + " * " + i + " = " + (number * i));
        }


        System.out.println(number + " * "+ 1 + " = " + (number * 1));





        }
    }

