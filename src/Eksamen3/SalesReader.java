package Eksamen3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

    public class SalesReader {
       private String filePath;
       private ArrayList<Integer> sales;

       public SalesReader(String filepath){
         this.filePath = filepath;
         this.sales = new ArrayList<>();
       }

       public void readFile(){
           try{
               File file = new File(filePath);
               Scanner scan = new Scanner(file);
               while(scan.hasNextLine()){
                   String line = scan.nextLine();
                   String [] parts = line.split(",");
                   int month = Integer.parseInt(parts[0]);
                   int sale = Integer.parseInt(parts[1]);
                   sales.add(sale);
               }
               scan.close();
           }catch (FileNotFoundException e){
               System.out.println("File not found" + e.getMessage());
           }
       }

       public int total(){
           int sum = 0;
           for(Integer i : sales){
               sum = sum + i;
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
