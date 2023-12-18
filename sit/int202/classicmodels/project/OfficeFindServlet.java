package sit.int202.classicmodels.project;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import sit.int202.classicmodels.repositories.OfficeRepository;

import java.io.IOException;

@WebServlet(name = "OfficeFind", value = "/office-findcityorcountry")
public class OfficeFindServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        OfficeRepository repository = new OfficeRepository();
        String find = request.getParameter("find");
        request.setAttribute("offices", repository.findByCityOrCountry(find));
        getServletContext().getRequestDispatcher("/office_list.jsp").forward(request, response);
    }
}