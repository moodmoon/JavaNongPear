package sit.int202.classicmodels.project;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import sit.int202.classicmodels.entities.Office;
import sit.int202.classicmodels.repositories.OfficeRepository;

import java.io.IOException;

@WebServlet(name = "OfficeInsert", value = "/office-insert")
public class OfficeInsertServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/office-insert.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Office office = new Office(); //new obj
        OfficeRepository repository = new OfficeRepository(); //new obj

        String officeCode = request.getParameter("officeCode");
        String city = request.getParameter("city");
        String phone = request.getParameter("phone");
        String addressLine1 = request.getParameter("addressLine1");
        String addressLine2 = request.getParameter("addressLine2");
        String state = request.getParameter("state");
        String country = request.getParameter("country");
        String postalCode = request.getParameter("postalCode");
        String territory = request.getParameter("territory");

        office.setOfficeCode(officeCode);
        office.setCity(city);
        office.setPhone(phone);
        office.setAddressLine1(addressLine1);
        office.setAddressLine2(addressLine2);
        office.setState(state);
        office.setCountry(country);
        office.setPostalCode(postalCode);
        office.setTerritory(territory);

        if(repository.insert(office)){
            request.setAttribute("add", "Successfully added new office.");
        }

        repository.insert(office);
        doGet(request, response);
    }
}