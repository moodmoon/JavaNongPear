<%--
  Created by IntelliJ IDEA.
  User: bunnymoon
  Date: 3/11/2023 AD
  Time: 11:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<head>
    <title>Classic Model Offices</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <div class="row bg-primary">
        <h2>Classic Model Offices ::</h2>
    </div>

<%-- search --%>
    <div class="container mt-3">
        <form action="office-findcityorcountry" method="post" class="row g-3 align-items-center">
            <div class="col-auto">
                <label for="find" class="visually-hidden">Search</label>
                <input type="search" class="form-control rounded" placeholder="Search" aria-label="Search" aria-describedby="search-addon" name="find" id="find">
            </div>
            <div class="col-auto">
                <button type="submit" class="btn btn-outline-primary">Search</button>
            </div>
        </form>
    </div>

    <%-- delete --%>
    <div class="row">
        <c:forEach items="${offices}" var="office">
            <div class="col-2 border border-secondary p-2 m-2
        ${office.officeCode == selectedOffice.officeCode ? 'bg-warning' : ''}">
                <div>
                    <a href="office-list?officeCode=${office.officeCode}">
                            ${office.city}</a>, ${office.country}
                </div>
                <div> ${office.phone}</div>
                <div class="btn btn-outline-warning btn-rounded btn-sm my-0" style="float: right">
                    <a href="office-delete?officeCode=${office.officeCode}" style="color: white;">
                        <img src="assets/images/delete.png" width="25px"></a>
                </div>
            </div>
        </c:forEach>
    </div>
    <%-- delete --%>
    <br>
    <c:if test="${success != null}">
        <h5 style="color : darkgreen">
                ${success}
        </h5>
    </c:if>
    <c:if test="${error != null}">
        <h5 style="color : darkred">
                ${error}
        </h5>
    </c:if>
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

</div>
<br> <hr> <br> <br>
<div style="text-align: center">
    <button class="btn btn-success rounded-pill px-3" type="button">
        <a href="office-insert.jsp" style="color: white;">Add New Offices</a>
    </button>
    <button class="btn btn-primary rounded-pill px-3" type="button" style="margin-left: 50px;">
        <a href="office-update.jsp" style="color: white;">Update Offices</a>
    </button>
</div>
</body>
</html>