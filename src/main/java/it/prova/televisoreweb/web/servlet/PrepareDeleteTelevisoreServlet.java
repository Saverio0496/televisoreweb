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
import it.prova.televisoreweb.service.televisore.TelevisoreService;

@WebServlet("/PrepareDeleteTelevisoreServlet")
public class PrepareDeleteTelevisoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String parametroIdDelTelevisoreDaEliminare = request.getParameter("idDaInviareComeParametro");

		TelevisoreService televisoreServiceInstance = MyServiceFactory.getTelevisoreServiceInstance();
		Televisore result = new Televisore();
		try {
			result = televisoreServiceInstance
					.cercaTelevisorePerId(Long.parseLong(parametroIdDelTelevisoreDaEliminare));
		} catch (Exception e) {
			e.printStackTrace();
		}
		request.setAttribute("televisoreDaEliminare", result);
		RequestDispatcher rd = request.getRequestDispatcher("delete.jsp");
		rd.forward(request, response);

	}

}
