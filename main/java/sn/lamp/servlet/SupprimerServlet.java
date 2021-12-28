package sn.lamp.servlet;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sn.lamp.bean.Menu;


public class SupprimerServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6908642046240575502L;
	public static final String VUE="/admin/delete.jsp";

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
		String util=req.getParameter("nom");
		HttpSession session=req.getSession();
		Map<String,Menu> menuSup=(Map<String, Menu>) session.getAttribute("menuMap");
		Menu menu=menuSup.get(util);
		req.setAttribute("menu", menu);
		this.getServletContext().getRequestDispatcher(VUE).forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}

}
