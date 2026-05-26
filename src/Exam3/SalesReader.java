package Exam3;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class SalesReader {
    private String filePath;
    private ArrayList<Integer> sales;

    public SalesReader (String filePath) {
        this.filePath = filePath;
        this.sales = new ArrayList<>();
    }

    public void readFile(){
        try {
            File file= new File(filePath);
            Scanner scanner = new Scanner(file);

            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                int month = Integer.parseInt(parts[0]);
                int sale = Integer.parseInt(parts[1]);
                sales.add(sale);
            }
            scanner.close();
        } catch (IOException e) {
            System.out.println("File not found" + e.getMessage());
        }
    }

    public int total(){
        int sum = 0;
        for(int sale : sales){
            sum = sum + sale;
        }
        return sum;
    }

    public double average(){
        double average = (double) total() / sales.size();
        return average;
    }

    public int max (){
        int max = sales.get(0);
        for(Integer i : sales){
            if(i > max){
                max = i;
            }
        }
        return max;
    }
}
