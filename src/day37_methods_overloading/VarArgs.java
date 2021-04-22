package day37_methods_overloading;

public class VarArgs {
    public static void main(String[] args) {
        addNumbers(10,5);
        addNumbers(100,200,300);
        addNumbers();
        //int... myNumbers = 10,4;ERROR varargs can only be used a method parameter
    }

    //varargs
    public static void addNumbers (int...nums) {
        //inside the method used as a regular array
        int sum = 0;
        for (int n:nums) {
            sum+=n;
            System.out.println("sum= " +sum);
        }
    }
}
