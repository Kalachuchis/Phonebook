package com.company;

import java.util.ArrayList;

public class Phonebook {
  private ArrayList<Contact> phoneBook= new ArrayList<Contact>();
  public Phonebook (){}

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

  public void addContact(Contact contact){
    this.phoneBook.add(contact);
  }

  public void removeContact(Contact contact){
    this.phoneBook.remove(contact);
  }
}
