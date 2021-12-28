package sn.lamp.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class accueilServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5885954916273404174L;
	
	public static final String VUE="/WEB-INF/accueil.jsp";

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
		this.getServletContext().getRequestDispatcher(VUE).forward(req, resp);
	}
	
	

}
