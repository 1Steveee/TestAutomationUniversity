package chapter9practice;

public class Practice {
    public static void main(String[] args) {
        Van van = new Van();
        van.setColor("blue");
        System.out.println(van.getColor());

        Car car = new Car();
        car.setMake("Honda");
        System.out.println(car.getMake());

        Car carTwo = new Van();
        carTwo.setYearMade(1990);
        System.out.println(carTwo.getYearMade());

//        Does not work since Car is not of type Van
   //     Van vanTwo = new Car();

    }
}
