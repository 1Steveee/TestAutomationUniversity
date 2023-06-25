package chapter9practice;

public class Practice {
    public static void main(String[] args) {
        Van van = new Van("Benz","S550");
        van.setColor("Red");
        System.out.println(van.getColor());

        Car car = new Car("Blue","Honda","Civic",1990);
        System.out.println(car.getMake());


//        Does not work since Car is not of type Van
   //     Van vanTwo = new Car();

    }
}
