package controller.admin;


import Services.LoginService;




import model.*;



import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "dashBoardController", value = "/admin-dash-board")
public class dashBoardController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        LoginService.login(request, response);
        HttpSession session = request.getSession();
        Account account = (Account) session.getAttribute("account");
        if (account == null || !(account.getRole().getName().equals("ADMIN"))) {
            response.sendRedirect("login");
        } else {
            RequestDispatcher rd = request.getRequestDispatcher("/views/admin/dash-board.jsp");
            request.setAttribute("tabName", "dashboard");
            rd.forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
