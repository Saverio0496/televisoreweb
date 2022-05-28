package it.prova.televisoreweb.service.televisore;

import java.util.List;

import it.prova.televisoreweb.dao.televisore.TelevisoreDAO;
import it.prova.televisoreweb.model.Televisore;


public interface TelevisoreService {
	
	public void setTelevisoreDAO(TelevisoreDAO televisoreDAO);

	public List<Televisore> cercaPerNomeECognome(String nome, String cognome);
	
	public List<Televisore> elencaTutti() throws Exception;
	
	public Televisore cercaTelevisorePerId(Long id) throws Exception;
	
	public int inserisciNuovoTelevisore(Televisore televisoreInput) throws Exception;
	
	public int rimuoviTelevisore(Televisore televisoreInput) throws Exception;
	
	public int aggiornaTelevisore(Televisore televisoreInput) throws Exception;

}
