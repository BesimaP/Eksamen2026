package Eksamen6;

    public class ElectricEngine extends Engine{
        private double batteryLevel;

        public ElectricEngine(int horsepower, double batteryLevel){
            super(horsepower);
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
