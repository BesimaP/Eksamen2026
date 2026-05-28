package Eksamen4;

import java.util.ArrayList;

public class Main {

        public static void notifyAll(ArrayList<Notifier> notifiers, String message, int priority){
               for(Notifier n : notifiers){
                   n.send(message, priority);
               }
        }

        public static void main(String [] args){
            ArrayList<Notifier> notifiers = new ArrayList<>();

            notifiers.add(new EmailNotifier("Besima96@hotmail.com"));
            notifiers.add(new SmsNotifier());
            notifiers.add(new SlackNotifier("General"));

            notifyAll(notifiers, "Hello from me. I'm a live", 10);
        }
    }
