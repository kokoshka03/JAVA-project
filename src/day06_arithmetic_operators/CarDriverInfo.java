package day06_arithmetic_operators;

public class CarDriverInfo {
    public static void main(String[] args){
//        String carModel;
//        carModel = "BMW X5";
        String carModel = "Jeep Wrangler";
        String driverName = "Batman";
        String licenseNumber = "btm123";
        short speed = 80;
        boolean isAutomatic = false;
        char licenseClass = 'D';

        System.out.println("car model: " + carModel);
        System.out.println(carModel + " is car model.");
        System.out.println("Driver Name:" + driverName);
        System.out.println(driverName+ " is driving a car");
        System.out.println(driverName+ " is driving " +carModel);
        System.out.println("Current speed is: "+ speed + " mph");
        System.out.println("is car automatic ->" + isAutomatic);
        System.out.println(licenseClass + " " +isAutomatic);
        System.out.println(isAutomatic + "-" + licenseClass);


    }
}
