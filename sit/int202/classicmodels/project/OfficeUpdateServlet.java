package sit.int202.classicmodels.project;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import sit.int202.classicmodels.entities.Office;
import sit.int202.classicmodels.repositories.OfficeRepository;

import java.io.IOException;

@WebServlet(name = "OfficeUpdate", value = "/office-update")
public class OfficeUpdateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String officeCode = request.getParameter("officeCode");
        OfficeRepository repository = new OfficeRepository();
        request.setAttribute("updated", repository.find(officeCode));
        getServletContext().getRequestDispatcher("/office-update.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Office newOffice = new Office(); //new obj

        String officeCode = request.getParameter("officeCode");
        String city = request.getParameter("city");
        String phone = request.getParameter("phone");
        String addressLine1 = request.getParameter("addressLine1");
        String addressLine2 = request.getParameter("addressLine2");
        String state = request.getParameter("state");
        String country = request.getParameter("country");
        String postalCode = request.getParameter("postalCode");
        String territory = request.getParameter("territory");

        newOffice.setOfficeCode(officeCode);
        newOffice.setCity(city);
        newOffice.setPhone(phone);
        newOffice.setAddressLine1(addressLine1);
        newOffice.setAddressLine2(addressLine2);
        newOffice.setState(state);
        newOffice.setCountry(country);
        newOffice.setPostalCode(postalCode);
        newOffice.setTerritory(territory);

        OfficeRepository repository = new OfficeRepository(); //new obj
        repository.update(newOffice);
        getServletContext().getRequestDispatcher("/office-update.jsp").forward(request, response);
    }
}