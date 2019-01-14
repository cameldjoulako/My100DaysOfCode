<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>transmission des données
</title>
</head>
<body>
	<h1>Page jsp</h1>
	<p>
		<%	
			String attribut = (String) request.getAttribute("test");
			out.println(attribut);
			
			String auteur = request.getParameter("auteur");
			out.println(auteur);
		%>
	</p>
	
	<p>
	
		Recuperation du beans <br />
		<%
		
			com.homedeve.beans.Coyote notreBean;
		notreBean = (com.homedeve.beans.Coyote) request.getAttribute("camel");
		out.println(notreBean.getPrenom());
		out.println(notreBean.getNom());
		%>
	</p>
	
	<%-- Ceci est un commentaire en JSP --%>
	
	<% out.println("Bip bip! : Balise d expression"); %>
	
	<%= "Bip bip !" %>	
	
	<h4>Les directives en JSP</h4>
	
	
</body>
</html>