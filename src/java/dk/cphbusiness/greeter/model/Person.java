package dk.cphbusiness.greeter.model;

public class Person {
  private String firstName;
  private String lastName;
  private String email;
  private int age;
  private Address address;

  public Person() { }

  public Person(
      String firstName, 
      String lastName,
      String email,
      int age,
      Address address
      ) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.age = age;
    this.address = address;
    }

  @Override
  public String toString() {
    return firstName+" "+lastName+" is "+age+" years old";
    }

  
  
  public String getFirstName() {
    return firstName;
    }

  public String getLastName() {
    return lastName;
    }

  public String getName() {
    return firstName+" "+lastName;
    }
  
  public String getEmail() {
    return email;
    }

  public int getAge() {
    return age;
    }

  public Address getAddress() {
    return address;
    }
  
  }
