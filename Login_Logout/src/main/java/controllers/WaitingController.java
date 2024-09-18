package controllers;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import models.UserModel;

@WebServlet(urlPatterns = {"/waiting"})
public class WaitingController extends HttpServlet{

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session= req.getSession();
        
        if(session != null && session.getAttribute("account") != null) {
            UserModel u = (UserModel) session.getAttribute("account");
            req.setAttribute("username", u.getUsername());

            if(u.getRoleid() == 1) {
                req.getRequestDispatcher("/views/admin/home.jsp").forward(req, resp);
            } else if(u.getRoleid() == 2) {
                req.getRequestDispatcher("/views/manager/home.jsp").forward(req, resp);
            } else if(u.getRoleid() == 3) {
                req.getRequestDispatcher("/views/user/home.jsp").forward(req, resp);
            } else if(u.getRoleid() == 4) {
                req.getRequestDispatcher("/home.jsp").forward(req, resp);
            }
        } else {
            resp.sendRedirect(req.getContextPath() + "/login");
        }
    }
}
