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
            boolean isRunning = true;

            while(isRunning){
                String choice = promptText("Menu:\n1.Add message\n2.Show all messages\n3.Exit");

                switch(choice){
                    case "1":
                        String message = promptText("Enter message: ");
                        app.add(message);
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
