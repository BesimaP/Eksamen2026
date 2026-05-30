package Eksamen6;

    public class ElectricEngine extends Engine{
        private double batteryLevel;

        public ElectricEngine(int horsepower, int fuel, double batteryLevel){
            super(horsepower,fuel);
            this.batteryLevel = batteryLevel;
        }

        @Override
        public void start(){
            if(batteryLevel > 0 ){
                super.start();
            } else {
                System.out.println("Ikke nok batteri");
            }
        }

    }
