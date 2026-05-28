package Eksamen5;

import java.util.Scanner;

    public class TextUI {
        private Scanner scanner;
        private MessageApp app;

        public TextUI(MessageApp app){
            this.scanner = new Scanner(System.in);
            this.app = app;
        }

        public String promptText(String msg){
            System.out.println(msg);
            return scanner.nextLine();
        }

        public void start(){
            boolean isRunning = true;

            while(isRunning){
                String choice = promptText("Menu:\n1.Tilføj besked\n2.Vis alle beskeder\n3.Fjerne besked\n4.Søg efter besked\n5.Antal beskeder\n6.Rediger besked\n7.Afslut");

                 switch(choice){
                     case "1":
                         String besked = promptText("Indtast besked: ");
                         app.add(besked);
                         break;
                     case "2":
                         System.out.println(app.listAllMessages());
                         break;
                     case "3":
                         System.out.println(app.listAllMessages());
                         int index = Integer.parseInt(promptText("Hvilken besked vil du fjerne?"));
                         app.remove(index);
                         break;
                     case "4":
                         String searchword = promptText("Skriv et søgeord");
                         System.out.println(app.search(searchword));
                        break;
                     case "5":
                         System.out.println(app.size());
                         break;
                     case "6":
                         System.out.println(app.listAllMessages());
                         int editIndex = Integer.parseInt(promptText("Hvilken besked vil du ændre?"));
                         String newText = promptText("Indtast den nye tekst: ");
                         app.edit(editIndex,newText);
                         break;
                     case "7":
                         isRunning = false;
                         break;
                 }
            }
        }
    }
