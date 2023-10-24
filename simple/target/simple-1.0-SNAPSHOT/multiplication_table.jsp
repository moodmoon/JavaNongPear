<%--
  Created by IntelliJ IDEA.
  User: bunnymoon
  Date: 18/9/2023 AD
  Time: 10:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Multiplication Table</title>
</head>
<body>
<h2>Multiplication Table of ${param.number}</h2>
<hr>
<c:if test="${message == null}">
    <table style="border: 1px solid darkblue; text-align: right">
        <tr style="background-color: darkgray">
            <td colspan="5">${param.number}</td>
    </tr>
    <c:forEach begin="1" end="12" var="n">
        <tr>
            <td style="border-bottom: 1px solid aliceblue">${param.number}</td>
            <td style="border-bottom: 1px solid aliceblue"> x </td>
            <td style="border-bottom: 1px solid aliceblue"> ${n} </td>
            <td style="border-bottom: 1px solid aliceblue"> = </td>
            <td style="border-bottom: 1px solid aliceblue"> ${n * param.number} </td>
        </tr>
    </c:forEach>
    </table>
</c:if>

<c:if test="${message != null}">
<h3 style="color: darkred">
    Error:: ${requestScope.message}</h3>
<hr>
    <span style="color: darkred">${message} </span>
    (${param.number == null || param.number == '' ? 'Null/Empty': param.number})</span>
</c:if>
<hr>
Your browser: ${header['User-Agent']}
</body>
</html>
