package it.prova.televisoreweb.dao;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class DB_Mock {
	public static final List<Televisore> LISTA_TELEVISORI = new ArrayList<>();

	static {
		// preparo una lista mock perché ancora non ho il collegamento alla
		// base dati
		LISTA_TELEVISORI.add(new Televisore(1l, "mario", "rossi", "mrs111", 60, "ciao a tutti"));
		LISTA_TELEVISORI.add(new Televisore(2l, "mario2", "rossi2", "mrs222", 40, "mi piace"));
		LISTA_TELEVISORI.add(new Televisore(3l, "mario3", "rossi3", "mrs333", 29, "lascia stare"));
		LISTA_TELEVISORI.add(new Televisore(4l, "peppe", "bianchi", "pppbbb4", 23, "evviva il giorno"));
		LISTA_TELEVISORI.add(new Televisore(5l, "pluto", "rossi", "plros", 17, "la luna bussò"));
		LISTA_TELEVISORI.add(new Televisore(6l, "mario36", "rossi36", "mrs366", 39, "Highway to hell"));
		LISTA_TELEVISORI.add(new Televisore(7l, "antonio", "sattoni", "mrs333", 77, "le ali della libertà"));
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
