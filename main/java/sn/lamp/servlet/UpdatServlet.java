package sn.lamp.servlet;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import sn.lamp.bean.Menu;

import sn.lamp.form.MenuForm;

public class UpdatServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2162473883738319976L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
		String util = req.getParameter("nom");
		HttpSession session = req.getSession();
		Map<String, Menu> menuEdit = (Map<String, Menu>) session.getAttribute("menuMap");
		Menu menu = menuEdit.get(util);
		req.setAttribute("menu", menu);
		this.getServletContext().getRequestDispatcher("/admin/update.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doPost(req, resp);
		
		MenuForm update = new MenuForm();
		Menu modif = update.tets(req);
		
		if (update.getErreurs().isEmpty()) {
        HttpSession session = req.getSession();
			Map<String,Menu> menuMap = (Map<String, Menu>) session.getAttribute("menuMap");
			menuMap.replace(modif.getNom(), modif);
			req.setAttribute("menuMap", menuMap);
			resp.sendRedirect("admin");
		}
	}

}
