package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Phonebook {
  private ArrayList<Contact> phoneBook = new ArrayList<Contact>();

  public Phonebook() {
  }

  public Phonebook(ArrayList<Contact> phoneBook) {
    this.phoneBook = phoneBook;
  }

  // Getter
  public ArrayList<Contact> getPhoneBook() {
    return phoneBook;
  }

  // Setter
  public void setPhoneBook(ArrayList<Contact> phoneBook) {
    this.phoneBook = phoneBook;
  }

  public void addContact(Contact contact) {
    this.phoneBook.add(contact);
  }

  public void searchContact(String filter) {
    ArrayList<Contact> filteredPhoneBook = new ArrayList<Contact>();
    for (Contact contact : getPhoneBook()) {
      if (contact.getFirstName().toLowerCase().equals(filter.toLowerCase().trim()) || contact.getLastName().toLowerCase().equals(filter.toLowerCase().trim())) {
        filteredPhoneBook.add(contact);
      }
    }
    System.out.println("Total of " + filteredPhoneBook.size() + " matching the search");
    for (Contact contact : filteredPhoneBook) {
      System.out.println("---------------------------------------");
      System.out.println("First Name: " + contact.getFirstName());
      System.out.println("Last Name: " + contact.getLastName());
      System.out.println("Address: " + contact.getAddress());
      System.out.println("Email: " + contact.getEmail());
      System.out.println("Contact Number: " + contact.getContactNumber());
      System.out.println("---------------------------------------");
    }
  }

  public void updateContact(String filter, Scanner appScanner) {
    ArrayList<Contact> phoneBook = this.phoneBook;
    for (int i = 0; i < phoneBook.size(); i++) {
      if (phoneBook.get(i).getFirstName().toLowerCase().equals(filter.toLowerCase().trim()) || phoneBook.get(i).getLastName().toLowerCase().equals(filter.toLowerCase().trim())) {
        System.out.println("Update this contact?(Y/N):");
        System.out.println("First Name: " + phoneBook.get(i).getFirstName());
        System.out.println("Last Name: " + phoneBook.get(i).getLastName());
        System.out.println("Address: " + phoneBook.get(i).getAddress());
        System.out.println("Email: " + phoneBook.get(i).getEmail());
        System.out.println("Contact Number: " + phoneBook.get(i).getContactNumber());
        String option = appScanner.nextLine();

        if (option.toLowerCase().trim().equals("y")){
          System.out.println("Update Contact:");

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
          long contactNumber =Long.parseLong(appScanner.nextLine());

          phoneBook.get(i).setFirstName(firstName);
          phoneBook.get(i).setLastName(lastName);
          phoneBook.get(i).setAddress(address);
          phoneBook.get(i).setEmail(email);
          phoneBook.get(i).setContactNumber(contactNumber);

          System.out.println("Contact Updated!");
        }

      }
    }
  }

  public boolean isPhoneBookEmpty (ArrayList<Contact> phoneBook){


    return true;
  }



}