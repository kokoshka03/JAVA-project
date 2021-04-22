package day25_loops;

public class PrintStars {
    public static void main(String[] args) {
        for (int stars = 1; stars <= 15; stars++) {
            System.out.print("* ");
        }
        System.out.println();
        String myStars = "happy new year";
        for (int stars = 0; stars <= 4; stars++) {
            myStars += " happy new year ";

        }
        System.out.println("my stars = " + myStars + ",");
    }
}