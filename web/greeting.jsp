<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
  <head><title>This is a greeting</title></head>
  <body>
    <h1 style="color: red">Hello 2nd Semester!!!</h1>
    <hr/>
    <p>Original but ugly: <%= request.getAttribute("greeting") %></p>
    <p>Smarter and prettier: ${greeting}</p>
    <%
      for (int i = 1; i < 6; i++) {
    %>
    <h<%= i %>>This is line #<%= i %></h<%= i %>>
    <%
        }
    %>
    <hr/>
    <c:forEach var="index" begin="1" end="5">
      <h${index}>This is pretty line #${index}</h${index}>
    </c:forEach>
  </body>
</html>
