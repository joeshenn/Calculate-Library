/*This class is client code that uses the calculate library to perform various mathematical tasks.
 * @author Joe Shen
 * @version 9/6/2018 
 */
public class DoMath {

	public static void main(String[] args) {
		System.out.println(Calculate.cube(6));
		System.out.println(Calculate.average2(5, 7));
		System.out.println(Calculate.average3(3, 2 , 7));
		System.out.println(Calculate.toDegrees(3.14159));
		System.out.println(Calculate.toRadians(360));
		System.out.println(Calculate.toMixedNum(22, 7));
		System.out.println(Calculate.foil(5, 6, 7, 8, "x"));
		System.out.println(Calculate.isDivisbleBy(5, 10));
		System.out.println(Calculate.absValue(-5));
	}

}
