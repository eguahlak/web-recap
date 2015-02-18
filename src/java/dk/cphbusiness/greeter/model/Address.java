package dk.cphbusiness.greeter.model;

public class Address {
  private String street;
  private Postal postal;

  public Address() { }
  
  public Address(String street, Postal postal) {
    this.street = street;
    this.postal = postal;
    }

  public String getStreet() {
    return street;
    }

  public Postal getPostal() {
    return postal;
    }
  
  }
