package sit.int202.register.servlet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import sit.int202.register.models.CourseRegistered;
import sit.int202.register.models.CourseRepository;

import java.io.IOException;
import java.util.Map;

@WebServlet(name = "RegisterCourseServlet", value = "/register")
public class RegisterCourseServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String, String[]> parameterMap = request.getParameterMap();
        int semester = Integer.valueOf(parameterMap.get("semester")[0]);

        HttpSession session = request.getSession(); // ()ส่งเป็น true
        CourseRegistered courseRegistered = (CourseRegistered) session.getAttribute("courseRegistered");
        if(courseRegistered == null) {
            courseRegistered = new CourseRegistered();
            session.setAttribute("courseRegistered", courseRegistered);
        } else {
            courseRegistered.removeAllRegisteredCourse(semester); // เคลียร์เทอมเดิมและลงเทอมใหม่
        }

        for(String subjectId : parameterMap.get("registeredSubjects")) {
            courseRegistered.registerSubject(semester, CourseRepository.getSubject(semester,subjectId));
        } // ดึงวิชาทีละวิชา
        System.out.println(courseRegistered.getHistory());
        getServletContext().getRequestDispatcher("/index.jsp").forward(request,response);
    }
}