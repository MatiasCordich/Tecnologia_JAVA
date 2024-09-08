package comparators;
import java.util.Comparator;

import models.FechaFestiva;

public class ComparadorPorMes implements Comparator<FechaFestiva> {

	@Override
	public int compare(FechaFestiva fecha_1, FechaFestiva fecha_2) {
		return Integer.compare(fecha_1.getMes(), fecha_2.getMes());
	}

}
