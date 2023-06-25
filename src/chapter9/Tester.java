package chapter9;

public class Tester {
    public static void main(String[] args) {
        Cake cake = new Cake("Vanilla", 10.99);
        System.out.println("Cake Flavor: " + cake.getFlavor());
        System.out.println("Cake Price: " + cake.getPrice() + "\n");

        BirthdayCake birthdayCake = new BirthdayCake("Birthday Flavor", 5.99);
        System.out.println("Cake Flavor: " + birthdayCake.getFlavor());
        System.out.println("Cake Price: " + birthdayCake.getPrice() + "\n");

        WeddingCake weddingCake = new WeddingCake("Strawberry", 499.99);
        System.out.println("Cake Flavor: " + weddingCake.getFlavor());
        System.out.println("Cake Price: " + weddingCake.getPrice() + "\n");

    }
}
