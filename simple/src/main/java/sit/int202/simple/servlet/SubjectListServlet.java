package sit.int202.simple.servlet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import sit.int202.simple.repositories.SubjectRepository;
import sit.int202.simple.simple.entities.Subject;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "SubjectListServlet", value = "/SubjectList")
public class SubjectListServlet extends HttpServlet {
    private long startTime;
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        List<Subject> subjects = new SubjectRepository().findAll();
        request.setAttribute("subjects", subjects);
        request.getRequestDispatcher("/subjects_list.jsp").forward(request, response);
    }

    @Override
    public void destroy() {
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("Duration of SubjectListServlet is " +
        (System.currentTimeMillis() - startTime) + " milli seconds");
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Override
    public void init() throws ServletException {
        startTime = System.currentTimeMillis();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}