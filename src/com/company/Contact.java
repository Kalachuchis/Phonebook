package com.company;

public class Contact {
  private String firstName;
  private String lastName;
  private String address;
  private String email;
  private long contactNumber;

  // Constructor
  public Contact(){}

  public Contact(String firstName, String lastName, String address, String email, long contactNumber) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.address = address;
    this.email = email;
    this.contactNumber = contactNumber;
  }

  // Setter
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setContactNumber(long contactNumber) {
    this.contactNumber = contactNumber;
  }

  // Getter
  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getAddress() {
    return address;
  }

  public String getEmail() {
    return email;
  }

  public long getContactNumber() {
    return contactNumber;
  }
}
