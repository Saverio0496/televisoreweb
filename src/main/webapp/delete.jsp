<%@page import="it.prova.televisoreweb.model.Televisore"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Pagina di cancellazione</title>
</head>
<body>

	<% Televisore televisoreDaEliminare = (Televisore) request.getAttribute("televisoreDaEliminare"); %>
	<p>Marca: <%= televisoreDaEliminare.getMarca() %> </p>
	<p>Modello: <%= televisoreDaEliminare.getModello() %> </p>
	<p>Prezzo: <%= televisoreDaEliminare.getPrezzo() %> </p>
	<p>Numero Pollici: <%= televisoreDaEliminare.getNumeroPollici() %> </p>
	<p>Codice: <%= televisoreDaEliminare.getCodice() %> </p>
	
	<form action="">
		<input type="submit" value="CONFERMA">
		<input type="hidden" name="idTelevisoreDaEliminare" value="<%= televisoreDaEliminare.getIdTelevisore() %>">	
	</form>
	

</body>
</html>