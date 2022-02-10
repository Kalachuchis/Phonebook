package com.company;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Contact testContact = new Contact("John", "Smith", "Long Beach City", "jsmith@lbc.com", 10000000);



        Scanner appScanner = new Scanner(System.in);
        Phonebook newPhoneBook = new Phonebook();
        newPhoneBook.addContact(testContact);

        int option = 0;
        boolean running = true;
        try {
            while (running) {
                // Main Page
                if (option == 0) {
                    System.out.println("Phonebook Capstone Project Using Object Oriented Programming");
                    System.out.println(" [1]Display Contacts - [2]Add Contact - [3]Update Contact - [4]Remove Contact - [5]Search Contact - [6]Close app");
                    System.out.println("|===============================================================================================================|");
                    option = Integer.parseInt(appScanner.nextLine().trim());
                }

                //Display Contact
                else if (option == 1) {
                    ArrayList<Contact> phoneBook = newPhoneBook.getPhoneBook();
                    if (phoneBook.size() != 0) {
                        System.out.println("This phonebook has " + phoneBook.size() + " contact/s.");
                        for (int i = 0; i < phoneBook.size(); i++) // Display whole phonebook
                        {
                            System.out.println((i + 1));
                            System.out.println("First Name: " + phoneBook.get(i).getFirstName());
                            System.out.println("Last Name: " + phoneBook.get(i).getLastName());
                            System.out.println("Address: " + phoneBook.get(i).getAddress());
                            System.out.println("Email: " + phoneBook.get(i).getEmail());
                            System.out.println("Contact Number: " + phoneBook.get(i).getContactNumber());
                            System.out.println("-----------------------------------------------");
                        }
                    } else {
                        System.out.println("\n\n\n\n\n\n\n\nPhonebook is empty. Add Contacts");
                    }
                    option = 0;
                }
                // Add Contact
                else if (option == 2) {
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
//                    System.out.print("+63 ");
                    long contactNumber = Long.parseLong(appScanner.nextLine());

                    newContact.setFirstName(firstName);
                    newContact.setLastName(lastName);
                    newContact.setAddress(address);
                    newContact.setEmail(email);
                    newContact.setContactNumber(contactNumber);

                    newPhoneBook.addContact(newContact);
                    System.out.println("PhoneBook updated!");
                    System.out.println(newContact.getFirstName() + " " + newContact.getLastName() + " Added");

                    option = 0;

                }
                // Update Contact
                else if (option == 3) {
                    //goes back to main page if phonebook is empty
                    if (newPhoneBook.getPhoneBook().size() == 0){
                        System.out.println("Phonebook is empty");
                        option = 0;
                        continue;
                    }
                    System.out.println("Search Contact:");
                    String filter = appScanner.nextLine();
                    newPhoneBook.updateContact(filter, appScanner);
                    option = 0;

                }
                // Remove Contact
                else if (option == 4) {
                    //TODO: REMOVE CONTACT
                    ArrayList<Contact> phoneBook = newPhoneBook.getPhoneBook();
                    if (phoneBook.size() == 0){
                        System.out.println("Phonebook is empty");
                        option = 0;
                        continue;
                    }
                    System.out.println("Search Contact:");
                    String filter = appScanner.nextLine();
                    for (int i = 0; i < phoneBook.size(); i++) {
                        if (phoneBook.get(i).getFirstName().toLowerCase().equals(filter.toLowerCase().trim()) || phoneBook.get(i).getLastName().toLowerCase().equals(filter.toLowerCase().trim())) {
                            System.out.println("Are you sure you want to delete this contact (y/n)");
                            System.out.println("First Name: " + phoneBook.get(i).getFirstName());
                            System.out.println("Last Name: " + phoneBook.get(i).getLastName());
                            System.out.println("Address: " + phoneBook.get(i).getAddress());
                            System.out.println("Email: " + phoneBook.get(i).getEmail());
                            System.out.println("Contact Number: " + phoneBook.get(i).getContactNumber());
                            String choiceToRemove = appScanner.nextLine().toLowerCase();

                            if (choiceToRemove.equals("y")) {
                                phoneBook.remove(i);
                            }
                        } else {
                            System.out.println("Contact does not exist");
                        }
                    }
                    option = 0;
                }
                //Search Contact
                else if (option == 5) {
                    //TODO: SEARCH CONTACT
                    if (newPhoneBook.getPhoneBook().size() == 0){
                        System.out.println("Phonebook is empty");
                        option = 0;
                        continue;
                    }
                    System.out.println("Search Contact:");
                    String filter = appScanner.nextLine();
                    newPhoneBook.searchContact(filter);
                    option = 0;

                }
                // Exit app
                else if (option == 6) {
                    running = false;
                }
            }
        } catch(Exception e){
                System.out.println(e);
                e.printStackTrace();
            }



    }
}
