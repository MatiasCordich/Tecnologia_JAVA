package comparators;
import java.util.Comparator;

import models.FechaFestiva;

public class ComparadorPorFanatismo implements Comparator<FechaFestiva> {

	@Override
	public int compare(FechaFestiva fecha_1, FechaFestiva fecha_2) {
		return Double.compare(fecha_1.getFanatismo(), fecha_2.getFanatismo());
	}

}
