package dk.cphbusiness.greeter.model;

import java.util.Collection;

public interface PeopleManager {
  Person find(String email);
  Collection<Person> list();
  }
