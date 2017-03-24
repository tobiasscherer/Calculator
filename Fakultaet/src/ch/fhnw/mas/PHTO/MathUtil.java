package ch.fhnw.mas.PHTO;

public class MathUtil {
	/**
	 * here comes some description.
	 * @param grenze: limit number
	 * @return: go back
	 */
	static long faculty(int grenze){
		long fakultaet = 1;

		for(int zahl=1; zahl<=grenze; zahl++){
			fakultaet = fakultaet * zahl;
		}

		return fakultaet;
}
}