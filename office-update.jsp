<%--
  Created by IntelliJ IDEA.
  User: bunnymoon
  Date: 14/11/2023 AD
  Time: 13:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Update Offices</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <div class="row bg-primary"><h2>Update Offices</h2></div>
    <p class="lead">Please fill in the information in the English Language.</p>
    <div>
        <form action="office-update" method="get">
            <div class="row">
                <div class="col-md-6">
                    <div class="form-group">
                        <select name="officeCode" id="office" class="form-select">
                            <option value="" selected>Select an officeCode</option>
                            <c:forEach items="${offices}" var="office">
                                <option value="${office.officeCode}">${office.officeCode} ${office.city}</option>
                            </c:forEach>
                        </select>
                    </div>
                </div>
                <div class="col-md-6">
                    <div class="form-group">
                        <button type="submit" class="btn btn-warning">Select</button>
                    </div>
                </div>
            </div>
        </form>
    </div>

    <form action="office-update" method="post">
        <div class="form-group">
            <div class="form-group col-md-6">
                <label for="city">City</label>
                <input type="hidden" class="form-control" id="officeCode" name="officeCode" value="${updated.officeCode}">
                <input type="text" class="form-control" id="city" name="city" placeholder="City" value="${updated.city}">
            </div>
        </div>
        <div class="form-group">
            <label for="addressLine1">Address 1</label>
            <input type="text" class="form-control" id="addressLine1" name="addressLine1" placeholder="1234 Main St" value="${updated.addressLine1}">
        </div>
        <div class="form-group">
            <label for="addressLine2">Address 2</label>
            <input type="text" class="form-control" id="addressLine2" name="addressLine2" placeholder="Apartment, studio, or floor" value="${updated.addressLine2}">
        </div>
        <div class="form-row">
            <div class="form-group col-md-6">
                <label for="country">Country</label>
                <input type="text" class="form-control" id="country" name="country" value="${updated.country}">
            </div>
            <div class="form-group col-md-4">
                <label for="state">State</label>
                <select id="state" class="form-control" name="state">
                    <option selected>Choose your state</option>
                    <option>${updated.state}</option>
                </select>
            </div>
            <div class="form-group col-md-4">
                <label for="phone">Phone</label>
                <input type="text" class="form-control" id="phone" name="phone" placeholder="+99202202202" value="${updated.phone}">
            </div>
        </div>
        <div class="form-row">
            <div class="form-group col-md-6">
                <label for="postalCode">Postal Code</label>
                <input type="text" class="form-control" id="postalCode" name="postalCode" placeholder="Postal Code" value="${updated.postalCode}">
            </div>
            <div class="form-group col-md-6">
                <label for="territory">Territory</label>
                <input type="text" class="form-control" id="territory" name="territory" placeholder="Territory" value="${updated.territory}">
            </div>
        </div>
        <br>
        <button type="submit" class="btn btn-primary">Submit</button>
        <button type="button" class="btn btn-secondary">
            <a href="office-list" style="color: white;">Back</a>
        </button>
    </form>
</div>
</body>
</html>
