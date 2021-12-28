package sn.lamp.servlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sn.lamp.bean.Utilisateur;
import sn.lamp.form.InscriptionForm;



public class InscriptionServlet extends  HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6143943839095787313L;
	public static final String VUE="/WEB-INF/register.jsp";


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
		InscriptionForm inscription=new InscriptionForm();
		Utilisateur utilisateur=inscription.ValidateUtilisateur(req);
		System.out.println("inscription ok"+ utilisateur.getEmail());
		req.setAttribute("utilisateur", utilisateur);
		req.setAttribute("inscription", inscription);
		
		if(inscription.getErreurs().isEmpty()) {
			HttpSession session = req.getSession();
			Map<String,Utilisateur> utilisateurMap=(Map<String, Utilisateur>) session.getAttribute("utilisateurMap");
			if(utilisateurMap==null) {
				utilisateurMap=new HashMap<String,Utilisateur>();
			}
			utilisateurMap.put(utilisateur.getEmail(),utilisateur);
//			System.out.println(" inscription ok"+ utilisateur.getEmail());
			session.setAttribute("utilisateurMap",utilisateurMap);
//			System.out.println(" inscription ok");
			resp.sendRedirect("login");
		}else {
			this.getServletContext().getRequestDispatcher(VUE).forward(req, resp);
		}
		}
		
	

}
