<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<form method="post" action="${pageContext.request.contextPath}/056/login">
    <c:if test="${requestScope.loginError != null}">
        <div role="alert">
            <span>${requestScope.loginError}</span>
        </div>
    </c:if>
    <div>
        <label>
            <span id="email">Email</span>
        </label>
        <input type="email" placeholder="email" name="email" required>
    </div>
    <div>
        <label>
            <span id="password">Password</span>
        </label>
        <input type="password" placeholder="password" name="password" required/>
    </div>
    <div>
        <a href="index.jsp"><button>Login</button></a>
        <a href="index.jsp"><button>Back</button></a>
    </div>
</form>
</body>
</html>
