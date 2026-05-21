package Exam2;

public class Main {

    public static void main(String [] args ){
        PhoneBook phoneBook = new PhoneBook();

        Contact contact1 = new Contact("Besima", "25623777");
        Contact contact2 = new Contact("Louise", "51678904");
        Contact contact3 = new Contact("Olga", "45678921");

        phoneBook.add(contact1);
        phoneBook.add(contact2);
        phoneBook.add(contact3);

        Contact fundet = phoneBook.findByName("Besima");
        System.out.println(fundet);

        Contact ikkeFundet = phoneBook.findByName("Tess");
        System.out.println(ikkeFundet);
    }
}
