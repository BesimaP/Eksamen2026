package Exam4;

    public class EmailNotifier implements Notifier {
        private String recipient;

        public EmailNotifier(String recipient){
            this.recipient = recipient;
        }

        @Override
        public void send(String message) {
            System.out.println("Email to " + recipient + ": " + message);
        }
    }
