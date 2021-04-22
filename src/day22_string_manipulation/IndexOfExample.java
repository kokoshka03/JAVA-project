package day22_string_manipulation;

public class IndexOfExample {
    public static void main(String[] args) {
        String technologies =  "java,html,css,selenium";
        System.out.println(technologies.indexOf(","));   //4
        System.out.println(technologies.lastIndexOf(",")); //15

        int indexOfJava = technologies.indexOf("java");
        System.out.println("java is at index " + indexOfJava);
        int idxOfCss = technologies.indexOf("css");
        System.out.println("css is at index " + idxOfCss);
        int idxOfSelenium = technologies.indexOf("selenium");
        System.out.println("idxOfSelenium = " + idxOfSelenium);
        int idxOfSQL = technologies.indexOf("SQL");  //not present -1
        System.out.println("idxOfSQL = " + idxOfSQL);

        if (technologies.contains("html")) {
            System.out.println("html is present");
        }else {
            System.out.println("html is not present");
        }
        if (technologies.indexOf("html") > - 1) {
            System.out.println("html is present");
        }else {
            System.out.println("html is not present");
        }


    }
}
