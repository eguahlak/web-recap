<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
  </head>
  <body>
    <h1>Hello ${person.name}</h1>
    <p>We know that you live at 
      ${person.address.street} in 
      ${person.address.postal.district}</p>
    <p>${person}</p>
  </body>
</html>
