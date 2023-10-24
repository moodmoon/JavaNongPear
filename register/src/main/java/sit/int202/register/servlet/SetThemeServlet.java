package sit.int202.register.servlet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "SetThemeServlet", value = "/set-theme")
public class SetThemeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/set_theme.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String bgColor = request.getParameter("bgColor");
        Cookie ck = new Cookie("bg_color_cookie" , bgColor);
        ck.setMaxAge(8*24*60*60); //ฝั่ง server
        response.addCookie(ck); //ฝั่ง browser
        response.sendRedirect("index.jsp");

    }
}