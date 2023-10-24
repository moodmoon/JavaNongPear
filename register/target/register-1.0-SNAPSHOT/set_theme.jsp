<%--
  Created by IntelliJ IDEA.
  User: bunnymoon
  Date: 6/10/2023 AD
  Time: 12:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Select Your Theme</title>
</head>
<body>
    <h2 style="color: mediumvioletred">Select Your Theme</h2><hr>
<form action="set-theme" method="post">
    <p>
        <input type="radio" name="bgColor" value="mediumpurple">
        <button style="background-color:mediumpurple">Purple</button>
    </p>
    <p>
        <input type="radio" name="bgColor" value="hotpink">
        <button style="background-color:hotpink">Pink</button>
    </p>
    <p>
        <input type="radio" name="bgColor" value="deepskyblue">
        <button style="background-color:deepskyblue">Blue</button>
    </p>
    <p>
        <input type="radio" name="bgColor" value="peru">
        <button style="background-color:peru">Brown</button>
    </p>
    <hr>
    <input type="submit" value="OK">
</form>

</body>
</html>
