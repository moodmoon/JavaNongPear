<%--
  Created by IntelliJ IDEA.
  User: INT202&204
  Date: 11/9/2022
  Time: 3:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div class="row bg-primary">
    <h2>Classic Model Offices ::</h2>
</div>
<div class="row">
    <c:forEach items="${offices}" var="office">
        <div onclick="loadOffice('${office.officeCode}')"
                class="div-link col-2 border border-secondary p-2 m-2 ${office.officeCode == selectedOffice.officeCode ? 'bg-warning' : ''}">
            <div>
                ${office.city}, ${office.country}
            </div>
            <div> ${office.phone}</div>
        </div>
    </c:forEach>
</div>
<br>
<div class="row bg-light">
    <b>Employees ::</b>
</div>
<div class="row">
    <c:forEach items="${selectedOffice.employeeList}" var="employee">
        <div class="col-2 pl-2 m-2 border border-secondary rounded-pill">
            <div> ${employee.firstName}
                    ${employee.lastName} - ${employee.jobTitle}
            </div>
        </div>
    </c:forEach>
</div>
<%--</div>--%>
<%--</body>--%>
<%--</html>--%>
