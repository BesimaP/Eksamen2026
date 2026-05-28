package Eksamen4;

    public class SmsNotifier implements Notifier {

        @Override
        public void send(String message, int priority){
            if(message.length() > 160){
                message = message.substring(0, 160);   // ← altid, før if-else
            }

            if(priority >= 5){
                System.out.println("[VIGTIGT] SMS: " + message);
            } else {
                System.out.println("SMS: " + message);
            }
        }
    }
