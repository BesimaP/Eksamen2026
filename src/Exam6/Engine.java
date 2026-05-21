package Exam6;

public class Engine {
    private boolean running;

    public Engine(){
        this.running = false;
    }

    public void start(){
        running = true;
    }

    public void stop(){
        running = false;
    }

    public boolean isRunning(){
        return running;
    }
}
