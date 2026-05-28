package Eksamen3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

    public class SalesReader {
       private String filePath;
       private ArrayList<Sale> sales;

       public SalesReader(String filepath){
         this.filePath = filepath;
         this.sales = new ArrayList<>();
       }

       public void readFile(){
           String header;
           try{
               File file = new File(filePath);
               Scanner scan = new Scanner(file);

               header = scan.nextLine();

               while(scan.hasNextLine()){
                   String line = scan.nextLine();
                   String [] parts = line.split(",");
                   int month = Integer.parseInt(parts[0]);
                   int sale = Integer.parseInt(parts[1]);
                   sales.add(new Sale(month, sale));
               }
               scan.close();
           }catch (FileNotFoundException e){
               System.out.println("File not found" + e.getMessage());
           }
       }

       public int total(){
           int sum = 0;
           for(Sale s : sales){
               sum = sum + s.getAmount();
           }
           return sum;
       }

       public double average(){
           double average = (double) total() / sales.size();
           return average;
       }

       public int max (){
           int max = sales.get(0).getAmount();
           for(Sale s : sales){
               if(s.getAmount() > max){
                   max = s.getAmount();
               }
           }
           return max;
       }

       public int min(){
           int min = sales.get(0).getAmount();
           for(Sale s : sales){
               if(s.getAmount() < min){
                   min = s.getAmount();
               }
           }
           return min;
       }

       public ArrayList<Integer> salesAbove(int threshold){
           ArrayList<Integer> result = new ArrayList<>(); //Tom liste oprettes
           for(Sale s : sales) {                        //Foreach loop gennem alle salg
               if (s.getAmount() > threshold) {                      // if tjek mod threshold
                   result.add(s.getAmount());                        // Tilføjer kun dem over grænsen
               }
           }
           return result; //returnerer listen
       }

       public int count(){ //returnerer antal salgstal
           return sales.size();
       }

       public void printAll(){
           for(Sale s : sales){
               System.out.println(s);
           }
       }

        public int maxMonth(){
            Sale maxSale = sales.get(0);
            for(Sale s : sales){
                if(s.getAmount() > maxSale.getAmount()){
                    maxSale = s;
                }
            }
            return maxSale.getMonth();
        }

        public void writeToFile(String path){
            try {
                FileWriter writer = new FileWriter(path);
                writer.write("Total: " + total() + "\n");
                writer.write("Average: " + average() + "\n");
                writer.write("Max: " + max() + "\n");
                writer.close();
            } catch (IOException e) {
                System.out.println("Fejl ved skrivning: " + e.getMessage());
            }
        }
    }
