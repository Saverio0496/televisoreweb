<%@page import="it.prova.televisoreweb.model.Televisore"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<% Televisore televisorePerModifica = (Televisore) request.getAttribute("televisoreDaModificare"); %>
	<form action="" >
		<input type="hidden" name="idTelevisore" value="<%= televisorePerModifica.getIdTelevisore() %>">		
		
		<label for="marcaInputId">MARCA:</label><br>
		<input type="text" name="marcaInput" id="marcaInputId" value="<%= televisorePerModifica.getMarca() %>">
		<br>
		<label for="modelloInputId">MODELLO:</label><br>
		<input type="text" name="modelloInput" id="modelloInputId" value="<%= televisorePerModifica.getModello() %>">
		<br>
		<label for="prezzoInputId">PREZZO:</label><br>
		<input type="text" name="prezzoInput" id="prezzoInputId" value="<%= televisorePerModifica.getPrezzo() %>">
		<br>
		<label for="numeroPolliciInputId">NUMERO POLLICI:</label><br>
		<input type="text" name="numeroPolliciInput" id="numeroPolliciInputId" value="<%= televisorePerModifica.getNumeroPollici() %>">
		<br>
		<label for="codiceInputId">CODICE:</label><br>
		<input type="text" name="codiceInput" id="codiceInputId" value="<%= televisorePerModifica.getCodice() %>">
		<br><br>
		<input type="submit" value="CONFERMA"> 
	</form>

</body>
</html>