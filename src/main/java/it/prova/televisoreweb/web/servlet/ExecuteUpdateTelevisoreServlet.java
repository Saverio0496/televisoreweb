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

@WebServlet("/ExecuteUpdateTelevisoreServlet")
public class ExecuteUpdateTelevisoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// binding
		String marcaTelevisoreInput = request.getParameter("marcaInput");
		String modelloTelevisoreInput = request.getParameter("modelloInput");
		int prezzoTelevisoreInput = Integer.parseInt(request.getParameter("prezzoInput"));
		int numeroPolliciTelevisoreInput = Integer.parseInt(request.getParameter("numeroPolliciInput"));
		String codiceTelevisoreInput = request.getParameter("codiceInput");

		try {
			Televisore televisoreRecuperatoDalDatabase = MyServiceFactory.getTelevisoreServiceInstance()
					.cercaTelevisorePerId(Long.parseLong(request.getParameter("idTelevisore")));
			televisoreRecuperatoDalDatabase.setMarca(marcaTelevisoreInput);
			televisoreRecuperatoDalDatabase.setModello(modelloTelevisoreInput);
			televisoreRecuperatoDalDatabase.setPrezzo(prezzoTelevisoreInput);
			televisoreRecuperatoDalDatabase.setNumeroPollici(numeroPolliciTelevisoreInput);
			televisoreRecuperatoDalDatabase.setCodice(codiceTelevisoreInput);

			MyServiceFactory.getTelevisoreServiceInstance().aggiornaTelevisore(televisoreRecuperatoDalDatabase);

			request.setAttribute("listaTelevisori", MyServiceFactory.getTelevisoreServiceInstance().elencaTutti());

		} catch (Exception e) {
			e.printStackTrace();
		}

		RequestDispatcher rd = request.getRequestDispatcher("results.jsp");
		rd.forward(request, response);
	}

}
