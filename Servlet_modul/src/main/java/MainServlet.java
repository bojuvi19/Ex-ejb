/**
 * Created by Юля on 09.12.2015.
 */
import Entity.Category;
import Entity.Profile;
import crud.CategoryService;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "MainServlet", urlPatterns = {"/current", "/"})
public class MainServlet extends HttpServlet {

    @EJB
    private Ejb_modBean Bean;


   @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        //Bean.DB();
        //request.setAttribute("123", "!");
        RequestDispatcher dispatcher= request.getRequestDispatcher("/input_profile.jsp");;
        dispatcher.forward(request, response);
    }





}

