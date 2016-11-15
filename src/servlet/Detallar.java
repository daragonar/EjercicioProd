package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Detallar
 */
@WebServlet("/Detallar")
public class Detallar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Detallar() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		 ArrayList<Producto> productos= new ArrayList<>();
		 for (int i =0;i<6;i++)
		 {
			 Producto p = new Producto("Producto "+ i , "", "Lorem ipsum");
			 productos.add(p);
		 }
		 int val= Integer.parseInt(request.getParameter("prod"));
		 val--;
		 request.setAttribute("producto", productos.get(val));
		 request.setAttribute("page", "prod");
	     request.getRequestDispatcher("index.jsp").forward(request, response);

	}
	
	/**
 	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
