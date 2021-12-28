package sn.lamp.servlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sn.lamp.bean.Menu;
import sn.lamp.bean.Utilisateur;
import sn.lamp.form.MenuForm;

public class AddMenuServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5461633206494891754L;
	public static final String VUE="/admin/addMenu.jsp";

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
		this.getServletContext().getRequestDispatcher(VUE).forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doPost(req, resp);
		MenuForm menuform=new MenuForm();
		Menu menu=menuform.tets(req);
		req.setAttribute("menu", menu);
		req.setAttribute("menuform", menuform);
		if(menuform.getErreurs().isEmpty()) {
			HttpSession session=req.getSession();
			Map<String,Menu> menuMap=(Map<String, Menu>) session.getAttribute("menuMap");
			if(menuMap==null) {
				menuMap=new HashMap<String,Menu>();
			}
			menuMap.put(menu.getNom(), menu);
			session.setAttribute("menuMap", menuMap);
			
			resp.sendRedirect("admin");
			
		}
	}
	

}
