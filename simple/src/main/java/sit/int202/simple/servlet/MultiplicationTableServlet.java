package sit.int202.simple.servlet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "MultiplicationTableServlet", value = "/multiplicationTable")
public class MultiplicationTableServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String param = request.getParameter("number");
        if(param == null || param.length() == 0 || ! isDigit(param))  {
            request.setAttribute("message", "Invalid Parameter or No parameter !!!");
        }
        request.getRequestDispatcher("/multiplication_table.jsp").forward(request,response);
    }
    private  boolean isDigit(String nStr){
        for(int i = 0; i < nStr.length(); i++) {
            if(! Character.isDigit(nStr.charAt(i))){
                return false;
            }
        }
        return true;
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}