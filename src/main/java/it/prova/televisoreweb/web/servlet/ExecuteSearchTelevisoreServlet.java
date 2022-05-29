package it.prova.televisoreweb.web.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.prova.televisoreweb.service.MyServiceFactory;

@WebServlet("/ExecuteSearchTelevisoreServlet")
public class ExecuteSearchTelevisoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String destinazione = null;
		String marcaDaPagina = request.getParameter("marcaInput");
		String modelloDaPagina = request.getParameter("modelloInput");

		if (marcaDaPagina.equals("") && modelloDaPagina.equals("")) {
			String messaggioDiErroreDaInviare = "Attenzione! Bisogna valorizzare almeno un campo per proseguire!";
			request.setAttribute("messaggioDiErrore", messaggioDiErroreDaInviare);
			destinazione = "searchForm.jsp";
		} else {
			request.setAttribute("listaTelevisori", MyServiceFactory.getTelevisoreServiceInstance()
					.cercaPerMarcaEModello(marcaDaPagina, modelloDaPagina));
			destinazione = "results.jsp";
		}

		RequestDispatcher rd = request.getRequestDispatcher(destinazione);
		rd.forward(request, response);
	}

}
