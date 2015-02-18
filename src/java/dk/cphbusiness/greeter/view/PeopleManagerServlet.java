package dk.cphbusiness.greeter.view;

import dk.cphbusiness.greeter.model.PeopleManager;
import dk.cphbusiness.greeter.model.Person;
import dk.cphbusiness.greeter.stub.PeopleManagerDummy;
import java.io.IOException;
import java.util.Collection;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "PeopleManagerServlet", urlPatterns = {"/People"})
public class PeopleManagerServlet extends HttpServlet {
  private PeopleManager manager = new PeopleManagerDummy();
  
  
  @Override
  protected void service(
      HttpServletRequest request,
      HttpServletResponse response
      ) throws ServletException, IOException {
    String email = request.getParameter("email");
    Person person = manager.find(email);
    
    if (person == null) {
      Collection<Person> people = manager.list();
      request.setAttribute("people", people);
      request.getRequestDispatcher("people-list.jsp").forward(request, response);
      }
    else {
      request.setAttribute("person", person);
      request.getRequestDispatcher("person.jsp").forward(request, response);
      }
    }

  
  }
