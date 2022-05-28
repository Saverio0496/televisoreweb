package it.prova.televisoreweb.dao;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import it.prova.televisoreweb.model.Televisore;

public class DB_Mock {
	public static final List<Televisore> LISTA_TELEVISORI = new ArrayList<>();

	static {
		// preparo una lista mock perché ancora non ho il collegamento alla
		// base dati
		LISTA_TELEVISORI.add(new Televisore(1L, "LG", "6565H", 300, 60, "65456456YU"));
		LISTA_TELEVISORI.add(new Televisore(2L, "Sony", "5648J", 120, 40, "9878977IO"));
		LISTA_TELEVISORI.add(new Televisore(3L, "Samsung", "0912F", 600, 30, "985122544PL"));
		LISTA_TELEVISORI.add(new Televisore(4L, "Apple", "0921K", 500, 21, "3453454354LM"));
		LISTA_TELEVISORI.add(new Televisore(5L, "TCL", "9124R", 200, 50, "12312321UI"));
		LISTA_TELEVISORI.add(new Televisore(6L, "Philips", "5454P", 199, 19, "6532654RF"));
		LISTA_TELEVISORI.add(new Televisore(7L, "Hisense", "3198Y", 789, 55, "62348987TY"));
	}

	public static Long getNexIdAvailable() {
		Long resultId = null;
		if (LISTA_TELEVISORI == null || LISTA_TELEVISORI.isEmpty()) {
			resultId = 1L;
		}
		resultId=LISTA_TELEVISORI.stream().max(Comparator.comparing(Televisore::getIdTelevisore)).get().getIdTelevisore();
		return ++resultId;
	}

}
