package Exam4;

    public class SlackNotifier implements Notifier{
        private String channel;

        public SlackNotifier(String channel){
            this.channel = channel;
        }

        @Override
        public void send(String message) {
            System.out.println("Slack besked til kanal " + channel + ": " + message);
        }
    }
