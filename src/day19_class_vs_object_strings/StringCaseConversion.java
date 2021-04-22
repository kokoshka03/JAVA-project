package day19_class_vs_object_strings;

import java.sql.SQLOutput;

public class StringCaseConversion {
    public static void main(String[] args) {
        String word = "CyberTek";
        System.out.println(word);
        System.out.println(word.toLowerCase());
        System.out.println(word.toUpperCase());
        System.out.println("JAVA".toLowerCase());

        word.toLowerCase();
        System.out.println(word);

        String wordInLCase = word.toLowerCase();
        System.out.println("wordInLCase = " + wordInLCase);

        word = word.toLowerCase();
        System.out.println("word = " + word);

        String company = "Amazon Web Services";
        System.out.println(company.toUpperCase());
        System.out.println("company in upper case - " + company.toUpperCase());
        System.out.println("java".toUpperCase());

        System.out.println("company = " + company);
        company = company.toUpperCase();
        System.out.println("company = " + company);
    }

}
