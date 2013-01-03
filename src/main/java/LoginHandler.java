import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginHandler extends HttpServlet {
    boolean isSession = false;
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    String username = request.getParameter("userId");
    String password = request.getParameter("password");


    String message = request.getQueryString();
    if (message!=null){
    try{
        if (username == "" || password == "") {

            System.out.println("Invalid parameters  + \n ");
        }

        if (username.toLowerCase().trim().equals("masha") && password.trim().equals("admin")) {
            request.getSession(true).setAttribute("userId","password");

            response.sendRedirect("mainSource.jsp");
            System.out.println("Authentication successful + \n");
            isSession = true;
                    }
        else {
            response.sendRedirect("ErrorPage.jsp");
            System.out.println("Authentication failed  + \n");
        }
    }
    catch (IOException io) {
        System.out.println("IOException raised in LoginHandler");
    }

  }
    else
            response.sendRedirect("index.jsp");

    }
}
