package chapter9practice;

public class Son extends Person {

    @Override
    public void printAgeInTwentyYears() {
        System.out.println(getAge() + 20 + 10);
        System.out.println("Method was overwritten and added 10 years");
    }
}
