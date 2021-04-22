package day35_methods_with_parameters;

public class MethodWithInputs {
    public static void main(String[] args) {
        displayValue(5);
        displayValue(10);
        int count = 55;
        displayValue(count);
        greetByName("Kunduz");
        greetByName("100");
        String name = "Suleyman";
        greetByName(name);

    }
    public static void displayValue(int num) {
        System.out.println("The value is " +num);
    }
    public static void greetByName(String name) {
        System.out.println("Hello " + name + ", how are you today?");
    }
}
