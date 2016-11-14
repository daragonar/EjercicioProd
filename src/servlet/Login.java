package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		String pass= new String("1234");
		String usu= new String("David");
		String mipass= request.getParameter("pass");
		String miusu=request.getParameter("usu");
		
		if (request.getParameter("log") !=null)
		{
			if (miusu.equals(usu) && mipass.equals(pass))
			{
				request.setAttribute("page", "listado");
		        request.getRequestDispatcher("index.jsp").forward(request, response);	
			}
			else
			{
				request.setAttribute("error", "<div class=\"alert alert-warning\"><strong>¡Error!</strong> Revise el usuario y la contraseña.</div>");
		        request.getRequestDispatcher("index.jsp").forward(request, response);
			}
		}
	}

}
