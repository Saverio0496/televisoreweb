<%@page import="it.prova.televisoreweb.model.Televisore"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dettaglio di un televisore</title>
</head>
<body>

	<% Televisore risultatoTelevisore = (Televisore) request.getAttribute("televisoreDaInviareAPaginaDettaglio"); %>
	<p>Marca: <%= risultatoTelevisore.getMarca() %> </p>
	<p>Modello: <%= risultatoTelevisore.getModello() %> </p>
	<p>Prezzo: <%= risultatoTelevisore.getPrezzo() %> </p>
	<p>Numero Pollici: <%= risultatoTelevisore.getNumeroPollici() %> </p>
	<p>Codice: <%= risultatoTelevisore.getCodice() %> </p>
	
	<a href ="searchForm.jsp">Home</a>

</body>
</html>