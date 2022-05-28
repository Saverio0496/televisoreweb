package it.prova.televisoreweb.service.televisore;

import java.util.List;

import it.prova.televisoreweb.dao.televisore.TelevisoreDAO;
import it.prova.televisoreweb.model.Televisore;

public class TelevisoreServiceImpl implements TelevisoreService {

	private TelevisoreDAO televisoreDAO;

	public void setTelevisoreDAO(TelevisoreDAO televisoreDAO) {
		this.televisoreDAO = televisoreDAO;
	}

	@Override
	public List<Televisore> cercaPerMarcaEModello(String marca, String modello) {
		return televisoreDAO.findByMarcaAndModello(marca, modello);
	}

	@Override
	public List<Televisore> elencaTutti() throws Exception {
		return televisoreDAO.list();
	}

	@Override
	public Televisore cercaTelevisorePerId(Long id) throws Exception {
		return televisoreDAO.get(id);
	}

	@Override
	public int inserisciNuovoTelevisore(Televisore televisoreInput) throws Exception {
		return televisoreDAO.insert(televisoreInput);
	}

	@Override
	public int rimuoviTelevisore(Televisore televisoreInput) throws Exception {
		return televisoreDAO.delete(televisoreInput);
	}

	@Override
	public int aggiornaTelevisore(Televisore televisoreInput) throws Exception {
		return televisoreDAO.update(televisoreInput);
	}

}
