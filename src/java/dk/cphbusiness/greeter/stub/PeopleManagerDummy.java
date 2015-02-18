package dk.cphbusiness.greeter.stub;

import dk.cphbusiness.greeter.model.Address;
import dk.cphbusiness.greeter.model.PeopleManager;
import dk.cphbusiness.greeter.model.Person;
import dk.cphbusiness.greeter.model.Postal;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class PeopleManagerDummy implements PeopleManager {
  private final Map<String, Person> people = new HashMap<>();

  public PeopleManagerDummy() {
    Postal frds = new Postal(3600, "Frederikssund");
    Postal lyngby = new Postal(2800, "Kgs. Lyngby");
    
    Address hansenHome = new Address("Byvej 7", frds);
    Address jensenHome = new Address("Landevejen 8", lyngby);
    Address olsenHome = new Address("Nørgaardsvej 30", lyngby);
  
    people.put("kurt@mail.dk", 
        new Person("Kurt", "Hansen", "kurt@mail.dk", 34, hansenHome)
        );
    people.put("sonja@mail.dk", 
        new Person("Sonja", "Hansen", "sonja@mail.dk", 36, hansenHome)
        );
    people.put("ole@gmail.com", 
        new Person("Ole", "Jensen", "ole@gmail.com", 36, jensenHome)
        );
    }
  
  @Override
  public Person find(String email) {
    if (email == null) return null;
    return people.get(email);
    }

  @Override
  public Collection<Person> list() {
    return people.values();
    }
  
  }
