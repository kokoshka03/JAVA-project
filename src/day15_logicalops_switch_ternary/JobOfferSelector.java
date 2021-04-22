package day15_logicalops_switch_ternary;
//location, salary,remote,benefits
public class JobOfferSelector {
    public static void main(String[] args) {
        String location = "Bishkek";
        double salary = 110_000.0;
        boolean isRemote = true;
        boolean benefits = true;

        if (location.equals("Bishkek") && salary >= 110_000.0 && isRemote && benefits ) {
            System.out.println("Sure, i will accept this offer");
        }else {
            System.out.println("Lets consider another offer or negotiate");
        }
    }
}
