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

            EmailNotifier email = new EmailNotifier("besima96@hotmail.com");
            SmsNotifier sms = new SmsNotifier();
            SlackNotifier slack = new SlackNotifier("general");

            notifiers.add(email);
            notifiers.add(sms);
            notifiers.add(slack);

            System.out.println("--- SENDING NOTIFICATIONS ---");
            notifyAll(notifiers, "Hej alle sammen!");
        }
    }