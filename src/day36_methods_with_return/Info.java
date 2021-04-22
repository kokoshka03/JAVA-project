package day36_methods_with_return;
import java.util.*;
public class Info {
    public static void main(String[] args) {

        System.out.println("Full name: " + fullName());
        System.out.println("Is married: " + isMarried());
        System.out.println("Age is: " + getAge());
        System.out.println("Year is:" + getRandomYear());

        if (isMarried()) {
            System.out.println("married");
        }else {
            System.out.println("single");
        }

        String name = fullName();
        boolean married = isMarried();
        int age = getAge();
        int year = getRandomYear();

        System.out.println("name = " + name);
        System.out.println("married = " + married);
        System.out.println("age = " + age);
        System.out.println("year = " + year);
    }
    public static String fullName() {
        return "Mike Smith";

    }
    public static boolean isMarried() {
        return false;
    }
    public static int getAge() {
        int age = 35;
        return age;
    }
    public static int getRandomYear() {
        Random random = new Random();
        int randomYear = random.nextInt(2021);
        return randomYear;

    }
}
