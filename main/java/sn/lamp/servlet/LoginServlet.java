package sn.lamp.servlet;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sn.lamp.bean.Utilisateur;

import sn.lamp.form.LoginForm;

public class LoginServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -209846174121596164L;
	public static final String VUE="/WEB-INF/login.jsp";
	public  static final String SESSION="utilisateurMap";

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
		LoginForm connexion=new LoginForm();
	     Utilisateur utilisateur=connexion.loginTest(req);
	    
	     System.out.println(utilisateur.getEmail());
	 	req.setAttribute("utilisateur", utilisateur);
		req.setAttribute("connexion", connexion);
	     if(connexion.getErreurs().isEmpty()) {
	    	
	    	 HttpSession session=req.getSession();
	    	 Map<String,Utilisateur> utilisateurSesion=(Map<String, Utilisateur>) session.getAttribute("utilisateurMap");
//	    	 System.out.println(email);
	    	 String email=utilisateur.getEmail();
	    	 String pass=utilisateur.getMotDePass();
	    	 Utilisateur logg=utilisateurSesion.get(email);
	    	String profil=logg.getProfil();
	    	String email1=logg.getEmail();
	    	String pass1=logg.getMotDePass();
	    	System.out.println(email1+"et"+email);
	    	System.out.println(pass1+"et"+pass);
	    	 if(email1.equals(email) && pass1.equals(pass)) {
	    		 HttpSession sess=req.getSession();
	    	     sess.setAttribute("utilisateur", utilisateur);
	    		 System.out.println(profil);
	    		 if(profil.equals("admin")) {
	    		 resp.sendRedirect("admin");
	    	
	    		 }else {
	    			 resp.sendRedirect("client");
	    		 }
	    	 }
	     }else {
	    	 this.getServletContext().getRequestDispatcher(VUE).forward(req, resp);
	     }
	}
	

}
