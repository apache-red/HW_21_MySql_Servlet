<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

Create new author:
<form action="MySecondSevlet" method="post">
	<input type="hidden" name="action" value="add_author"/>
	<input type="date" name="date"/>
	<input type = "email" name="email"/>
	<input type="text" name="author_name" />
	<input type="submit" value="add new author"/>
</form>


</body>
</html>