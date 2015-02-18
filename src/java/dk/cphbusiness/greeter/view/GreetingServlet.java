package dk.cphbusiness.greeter.view;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
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
    String who = request.getParameter("who");
    String greeting = "Hello "+who+" have a nice day";
    request.setAttribute("greeting", greeting);
    
    RequestDispatcher dispatcher = request.getRequestDispatcher("greeting.jsp");
    dispatcher.forward(request, response);
    
//    response.setContentType("text/html; charset=utf8");
//    PrintWriter out = response.getWriter();
//    out.println("<!DOCTYPE html>");
//    out.println("<html>");
//    out.println("  <head><title>This is a greeting</title></head>");
//    out.println("  <body>");
//    out.println("    <h1 style=\"color: red;\">Hello 2nd Semester!!!</h1>");
//    out.println("    <hr/>");
//    out.println("    <p>"+greeting+"</p>");
//    out.println("  </body>");
//    out.println("</html>");
    }
  
  }
