package OfficeHours.Practice_03_02_2021;

public class PersonInfo {
    public static void main(String[] args) {

        //Variables without any data
        String name,fullBirthDate, favoriteQuote;
        byte age;
        char gender;
        boolean student;
        short numberOfSiblings;
        long favoriteNumber;
        int numberOfSeasons, year;
        double birthDate;

        //Assignment of data
        name = "Kunduz";
        age = 31;
        gender ='F';
        student = true;
        numberOfSiblings =1;
        favoriteNumber =7L;
        numberOfSeasons = 4;
        birthDate =03.03;
        year= 1990;
        fullBirthDate =""+ birthDate+"." +year;
        favoriteQuote ="Have a good mindset";
        System.out.println("Full birthdate: " +fullBirthDate);
        System.out.println("Name:"+ name );
        System.out.println("Age:" +age);
        System.out.println("Gender:" +gender);
        System.out.println(true);
        System.out.println("Number of siblings:" + numberOfSiblings);
        System.out.println("Favorite number:"+ favoriteNumber);
        System.out.println("NUmber of seasons:" + numberOfSeasons);
        System.out.println("Favorite quote:"+ favoriteQuote);






    }
}
