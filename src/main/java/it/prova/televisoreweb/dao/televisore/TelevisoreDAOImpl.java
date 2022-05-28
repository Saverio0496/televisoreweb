package it.prova.televisoreweb.dao.televisore;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import it.prova.televisoreweb.dao.DB_Mock;
import it.prova.televisoreweb.model.Televisore;

public class TelevisoreDAOImpl implements TelevisoreDAO {

	private Connection connection;

	public void setConnection(Connection connection) {
		this.connection = connection;
	}

	@Override
	public List<Televisore> list() throws Exception {
		List<Televisore> result = new ArrayList<Televisore>();
		for (Televisore televisoreItem : DB_Mock.LISTA_TELEVISORI) {
			result.add(televisoreItem);
		}
		return result;
	}

	@Override
	public Televisore get(Long id) throws Exception {
		Televisore result = new Televisore();
		for (Televisore televisoreItem : DB_Mock.LISTA_TELEVISORI) {
			if (televisoreItem.getIdTelevisore().equals(id))
				result = televisoreItem;
		}
		return result;
	}

	@Override
	public int update(Televisore televisoreInput) throws Exception {
		for (Televisore televisoreItem : DB_Mock.LISTA_TELEVISORI) {
			if (televisoreItem.getIdTelevisore() == televisoreInput.getIdTelevisore()) {
				televisoreItem.setMarca(televisoreInput.getMarca());
				televisoreItem.setModello(televisoreInput.getModello());
				televisoreItem.setPrezzo(televisoreInput.getPrezzo());
				televisoreItem.setNumeroPollici(televisoreInput.getNumeroPollici());
				televisoreItem.setCodice(televisoreInput.getCodice());
				return 1;
			}
		}
		return 0;
	}

	@Override
	public int insert(Televisore televisoreInput) throws Exception {
		televisoreInput.setIdTelevisore(DB_Mock.getNexIdAvailable());
		return DB_Mock.LISTA_TELEVISORI.add(televisoreInput) ? 1 : 0;
	}

	@Override
	public int delete(Televisore televisoreInput) throws Exception {
		return DB_Mock.LISTA_TELEVISORI.remove(televisoreInput) ? 1 : 0;
	}

	@Override
	public List<Televisore> findByMarcaAndModello(String marca, String modello) {
		List<Televisore> result = new ArrayList<>();

		for (Televisore televisoreItem : DB_Mock.LISTA_TELEVISORI) {
			if (televisoreItem.getMarca().startsWith(marca) && televisoreItem.getModello().startsWith(modello))
				result.add(televisoreItem);
		}
		return result;
	}
}
