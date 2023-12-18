<%--
  Created by IntelliJ IDEA.
  User: bunnymoon
  Date: 14/11/2023 AD
  Time: 13:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Add New Offices</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <div class="row bg-primary"><h2>Add New Offices</h2></div>
    <p class="lead">Please fill in the information in the English Language, Thank you.</p>
    <c:if test="${add != null}">
        <h5 style="color : darkgreen">
                ${add}
        </h5>
    </c:if>
    <form method="post" action="office-insert">
            <div class="form-row">
                <div class="form-group col-md-6">
                    <label for="officeCode"><span class="form-text" style="color: darkred">*        </span>Office Code</label>
                    <input type="text" class="form-control" id="officeCode" name="officeCode" placeholder="Office Code" required>
                </div>
                <div class="form-group col-md-6">
                    <label for="city"><span class="form-text" style="color: darkred">*        </span>City</label>
                    <input type="text" class="form-control" id="city" name="city" placeholder="City" required>
                </div>
            </div>
            <div class="form-group">
                <label for="addressLine1"><span class="form-text" style="color: darkred">*        </span>Address 1</label>
                <input type="text" class="form-control" id="addressLine1" name="addressLine1" placeholder="1234 Main St" required>
            </div>
            <div class="form-group">
                <label for="addressLine2">Address 2</label>
                <input type="text" class="form-control" id="addressLine2" name="addressLine2" placeholder="Apartment, studio, or floor">
            </div>
            <div class="form-row">
                <div class="form-group col-md-6">
                    <label for="country"><span class="form-text" style="color: darkred">*        </span>Country</label>
                    <input type="text" class="form-control" id="country" name="country" required>
                </div>
                <div class="form-group col-md-4">
                    <label for="state">State</label>
                    <select id="state" class="form-control" name="state">
                        <option selected>Choose your state</option>
                        <option>Unitary</option>
                        <option>Confederation</option>
                    </select>
                </div>
                <div class="form-group col-md-4">
                    <label for="phone"><span class="form-text" style="color: darkred">*        </span>Phone</label>
                    <input type="text" class="form-control" id="phone" name="phone" placeholder="+99202202202" required>
                </div>
            </div>
            <div class="form-row">
                <div class="form-group col-md-6">
                    <label for="postalCode"><span class="form-text" style="color: darkred">*        </span>Postal Code</label>
                    <input type="text" class="form-control" id="postalCode" name="postalCode" placeholder="Postal Code" required>
                </div>
                <div class="form-group col-md-6">
                    <label for="territory"><span class="form-text" style="color: darkred">*        </span>Territory</label>
                    <input type="text" class="form-control" id="territory" name="territory" placeholder="Must not exceed 10 characters." required>
                </div>
            </div>
        <br>
            <div class="form-group">
                <div class="form-check">
                    <input class="form-check-input" type="checkbox" id="gridCheck" required>
                    <label class="form-check-label" for="gridCheck" >
                        Confirm
                    </label>
                </div>
            </div>
        <br>
        <button type="submit" class="btn btn-primary" required>Submit</button>
        <button type="button" class="btn btn-secondary">
            <a href="office-list" style="color: white;">Back</a>
        </button>
    </form>
</div>
</body>
</html>
