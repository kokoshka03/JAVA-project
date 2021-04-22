package day05_primitives_concatanation;

public class JobInfo {
    public static void main(String[] args){
        String title = "Java SDET";
        String company = "Palo Alto Networks";
        String description = "Java, Selenium, Cucumber, Tomato, Junit";
        double salary = 123000;
        byte yearsOfExperience = 3;
        Boolean hasBenefits = true;

        System.out.println("Title: " + title);
        System.out.println("company:" + company);
        System.out.println("Decription: " + description);
        System.out.println("Salary: $" + salary);
        System.out.println("Years of experience: " + yearsOfExperience);
        System.out.println("has Benefits? " + hasBenefits);
    }
}
