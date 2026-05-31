package Exam2;

import java.util.ArrayList;

    public class PhoneBook {
        private ArrayList <Contact> contacts;

        public PhoneBook(){
            this.contacts = new ArrayList<>();
        }

        public void add(Contact c){
            contacts.add(c);
        }

        public Contact findByName(String name){
            for(Contact c : contacts){
                if(name.equals(c.getName())){
                   return c;
                }
            }
            return null;
        }
    }
