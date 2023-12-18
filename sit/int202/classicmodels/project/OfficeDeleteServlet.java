package sit.int202.classicmodels.project;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import sit.int202.classicmodels.entities.Office;
import sit.int202.classicmodels.repositories.OfficeRepository;

import java.io.IOException;

@WebServlet(name = "OfficeDelete", value = "/office-delete")
public class OfficeDeleteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String officeCode = request.getParameter("officeCode");
        OfficeRepository repository = new OfficeRepository();
        if (repository.delete(officeCode)){
            request.setAttribute("success", "Data has been successfully deleted.");
        }else {
            request.setAttribute("error", "Unable to delete data in the main database.");
        }
        request.getRequestDispatcher("office-list").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}