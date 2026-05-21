package Exam3;

public class Main {

    public static void main(String [] args){
        SalesReader salesReader = new SalesReader("data/sales.csv");

        System.out.println("Læse filen");
        salesReader.readFile();
        System.out.println();

        System.out.println("Total: " + salesReader.total());

        System.out.println("Max: " + salesReader.max());

        System.out.println("Average: " + salesReader.average());

        System.out.printf("Average: %.2f%n", salesReader.average());
        System.out.println("Average: " + String.format("%.2f", salesReader.average()));

        System.out.println("Min: " + salesReader.min());
    }
}
