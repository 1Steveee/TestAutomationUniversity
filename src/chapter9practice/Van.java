package chapter9practice;

public class Van extends Car {
    private boolean slidingDoor;

    public Van(String make, String model) {
        super(make , model);
//        super(make, model);
        System.out.println("Van object has been created");
    }

    public boolean isSlidingDoor() {
        return slidingDoor;
    }

    public void setSlidingDoor(boolean slidingDoor) {
        this.slidingDoor = slidingDoor;
    }

}
