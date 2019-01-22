package com.homedeve.servlets;

import com.homedeve.beans.Coyote;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Test extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		/*creation et initialisation du messsage*/
		String auteurParam = request.getParameter("auteur");		
				
		String message = "Transmission de message ok ! " + auteurParam;
		
		
		/*Creation du beans*/
		Coyote premierBean = new Coyote();
		premierBean.setPrenom("Camel");
		premierBean.setNom("Leonce");
		
		/*stockage du message et du message et du beans dans l'objet request*/
		request.setAttribute("test", message);
		request.setAttribute("camel", premierBean);
		
		/*transmission de la paire d'object request/reponse a notre jsp*/
		this.getServletContext().getRequestDispatcher("/WEB-INF/test.jsp").forward(request, response);
		
	}
}
