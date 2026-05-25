package Eksamen5;

import java.util.ArrayList;

    public class MessageApp {
        private ArrayList<String> messages;

        public MessageApp(){
         this.messages = new ArrayList<>();
        }

        public void add(String message){
            messages.add(message);
        }

        public ArrayList<String> listAllMessages(){
            return messages;
        }
    }
