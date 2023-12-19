<%--
  Created by IntelliJ IDEA.
  User: bunnymoon
  Date: 18/12/2023 AD
  Time: 21:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Employee</title>
</head>
<body>
<section>
    <div>
        <ul>
            <li><a href="${pageContext.request.contextPath}">Office List</a></li>
            <li>Employee Office #${requestScope.officeId}</li>
        </ul>
    </div>
    <div>
        <table>
            <!-- head -->
            <thead>
            <tr>
                <th></th>
                <th>id</th>
                <th>Name</th>
                <th>email</th>
                <th>delete</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${requestScope.officeEmployee}" var="employee" varStatus="vs">
                <tr>
                    <th>${vs.index}</th>
                    <td>${employee.id}</td>
                    <td>${employee.firstName} ${employee.lastName}</td>
                    <td>${employee.email}</td>
                    <td>
                        <form action="${pageContext.request.contextPath}/056/employee" method="post">
                            <input type="hidden" name="employeeId" value="${employee.id}">
                            <input type="hidden" name="officeId" value="${requestScope.officeId}">
                            <button>delete</button>
                        </form>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</section>
</body>
</html>
