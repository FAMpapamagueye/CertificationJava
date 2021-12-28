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

public class commandeServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7728272263281121542L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
		HttpSession ses=req.getSession();
		Map<String,Object> ListeMap=new HashMap<String,Object>();
		String util=req.getParameter("nom");
		HttpSession session=req.getSession();
		HttpSession sess=req.getSession();
		Utilisateur user=(Utilisateur) sess.getAttribute("utilisateur");
		Map<String,Menu> menuMap=(Map<String, Menu>) session.getAttribute("menuMap");
		Menu commande=menuMap.get(util);
		ListeMap.put(user.getNom(), user);
		ListeMap.put(commande.getNom(), commande);
		ses.setAttribute("ListeMap", ListeMap);
		
		resp.sendRedirect("client");
		
		
		
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doPost(req, resp);
	}
	

}
