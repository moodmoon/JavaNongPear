<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
</head>
<body style="background-color: ${cookie.bg_cookie.value}">
<h1><%= "Hello World !" %></h1>
<br/>
<a href="hello"> - Hello Servlet</a><br>
<a href="favorite_subject.html"> - Favorite Subject</a><br>
<a href="GradeServlet"> - Your Grade</a><br>
<a href="SubjectList"> - Subject List</a><br>
<a href="multiplicationTable"> -Multiplication Table</a><br>
<a href="test_cookie"> -Test Cookie</a><br>
</body>
</html>