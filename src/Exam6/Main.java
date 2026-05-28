package Exam6;

public class Main {

    public static void main(String [] args){
        Engine engine = new Engine();
        Car car = new Car("Tesla", engine);

        System.out.println("--- INITIAL STATE ---");
        System.out.println("Engine running: " + car.isRunning());

        System.out.println("\n--- START ENGINE ---");
        car.start();
        System.out.println("Engine running: " + car.isRunning());

        System.out.println("\n--- DOUBLE START (should be rejected) ---");
        car.start();

        System.out.println("\n--- STOP ENGINE ---");
        car.stop();
        System.out.println("Engine running: " + car.isRunning());
    }
}
