<%--
  Created by IntelliJ IDEA.
  User: bunnymoon
  Date: 29/9/2023 AD
  Time: 13:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Course History</title>
</head>
<body style="margin-left: 100px; background-color: ${cookie.bg_color_cookie.value}">
<%-- เป็น Map ต้องวนลูป 2 ชั้น --%>

<%--<c:forEach items="${courseRegistered.history}" var="entry">--%>
<%--    <h3>Semester ${entry.key}</h3>--%>
<%--    <hr>--%>
<%--    <c:forEach items="${entry.value}" var="subject">--%>
<%--        ${subject.subjectId}, ${subject.title}, ${subject.credit}--%>
<%--        <br>--%>
<%--    </c:forEach> ----------------------------<br><br>--%>
<%--</c:forEach>--%>


<%-- เป็น Map ต้องวนลูป 2 ชั้น --%>
<h1>Course Register History</h1><hr>
<c:set var="link" value="index.jsp"></c:set>
<c:if test="${message != null}">
    <h2 style="color: mediumvioletred; background-color: tan">
            ${message} <br><hr>
        <a href="course-list"><button>OK</button></a>
    </h2>
</c:if>

<c:if test="${message == null}">
    <c:forEach items="${courseRegistered.history}" var="entry">
        <h3 style="color: darkred;">
            ${semesters[entry.key]}</h3>
        <c:forEach items="${entry.value}" var="subject" varStatus="vs">
            ${vs.count}) ${subject.subjectId} , ${subject.title} , ${subject.credit}<br>
        </c:forEach>
        <br>
    </c:forEach>
    <hr>
    <a href="${link}"><button>OK</button></a>
</c:if>
</body>
</html>
