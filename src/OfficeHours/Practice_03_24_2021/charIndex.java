package OfficeHours.Practice_03_24_2021;

public class charIndex {
    public static void main(String[] args) {
        String s = "java";
       // System.out.println(s.charAt(s.length()));
        System.out.println(s.charAt(s.length()-1)); //a
        System.out.println(s.charAt(0));
        System.out.println(s.charAt(1));
        System.out.println(s.charAt(2));
        System.out.println(s.charAt(3));

        System.out.println(s.charAt(0) + "" + s.charAt(3));
        String upper = " " +s.toUpperCase().charAt(0) + s.toUpperCase().charAt(3);
        System.out.println(upper);
        System.out.println(s.indexOf('a')); //1
        System.out.println(s.indexOf('m'));
        System.out.println(s.contains("j"));
        System.out.println(s.indexOf('j') >= 0? "contains":"Not contains");

        System.out.println(s.toLowerCase().contains("a"));
        System.out.println(s.toLowerCase().startsWith("a"));
        // boolean.String method
        System.out.println(s.toLowerCase().replace("j", "e").startsWith("a"));

    }
}
