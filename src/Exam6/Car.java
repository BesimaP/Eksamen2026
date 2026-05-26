package Exam6;

public class Car {

    private String model;
    private Engine engine;

    public Car (String model, Engine engine){
        this.model = model;
        this.engine = engine;
    }

    public void start(){
        if(!engine.isRunning()){
            engine.start();
        } else {
            System.out.println("The car is already running");
        }
    }

    public void stop(){
        engine.stop();
    }

    public boolean isRunning(){
        return engine.isRunning();
    }
}
