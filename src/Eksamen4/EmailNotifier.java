package Eksamen4;

    public class EmailNotifier implements Notifier {
        private String recipient;
        private int sentCount = 0;

        public EmailNotifier(String recipient){
            this.recipient = recipient;
        }

        @Override
        public void send(String message, int priority){
            if(priority >= 5){
                System.out.println("[VIGTIGT] Email to " + recipient + ": " + message);
            } else {
                System.out.println("Email to: " + recipient + ": " + message);
            }
            sentCount++;
        }

        public int getSentCount(){
            return sentCount;
        }
    }
