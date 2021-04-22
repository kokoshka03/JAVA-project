package OfficeHours.Practice_03_03_2021;
 /* Make a class AgeToDays
 create a main method
 -Declare 2 int variables; age and age in days
 -Use a base of 365 days in a year
 -calculate and display:
 you are $age years old. That means you are $days days old
   */

public class AgeToDays {
    public static void main(String[] args) {
        int age = 31;
        int ageInDays = 365* age;
        System.out.println("You are " + age +" years old! " +
                "That means you are: "+ ageInDays +" days old");
    }
}
