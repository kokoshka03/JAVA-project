package day05_primitives_concatanation;

public class CellPhone {
    public static void main(String[] args){
        String brand = "Apple";
        String model = "iphone 12";
        String color = "gray";
        double price = 699.0;
        int storage = 256;
        boolean hasCamera = true;
        System.out.println(brand);
        System.out.println(model);
        System.out.println("Brand is " + brand);
        System.out.println("model is " + model);
        System.out.println("color is " + color);
        System.out.println("price is $" + price);
        System.out.println("storage is " + storage + "GB");

        System.out.println("Has camera? - " + hasCamera);


    }

}
