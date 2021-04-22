package day20_string_manipulation;

public class StringContains {
    public static void main(String[] args) {
        String company = "Capital One";
        System.out.println(company.contains("i")); //true
        System.out.println(company.contains("ital")); //true
        System.out.println(company.contains("l O")); //true

        if(company.contains(" ")) {
            System.out.println("company name with multiple words");
        }else {
            System.out.println("single word company name");
        }
        System.out.println(company.contains("j"));

        String etsyTitle = "Wooden spoon | Etsy";

        if (etsyTitle.contains(" | ")) {
            System.out.println("Pass - title check passed");
        }else {
            System.out.println("Fail - title check failed");
        }
        String firstName = "AHMED";
        if (firstName.contains("A") && firstName.contains("E")) {
            System.out.println("both A && E are present");
        }else {
            System.out.println("both A && E are not present");
        }
        firstName = "Nadir";
        if (firstName.contains("a") || firstName.contains("e")) {
            System.out.println("a or i is present");
        }else {
            System.out.println("a or i is not present");
        }
        String email = "murodil@cybertekschool.com";
        if (email.contains("@") && email.endsWith(".com")) {
            System.out.println("valid email");
        }else {
            System.out.println("invalid email");
        }
        if (email.toLowerCase().contains("d")) {
            System.out.println("d is present");
        }else {
            System.out.println("d is not present");
        }

    }
}
