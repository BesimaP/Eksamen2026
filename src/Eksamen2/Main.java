package Eksamen2;

public class Main {

        public static void main(String [] args) {
            Contact contact1 = new Contact("Besima", "25623777");
            Contact contact2 = new Contact("Louise", "51555180");
            Contact contact3 = new Contact("Olga", "28918108");

            PhoneBook phoneBook = new PhoneBook();

            phoneBook.add(contact1);
            phoneBook.add(contact2);
            phoneBook.add(contact3);

            String søgenavn = "Tess";
            Contact fundet = phoneBook.findByName(søgenavn);

            if(fundet == null){
                System.out.println(søgenavn + " findes ikke i telefonbogen");
            } else {
                System.out.println(søgenavn + " fundet i telefonbogen");
            }

            phoneBook.printAll();
        }
    }
