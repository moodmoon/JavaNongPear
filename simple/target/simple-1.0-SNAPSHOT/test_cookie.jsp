<%--
  Created by IntelliJ IDEA.
  User: bunnymoon
  Date: 25/9/2023 AD
  Time: 10:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Test Cookie</title>
</head>
<body style="background-color: ${bgColor}">
    <h1>Test Cookie</h1><hr>
    <form action="test_cookie" method="post">
        <h3>Please select your theme: </h3>
        &nbsp; &nbsp; - <input type="radio" name="bg" value="darkblue"
            ${bgColor == 'darkblue' ? 'chacked' : ''}> Dark Blue <br>
        &nbsp; &nbsp; - <input type="radio" name="bg" value="yellow"
            ${bgColor == 'yellow' ? 'chacked' : ''}> Yellow <br>
        &nbsp; &nbsp; - <input type="radio" name="bg" value="gray"
            ${bgColor == 'gray' ? 'chacked' : ''}> Gray <br><hr>
        &nbsp; &nbsp; <input type="submit">
    </form>
    <br><br>
        <a href="index.jsp" style="color: darkred; ">Go to Home Page</a>
</body>
</html>
