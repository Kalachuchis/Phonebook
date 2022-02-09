package com.company;

import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
//        Contact testContact = new Contact("John", "Smith", "Long Beach City", "jsmith@lbc.com", "0000000");
//
//
//        newPhoneBook.addContact(testContact);
//
//        ArrayList<Contact> phoneBook = newPhoneBook.getPhoneBook();

        Scanner appScanner = new Scanner(System.in);
        Phonebook newPhoneBook = new Phonebook();
        int option = 0;
        boolean running = true;
        try {
            while (running) {
                if (option == 0) {
                    System.out.println("Phonebook Capstone Project Using Object Oriented Programming");
                    System.out.println(" [1]Display Contacts - [2]Add Contact - [3]Update Contact - [4]Remove Contact - [5]Search Contact - [6]Close app");
                    System.out.println("|===============================================================================================================|");
                    option = Integer.parseInt(appScanner.nextLine().trim());
                    continue;
                } else if (option == 1) {
                    ArrayList<Contact> phoneBook = newPhoneBook.getPhoneBook();
                    if (phoneBook.size() != 0) {
                        System.out.println("This phonebook has " + phoneBook.size() + " contact/s.");
                        for (int i = 0; i < phoneBook.size(); i++) // Display whole phonebook
                        {
                            System.out.println((i+1));
                            System.out.println("First Name: " + phoneBook.get(i).getFirstName());
                            System.out.println("Last Name: " + phoneBook.get(i).getLastName());
                            System.out.println("Address: " + phoneBook.get(i).getAddress());
                            System.out.println("Email: " + phoneBook.get(i).getEmail());
                            System.out.println("Contact Number: " + phoneBook.get(i).getContactNumber());
                            System.out.println("-----------------------------------------------");
                        }
                    } else {
                        System.out.println("\n\n\n\n\n\n\n\nPhonebook is empty. Add Contacts");
                        option = 0;
                    }
                    option = 0;
                    continue;
                } else if (option == 2){
                    Contact newContact = new Contact();

                    System.out.println("Please enter details:");
                    System.out.println("First Name:");
                    String firstName = appScanner.nextLine().trim();
                    System.out.println("Last Name:");
                    String lastName = appScanner.nextLine().trim();
                    System.out.println("Address:");
                    String address = appScanner.nextLine().trim();
                    System.out.println("Email address:");
                    String email = appScanner.nextLine().trim();
                    System.out.println("Contact Number:");
                    String contactNumber = appScanner.nextLine().trim();

                    newContact.setFirstName(firstName);
                    newContact.setLastName(lastName);
                    newContact.setAddress(address);
                    newContact.setEmail(email);
                    newContact.setContactNumber(contactNumber);

                    newPhoneBook.addContact(newContact);
                    System.out.println("PhoneBook updated!" );
                    System.out.println(newContact.getFirstName() + " " + newContact.getLastName() + " Added");

                    option = 0;
                    continue;

                } else if (option == 3){
                    //TODO: UPDATE CONTACT
                } else if (option == 4){
                    //TODO: REMOVE CONTACT
                } else if (option == 5){
                    //TODO: SEARCH CONTACT
                }
            else if (option == 6){
                    running = false;
                    continue;
                }

            }
        } catch(Exception e){
                System.out.println("Invalid");
            }



    }
}
