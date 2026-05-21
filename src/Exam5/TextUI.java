package Exam5;

import java.util.Scanner;

    public class TextUI {
        private Scanner scan;
        private MessageApp app;

        public TextUI(MessageApp app){
            this.scan = new Scanner(System.in);
            this.app = app;
        }

        public String promptText(String msg){
            System.out.println(msg);
            return scan.nextLine();
        }

        public void start(){
            String menu = "1. Tilføj besked\n2. Vis alle beskeder\n3. Afslut";
            boolean running = true;

            while(running){
                String valg = promptText(menu);

                switch(valg){
                    case "1":
                        String besked = promptText("Indtast besked:");
                        app.add(besked);
                        break;
                    case "2":
                        System.out.println(app.listAllMessages());
                        break;
                    case "3":
                        running = false;
                        break;
                }
            }
        }
    }
