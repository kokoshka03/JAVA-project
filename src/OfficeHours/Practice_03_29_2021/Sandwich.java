package OfficeHours.Practice_03_29_2021;

public class Sandwich {
    public static void main(String[] args) {
        String str = "breadbutterbread";
        if (str.contains("bread")) {

            int firstBread = str.indexOf("bread");
            if (str.substring(firstBread + 5).contains("bread")) {

                int secondBread = str.lastIndexOf("bread");
                System.out.println(str.substring(firstBread + 5,secondBread));

            }


        }else {
            System.out.println("Nothing");
        }



        }
    }

