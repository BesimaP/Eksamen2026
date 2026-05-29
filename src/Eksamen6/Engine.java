package Eksamen6;

    public class Engine implements Startable {
        private boolean running;
        private int horsepower;
        private int startCount = 0;
        private double fuel;

        public Engine(int horsepower, double fuel){
            this.running = false;
            this.horsepower = horsepower;
            this.fuel = fuel;
        }

        @Override
        public void start(){
            if(!running){
                running = true;
                startCount++;
            } else{
                System.out.println("Motor kører allerede");
            }
        }

        @Override
        public void stop(){
            if(running){
                running = false;
            } else {
                System.out.println("Motor er allerede slukket");
            }
        }

        @Override
        public boolean isRunning(){
            return running;
        }

        public int getHorsepower(){
            return horsepower;
        }

        public double getFuel() {
            return fuel;
        }

        public int getStartCount(){
            return startCount;
        }

        public void consume(double amount){
            fuel = fuel - amount;
            if(fuel <= 0){
                fuel = 0;
                running = false;
                System.out.println("Tom for brændstof - motor stopper");
            }
        }

        public void refuel(double amount){
            fuel = fuel + amount;
        }
    }