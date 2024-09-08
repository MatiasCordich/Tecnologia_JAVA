package comparators;
import java.util.Comparator;

import models.FechaFestiva;

public class ComparadorPorDia implements Comparator<FechaFestiva> {

	@Override
	public int compare(FechaFestiva fecha_1, FechaFestiva fecha_2) {
		return Integer.compare(fecha_1.getDia(), fecha_2.getDia());
	}

}
