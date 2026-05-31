package Exam2;

import java.util.Scanner;

public class Main {
        public static void main(String [] args){
            PhoneBook phoneBook = new PhoneBook();

            Contact contact1 = new Contact("Besima", "25623777");
            Contact contact2 = new Contact("Louise", "51678904");
            Contact contact3 = new Contact("Olga", "45678921");

            phoneBook.add(contact1);
            phoneBook.add(contact2);
            phoneBook.add(contact3);

            System.out.println("--- \uD83D\uDD0D SEARCH: Besima ---");
            Contact found = phoneBook.findByName("Besima");
            if(found == null){
                System.out.println("Besima not found in the phone book");
            } else {
                System.out.println("Besima found in the phone book");
            }

            System.out.println("\n--- \uD83D\uDD0D SEARCH: Tess ---");
            Contact notFound = phoneBook.findByName("Tess");
            if(notFound == null){
                System.out.println("Tess not found in the phone book");
            } else {
                System.out.println("Tess found in the phone book");
            }
        }
    }
