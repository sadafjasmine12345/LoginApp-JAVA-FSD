

import java.io.IOException;

import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletOnee
 */
public class ServletOnee extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ServletOnee() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pwriter=response.getWriter();
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		if(username.equals("sadaf")&&password.equals("sadaf")) {
			RequestDispatcher dis=request.getRequestDispatcher("ServletTwo");
			dis.forward(request, response);//the parameter values used
		}else {
			pwriter.print("<font color='blue'><b>User name or password is incorrect!<b></font>");
			RequestDispatcher dis=request.getRequestDispatcher("login.html");
			dis.include(request,response);
		}
	}

}
