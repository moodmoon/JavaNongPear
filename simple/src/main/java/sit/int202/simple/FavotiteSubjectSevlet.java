package sit.int202.simple;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

@WebServlet(name = "FavotiteSubjectSevlet", value = "/favoriteSubject")
public class FavotiteSubjectSevlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doProcess(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doProcess(request, response);
    }

    protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String id = request.getParameter("id");
        String[] subjects = request.getParameterValues("subjects");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1 color = 'blue'>Your Favorite Subject is </h1><br>");
        out.println("<h3>Student Id : " + id + "</h3><br>");
        out.println("<h3>Student Name : " + name + "</h3><br>");
        out.println("Favorite Subject is <br> ");
        for (String subject : subjects) {
            //out.println("\t- " + subject + "<br>");
            out.println("&nbsp; &nbsp; - " + subject + "<br>");
        }

        Map<String, String[]> param = request.getParameterMap();
        out.println("<br>Request Parameter from Map : <br>");
        out.println("--------------------------------------<br>");
        out.println("Student Id = " + param.get("id")[0] + "<br>");
        out.println("Student Name = " + param.get("name")[0] + "<br>");
        out.println("Favorite Subject : <br>");
        for (String subject : subjects) {
            out.println("&nbsp; &nbsp; - " + subject + "<br>");
        }

        out.println("<hr><br>");
        out.println("<a href='favorite_subject.html'> Back </a>");
        out.println("</body></html>");
    }
}


//        Map<String, String[]> param = request.getParameterMap();
//        out.println("<hr>");
//        out.println("Request Parameter from Map : <br>");
//        out.println("Student Id = " + param.get("id")[0] + "<br>");
//        out.println("Student Name = " + param.get("name")[0] + "<br>");
//        out.println("Favorite Subject : <br>");
//            for (String subject : favoriteSubject) {
//                out.println("&nbsp; &nbsp; - " + subject + "<br>");
//            }
//        out.println("</body></html>");
//    }
//}