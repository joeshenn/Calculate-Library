/* This class contains methods that perform various mathematical operations.
 * @author Joe Shen
 * @version 9/6/2018
 */
public class Calculate {
	//returns the square of the input
	public static int square(int number) {
		return number*number;
		
	}
	public static int cube(int number) {
		return number*number*number;
	}
	public static double average2(double num1, double num2) {
		return (num1+num2)/2;
	}
	public static double average3(double num1, double num2, double num3) {
		return (num1+num2+num3)/3;
	}
	public static double toDegrees(double radians) {
		return (radians/3.14159);
	}
	public static double toRadians(double degrees) {
		return (degrees/180)*3.14159;
	}
	public static double discriminant(double a, double b, double c) {
		return (b*b)-(4*a*c);
	}
	public static String toImproperFrac(int wholenum,int numerator, int denominator) {
		return (wholenum*denominator)+numerator +"/" + numerator;
	}
	public static String toMixedNum(int numerator, int denominator) {
		return (numerator/denominator)+"_"+7%2+"/"+denominator;
	}
	public static String foil(int a, int b, int c, int d, String e) {
		return a*b + "n^2" + " + " + ((a*d)+(b*c)) + "n" + " + " + c*d;
	}
	public static boolean isDivisbleBy(int num1, int num2) {
		if(num1%num2 == 0) {
			return true;
		}
		else {
			return false;
			
		}
	}
	public static double absValue(double num) {
		if(num >= 0) {
			return num;
		}
		else {
			return num*-1;
		}
	}
}
