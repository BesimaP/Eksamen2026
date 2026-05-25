package Eksamen6;

    public class Main {
        public static void main(String [] args ){
            Engine engine = new Engine();
            Car car1 = new Car("Tesla", engine);

            System.out.println("Status før start: " + engine.isRunning() + "\n");

            car1.start();
            System.out.println("Status efter start: " + engine.isRunning() + "\n");

            car1.start();  // dobbelt-start
            System.out.println("Status efter dobbelt-start: " + engine.isRunning() + "\n");

            car1.stop();
            System.out.println("Status efter stop: " + engine.isRunning() + "\n");
        }
    }
