package day36_methods_with_return;

public class CreditScore {
    public static void main(String[] args) {
        checkEligible(815);
        checkEligible(650);
        //System.out.println(checkEligible(711));ERROR
        System.out.println(getCreditScore());
        System.out.println("Score: " + getCreditScore());
        int score = getCreditScore();
        System.out.println("Score: " + score);

    }
    public static void checkEligible(int creditScore) {
        if (creditScore >= 700) {
            System.out.println("You are eligible for leasing this car");
        }else {
            System.out.println("Sorry,You are not eligible for leasing this car\"");

        }

    }
    public static int getCreditScore() {
        return(800);

    }
}
