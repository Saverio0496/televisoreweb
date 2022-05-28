package it.prova.televisoreweb.dao.televisore;

import java.sql.Connection;
import java.util.List;

import it.prova.televisoreweb.model.Televisore;

public class TelevisoreDAOImpl implements TelevisoreDAO {
	
	private Connection connection;

	public void setConnection(Connection connection) {
		this.connection = connection;
	}

	@Override
	public List<Televisore> list() throws Exception {
		return null;
	}

	@Override
	public Televisore get(Long id) throws Exception {
		return null;
	}

	@Override
	public int update(Televisore televisoreInput) throws Exception {
		return 0;
	}

	@Override
	public int insert(Televisore televisoreInput) throws Exception {
		return 0;
	}

	@Override
	public int delete(Televisore televisoreInput) throws Exception {
		return 0;
	}
}
