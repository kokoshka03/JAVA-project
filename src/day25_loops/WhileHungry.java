package day25_loops;

public class WhileHungry {
    public static void main(String[] args) {
        boolean isHungry = true;
        int bananas = 0;
        int CountToFull = 5;
        // while (isHungry && bananas != countToFull)
        while (isHungry ) {
            bananas++;
            System.out.println("Eating banana " + bananas);
            //isHungry = bananas == countToFull? false: true;
            if (bananas == CountToFull ) {
                isHungry = false;
            }
        }
        System.out.println("Had enough bananas, let's get back to studying");
    }
}
