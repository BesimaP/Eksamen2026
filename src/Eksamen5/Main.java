package Eksamen5;

    public class Main {

        public static void main(String [] args){
            MessageApp messageApp = new MessageApp();

            TextUI ui = new TextUI(messageApp);
            ui.start();
        }
    }
