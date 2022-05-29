package it.prova.televisoreweb.web.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.prova.televisoreweb.model.Televisore;
import it.prova.televisoreweb.service.MyServiceFactory;

@WebServlet("/ExecuteInsertTelevisoreServlet")
public class ExecuteInsertTelevisoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// binding
		String marcaNuovoTelevisore = request.getParameter("marcaInput");
		String modelloNuovoTelevisore = request.getParameter("modelloInput");
		int prezzoNuovoTelevisore = Integer.parseInt(request.getParameter("prezzoInput"));
		int numeroPolliciNuovoAbitante = Integer.parseInt(request.getParameter("numeroPolliciInput"));
		String codiceNuovoTelevisore = request.getParameter("codiceInput");

		// inizializzo un nuovo televisore
		Televisore nuovoTelevisoreDaInserire = new Televisore(marcaNuovoTelevisore, modelloNuovoTelevisore,
				prezzoNuovoTelevisore, numeroPolliciNuovoAbitante, codiceNuovoTelevisore);

		try {
			MyServiceFactory.getTelevisoreServiceInstance().inserisciNuovoTelevisore(nuovoTelevisoreDaInserire);
			request.setAttribute("listaTelevisori", MyServiceFactory.getTelevisoreServiceInstance().elencaTutti());
		} catch (Exception e) {
			e.printStackTrace();
		}

		RequestDispatcher rd = request.getRequestDispatcher("results.jsp");
		rd.forward(request, response);

	}

}
