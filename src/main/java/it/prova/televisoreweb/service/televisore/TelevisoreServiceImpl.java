package it.prova.televisoreweb.service.televisore;

import java.util.List;


import it.prova.televisoreweb.dao.televisore.TelevisoreDAO;
import it.prova.televisoreweb.model.Televisore;

public class TelevisoreServiceImpl implements TelevisoreService {
	
	private TelevisoreDAO televisoreDAO;


	public void setTelevisoreDAO(TelevisoreDAO televisoreDAO) {
		this.televisoreDAO = televisoreDAO;
	}

	public List<Televisore> cercaPerNomeECognome(String nome, String cognome) {
		return null;
	}

	public List<Televisore> elencaTutti() throws Exception {
		return null;
	}

	public Televisore cercaTelevisorePerId(Long id) throws Exception {
		return null;
	}

	public int inserisciNuovoTelevisore(Televisore televisoreInput) throws Exception {
		return 0;
	}

	public int rimuoviTelevisore(Televisore televisoreInput) throws Exception {
		return 0;
	}

	public int aggiornaTelevisore(Televisore televisoreInput) throws Exception {
		return 0;
	}

}
