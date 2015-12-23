import Entity.Profile;
import crud.ProfileService;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Юля on 21.12.2015.
 */
@WebServlet(name = "FindUser", urlPatterns = {"/Find"})
public class FindUser extends Dispatcher  {
    public String getServletInfo(){
        return "Find user servlet";
    }
    @EJB
    private Ejb_modBean Bean;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if (request.getParameter("print")!=null){
            response.setContentType("text/html");
            ArrayList U = Bean.FindUser();
            //String f = (String) U.get(1);
            request.setAttribute("usrName",U );
            RequestDispatcher dispatcher = request.getRequestDispatcher("/login_profile.jsp");
            ;
            dispatcher.forward(request, response);
            this.forward("/exit.jsp", request, response);
        }

    }
}