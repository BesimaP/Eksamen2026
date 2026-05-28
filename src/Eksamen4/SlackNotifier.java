package Eksamen4;

    public class SlackNotifier implements Notifier {
        private String channel;

        public SlackNotifier(String channel){
            this.channel = channel;
        }

        @Override
        public void send(String message, int priority){
            if(priority >= 5){
                System.out.println("[VIGTIG] Slack: " + channel + ": " + message);
            } else {
                System.out.println("Slack: " + channel + ": " + message);
            }
        }
    }
