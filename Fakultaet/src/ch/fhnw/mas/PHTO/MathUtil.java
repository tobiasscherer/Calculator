package ch.fhnw.mas.PHTO;

public class MathUtil {
	
	static long faculty(int grenze){
		long fakultaet = 1;

		for(int zahl=1; zahl<=grenze; zahl++){
			fakultaet = fakultaet * zahl;
		}

		return fakultaet;
}
}