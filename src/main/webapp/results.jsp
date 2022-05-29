<%@page import="java.util.List"%>
<%@page import="it.prova.televisoreweb.model.Televisore"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Pagina dei risultati</title>
<style type="text/css">
	table, th, td {
	  border: 1px solid black;
	}
	
	th, td {
	  padding: 10px;
	}
	.center {
		margin-left: auto;
		margin-right: auto;
	}
</style>

</head>
<body>

	<table class="center">
		<thead>
			<tr>
				<th>Marca</th>
				<th>Modello</th>
				<th>Azione</th>
			</tr>
		</thead>
		
		<% List<Televisore> listaDaServlet = (List<Televisore>)request.getAttribute("listaTelevisori");
							for(Televisore televisoreItem : listaDaServlet){
				%>
				<tr>
					<td><%=televisoreItem.getMarca() %></td>
					<td><%=televisoreItem.getModello() %></td>
					<td>
						<a href="ExecuteShowTelevisoreServlet?idDaInviareComeParametro=<%=televisoreItem.getIdTelevisore() %>">Dettaglio</a>
						<a href="?idDaInviareComeParametro=<%=televisoreItem.getIdTelevisore() %>">Modifica</a>
						<a href="?idDaInviareComeParametro=<%=televisoreItem.getIdTelevisore() %>">Elimina</a>
						
					</td>
				</tr>
		<%	}%>
	
	</table>
	
	<a href="">Inserisci nuovo</a>

</body>
</html>