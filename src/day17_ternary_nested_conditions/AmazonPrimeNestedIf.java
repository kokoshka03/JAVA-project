package day17_ternary_nested_conditions;

public class AmazonPrimeNestedIf {
    public static void main(String[] args) {
        double itemPrice =150.55;
        boolean isPrimeMember = true;

        if (isPrimeMember == true) {
            System.out.println("Eligible for free shipping");
        }else {

        }
            if (itemPrice >= 25) {
                System.out.println("Eligible for free regular shipping");
            }else {
                System.out.println("Not eligible for free shipping. Fee is 10$");
            }

    }
}
