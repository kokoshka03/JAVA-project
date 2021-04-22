package day15_logicalops_switch_ternary;

public class SwitchStatement {
    public static void main(String[] args) {
        int n = 2;

        if(n == 1) {
            System.out.println("n is 1");
        }else if(n == 2) {
            System.out.println("n is 2");
        }else if(n == 3) {
            System.out.println("n is 3");
        }else {
            System.out.println("n is not 1,2,3");
        }

               // Same exact code can be re-written using switch statement.

        int n1 = 1;

        switch(n) {
            case 1:
                System.out.println("n1 is 1");
                break;
            case 2:
                System.out.println("n1 is 2");
                break;
            case 3:
                System.out.println("n1 is 3");
                break;
            default:
                System.out.println("n is not 1,2,3");
        }

    }
}
