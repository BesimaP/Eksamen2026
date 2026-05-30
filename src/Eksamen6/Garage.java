package Eksamen6;

import java.util.ArrayList;

    public class Garage {
        private ArrayList<Car> cars;

        public Garage(){
            this.cars = new ArrayList<>();
        }

        public void add(Car car){
            cars.add(car);
        }

        public void startAll(){
            for(Car c : cars){
                c.start();
            }
        }

        public void startAll2(){
            for(int i = 0; i< cars.size();i++){
                System.out.println(i + ":" + cars.get(i));
            }
        }
    }
