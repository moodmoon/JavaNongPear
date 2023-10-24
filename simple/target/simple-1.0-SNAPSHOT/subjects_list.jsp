<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%--
  Created by IntelliJ IDEA.
  User: bunnymoon
  Date: 4/9/2023 AD
  Time: 10:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Subject List</title>
</head>
<body>
    <div class = "flex-content" style="margin: 100px;background-color: cadetblue">
        <h1>Subject List</h1>
        <hr>
        <table>
            <tr style="background-color: beige; color: black">
                <td>Subject Id</td>
                <td>Title</td>
                <td>Credit</td>
                <td>Select</td>
            </tr>

            <c:forEach var="subject" items="${subjects}">
                <tr>
                    <td>${subject.id}</td>
                    <td>${subject.title}</td>
                    <td>${subject.credit}</td>
                    <td><input type="checkbox" value="${subject.id}"></td>
                </tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>
