package day35_methods_with_parameters;

public class Email {
    public static void main(String[] args) {
        buildEmail("Saim","Cybertekschool");
        buildEmail("John WardIII","Verizon");
    }
    public static void buildEmail(String name,String domain) {
        name = name.replace("","_").toLowerCase();
        domain =domain.toLowerCase();
        String email = name + "@" + domain + ".com";
        System.out.println(email);

    }

}
