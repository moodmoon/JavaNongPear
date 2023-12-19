package sit.int202.preexampractice.controller;

import de.mkammerer.argon2.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import sit.int202.preexampractice.entities.Employee;

import java.io.IOException;
import java.util.Optional;

@WebServlet(name = "Authentication", value = "/056/login")
public class Authentication extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        Optional<Employee> employeeOpt;
//
//        if (employeeOpt.isEmpty()) {
//            request.setAttribute("loginError", "This email is not exist!");
//            request.getRequestDispatcher("/index.jsp").forward(request, response);
//            return;
//        }
//
//        Employee employee = employeeOpt.get();
//        // Hashed using this Argon2Factory.Argon2Types.ARGON2d type!
//        Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2d, 16, 16);
    }
}