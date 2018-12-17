<%--
  Created by IntelliJ IDEA.
  User: RED
  Date: 16.12.2018
  Time: 22:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>

  <%--<li><a href="show/show_all.jsp">Show All </a></li>--%>
  <li><a href="ServletShow?action=1">Show all data</a></li>
  <li><a href="ServletShow?action=2">Show all authors</a></li>
  <li><a href="ServletShow?action=3">Show all books</a></li>
  <li><a href="add_autor.jsp">add new Authors </a></li>
  <li><a href="add_autors.jsp">add new Book </a></li>
  <li><a href="add_autors.jsp">delete book by ID </a></li>
  <li><a href="add_autors.jsp">edit book title by ID </a></li>
  <li><a href="add_autors.jsp">find book by title </a></li>
  test

  <form action="MySecondSevlet" method="post">
    <input type="hidden" name="action" value="add_author"/>
    <input type="date" name="date"/>
    <input type="text" name="author_name" />
    <input type="submit" value="add new author"/>
  </form>


  </body>
</html>
