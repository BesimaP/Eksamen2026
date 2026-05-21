package Exam4;

import java.util.ArrayList;

public class Main {
        public static void notifyAll(ArrayList<Notifier> notifiers, String message){
            for(Notifier n : notifiers){
                n.send(message);
            }
        }

        public static void main(String[] args){
            ArrayList<Notifier> notifiers = new ArrayList<>();

            notifiers.add(new EmailNotifier("besima96@hotmail.com"));
            notifiers.add(new SmsNotifier());
            notifiers.add(new SlackNotifier("general"));

            notifyAll(notifiers,"Hej alle sammen!");
        }
    }

