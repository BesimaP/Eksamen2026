package Eksamen4;

    public class PushNotifier implements Notifier {
        private String deviceToken;

        public PushNotifier(String deviceToken){
            this.deviceToken = deviceToken;
        }

        @Override
        public void send(String message, int priority) {
            if(priority >= 5){
                System.out.println("[VIGTIGT] Push to " +  deviceToken + ": " + message);
            } else {
                System.out.println("Push to " + deviceToken + ": " + message);
            }
        }
    }