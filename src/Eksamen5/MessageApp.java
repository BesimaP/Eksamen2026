package Eksamen5;

import java.util.ArrayList;

    public class MessageApp {
        private ArrayList<Message> messages;

        public MessageApp(){
         this.messages = new ArrayList<>();
        }

        public void add(String message){
            if(message != null && !message.isEmpty()){
                messages.add(new Message(message));
            } else {
                System.out.println("Tom besked kan ikke tilføjes");
            }
        }

        public void remove(int index){
            messages.remove(index);
        }

        public ArrayList<Message> search(String word){
            ArrayList<Message> result = new ArrayList<>();
            for(Message m : messages){
                if(m.getText().contains(word)){
                  result.add(m);
                }
            }
            return result;
        }

        public int size(){
            return messages.size();
        }

        public ArrayList<Message> listAllMessages(){
            return messages;
        }

        public void edit(int index, String newText){
            if(index >= 0 && index < messages.size()){
                messages.set(index, new Message(newText));
            }
        }
    }
