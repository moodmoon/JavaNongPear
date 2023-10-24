<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body style="background-color: ${cookie.bg_color_cookie.value}">
<%--    <c:if test="${applicationScope.semesters == null}">--%>
<%--        <c:set var="semester" scope="application" value="${Se}"></c:set>--%>
<%--    </c:if>--%>
    <h2>Menu</h2><hr>
    <a href="course-list" style="color: black">ลงทะเบียน</a><br>
    <a href="course-registered-history" style="color: black">ประวัติลงทะเบียน</a><br>
    <a href="set-theme" style="color: black">Select Your Theme</a><br>
</body>
</html>