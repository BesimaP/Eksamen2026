package Eksamen2;

import java.util.ArrayList;

    public class PhoneBook {
        private ArrayList<Contact>contacts;

        public PhoneBook(){
            this.contacts = new ArrayList<>();
        }

        public void add(Contact c){
            if(findByName(c.getName()) == null){
                contacts.add(c);
            } else {
                System.out.println(c.getName() + "findes allerede i telefonbogen");
            }
        }

        public Contact findByName(String name){
            for(Contact c : contacts){
                if(name.equalsIgnoreCase(c.getName()) ){
                    return c;
                }
            }
            return null;
        }

        public void remove(String name){
            Contact c = findByName(name);
            if(c != null){
                contacts.remove(c);
            }
        }

        public int size(){
            return contacts.size();
        }

        public void printAll(){
            for(Contact c : contacts){
                System.out.println(c);
            }
        }


    }
