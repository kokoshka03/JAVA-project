package day37_methods_overloading;

public class MethodPractice {
    public static void main(String[] args) {
        System.out.println(repeatString("hi",3,'|'));
        System.out.println(repeatString("I can do it",10,'-'));
    }

    public static String repeatString(String word, int times, char delimiter) {
        String retValue = " ";
        for (int i = 0; i <= times; i++) {
            retValue += word + delimiter;
            if (i == times) {
                retValue += word;
            }else {
                retValue += word+delimiter;

            }
        }
        return retValue;
    }
}


