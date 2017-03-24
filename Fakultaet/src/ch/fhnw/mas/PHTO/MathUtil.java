package ch.fhnw.mas.PHTO;

public class MathUtil {
	/**
	 * here comes some description.
	 * @param limit: limit number
	 * @return: go back
	 */
	static long faculty(int limit){
		long fakultaet = 1;
/**
 * iterator=1 is loop number
 */
		for(int iterator=1; iterator<=limit; iterator++){
			fakultaet = fakultaet * iterator;
		}

		return fakultaet;
}
}