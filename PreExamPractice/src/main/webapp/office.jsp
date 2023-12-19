<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<section>
    <c:forEach items="${sessionScope.offices}" var="office">
        <div>
            <div>
                <h2>OFFICE #${office.id}</h2>
                <p>CITY: ${office.city}</p>
                <p>PHONE: ${office.phone}</p>
                <p>STATE: ${office.state}</p>
                <p>COUNTRY: ${office.country}</p>
                <p>POSTAL CODE: ${office.postalCode}</p>
                <div>
                    <a href="056/employee?officeId=${office.id}">Manage Employee</a>
                </div>
            </div>
        </div>
    </c:forEach>
</section>
