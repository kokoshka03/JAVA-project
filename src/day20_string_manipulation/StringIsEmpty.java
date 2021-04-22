package day20_string_manipulation;

public class StringIsEmpty {
    public static void main(String[] args) {
        String jobTitle = "";
        System.out.println(jobTitle.isEmpty()); //true
        System.out.println(jobTitle.length()); //0
        System.out.println(jobTitle.length() == 0);

        if(jobTitle.isEmpty()) {
            System.out.println("job Title is missing, please resend"); //true
        }else {
            System.out.println("Job title looks good");
        }
        if (jobTitle.length() == 0) {
            System.out.println("Job title is empty");
        }else {
            System.out.println("Job title is not empty");
        }
        if ("".equals(jobTitle)) {
            System.out.println("Job Title is empty");
        }else {
            System.out.println("Job Title is not empty");
        }
        String word = " ";
        System.out.println(word.isEmpty()); //false
        System.out.println(word.length()); //1

        String veggie = "carrot";
        System.out.println(veggie.isEmpty());
        if (!veggie.isEmpty()) {
            System.out.println("We have " + veggie);
        }
    }




}
