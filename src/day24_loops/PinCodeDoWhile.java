package day24_loops;
import java.util.Scanner;
public class PinCodeDoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int secretPinCode = 1234;
        int pinCode; // declare here so it's visible for while condition

        do {
            System.out.println("Enter pinCode");
            pinCode = scan.nextInt();

        }while (pinCode != secretPinCode);
            System.out.println("WELCOME TO YOUR ACCOUNT");


    }
}
