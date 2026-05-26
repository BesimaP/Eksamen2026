package Exam6;

public class Main {

    public static void main(String [] args){
        Engine engine = new Engine();
        Car car = new Car("Tesla", engine);

        System.out.println("Engine running: " + car.isRunning());

        car.start();
        System.out.println("Engine running: " + car.isRunning());

        car.start();   // dobbelt-start, skal afvises

        car.stop();
        System.out.println("Engine running: " + car.isRunning());
    }
}
