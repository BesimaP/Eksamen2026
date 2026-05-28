package Exam3;

public class Main {

    public static void main(String [] args){
        SalesReader salesReader = new SalesReader("data/sales.csv");

        salesReader.readFile();

        System.out.println("--- SALES STATISTICS ---");
        System.out.println("Total: " + salesReader.total());
        System.out.println("Max: " + salesReader.max());
        System.out.println("Average: " + salesReader.average());
    }
}
