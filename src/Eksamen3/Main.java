package Eksamen3;

    public class Main {

        public static void main(String [] args){
            SalesReader salesReader = new SalesReader("data/sales.csv");

            salesReader.readFile();

            System.out.println("Total: " + salesReader.total());
            System.out.println("Average: " + String.format("%.2f",salesReader.average()));
            System.out.println("Max: " + salesReader.max());
        }
    }
