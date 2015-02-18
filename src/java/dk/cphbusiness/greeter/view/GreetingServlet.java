package dk.cphbusiness.greeter.view;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "GreetingServlet", urlPatterns = {"/Greeting"})
public class GreetingServlet extends HttpServlet {

  @Override
  protected void service(
      HttpServletRequest request,
      HttpServletResponse response
      ) throws ServletException, IOException {
    response.setContentType("text/html; charset=utf8");
    PrintWriter out = response.getWriter();
    out.println("Hello 2nd Semester");
    }
  
  }
