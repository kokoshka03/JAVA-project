package day20_string_manipulation;
import java.lang.*;
public class StringCreationMethods {
    public static void main(String[] args) {
        String word = "potato";
        String word2 = new String("tomato");
        String word3 = new String();
        String word4 ="";
        System.out.println("java");

        String car = "Lexus";
        System.out.println(car.isEmpty()); //false

        String city = "";
        System.out.println(city.isEmpty()); //true

        System.out.println(city.length()); //0
        System.out.println(city.equals(""));

        System.out.println();

    }
}
