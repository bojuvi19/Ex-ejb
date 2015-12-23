import Entity.Profile;

import javax.ejb.EJB;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

@WebServlet(name = "AddUser", urlPatterns = {"/Add"})
public class AddUser extends Dispatcher  {
    public String getServletInfo(){
        return "Add user servlet";
    }
    @EJB
    private Ejb_modBean Bean;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if (request.getParameter("add")!=null) {
            response.setContentType("text/html");
            String log = request.getParameter("user");
            String pas = request.getParameter("password");
            String email = request.getParameter("email");

            String U = Bean.AddUser(log, pas, email);

            request.setAttribute("123",U );
            RequestDispatcher dispatcher = request.getRequestDispatcher("/Static_time.jsp");
            ;
            dispatcher.forward(request, response);
        }
        else if (request.getParameter("cancel")!=null){

            this.forward("/exit.jsp", request, response);
        }

    }
}
