package day08_casting_scanner;

import java.util.Scanner;
public class ScannerIntro {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please Enter Your Name:");

        String firstName = scan.next();
        System.out.println("Nice To Meet You," + firstName);



    }
}