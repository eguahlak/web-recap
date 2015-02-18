<%@page import="java.util.Collection"%>
<%@page import="dk.cphbusiness.greeter.model.Person"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
  </head>
  <body>
    <h1>All the people in the database:</h1>
    <hr/>
    ${people}
    <ul>
      <c:forEach var="person" items="${people}">
        <li>${person.name} from ${person.address.postal.district}</li>
      </c:forEach>
      <% for (Person person : ((Collection<Person>)request.getAttribute("people"))) { %>
        <li><%= person.getName() %> from ... </li>
        <% } %>
    </ul>
    <form action="People" method="POST">
      <table>
        <tr>
          <th>First Name</th>
          <th>Last Name</th>
          <th>Email</th>
          <th>Age</th>
          <th></th>
        </tr>
        <c:forEach var="person" items="${people}">
          <tr>
            <td>${person.firstName}</td>
            <td>${person.lastName}</td>
            <td>${person.email}</td>
            <td>${person.age}</td>
            <td><button name="email" value="${person.email}">Go</button></td>
          </tr>
        </c:forEach>
      </table>
    </form>
  </body>
</html>
