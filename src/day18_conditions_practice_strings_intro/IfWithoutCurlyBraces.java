package day18_conditions_practice_strings_intro;

public class IfWithoutCurlyBraces {
    public static void main(String[] args) {
        String todayClass = "python";
        if (todayClass.equals("java")) {
            System.out.println("java is fun");
        } else {
            System.out.println("If it is not java it is " + todayClass);
        }
    }
}