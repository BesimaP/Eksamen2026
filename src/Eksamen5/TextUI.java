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
                 String choice = promptText("Menu:\n1.Tilføj besked\n2.Vis alle beskeder\n3.Afslut");

                 switch(choice){
                     case "1":
                         String besked = promptText("Indtast besked: ");
                         app.add(besked);
                         break;
                     case "2":
                         System.out.println(app.listAllMessages());
                         break;
                     case "3":
                         isRunning = false;
                         break;
                 }
            }
        }
    }
