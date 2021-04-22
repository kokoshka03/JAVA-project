package OfficeHours.Practice_03_30_2021;
import java.util.Scanner;
public class MaxNumberFrom5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int first = scan.nextInt();
        int max = first;
        int min = first;

        for (int i = 0; i < 4; i++) {
            System.out.println("Enter a number");
            int number = scan.nextInt();

            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }
        System.out.println("max: " + max);
        System.out.println("min: " + min);
    }
}
