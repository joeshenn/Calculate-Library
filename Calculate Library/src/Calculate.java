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
	public static double average(double num1, double num2) {
		return (num1+num2)/2;
	}
	public static double average(double num1, double num2, double num3) {
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
	public static double max(double num1, double num2) {
		if(num1 >= num2) {
			return num1;
		}else {
			return num2;
		}
	}
	public static double max(double num1, double num2, double num3) {
		if(num1 >= num2 && num1 >= num3) {
			return num1;
		}else if(num2 >= num1 && num2 >= num3){
			return num2;
		}else {
			return num3;
		}
	}
	public static int min(int num1, int num2) {
		if(num1 <= num2) {
			return num1;
		}else {
			return num2;
		}
	}
	public static double round2(double num1) {
		int thousandTimes = (int) (num1 * 1000);
		int hundredTimes = (int)(num1*100);
		if(thousandTimes%10 >=5) {
			return (double)(hundredTimes+1)/100.0;
		}else {
			return (double)(hundredTimes/100.0);
		}
	}
	public static double exponent(double num, int exp) {
		double answer = num;
		for(int i=1; i < exp; i++) {
			answer = answer * num;
		}
		return answer;
	}
	public static int factorial(int num) {
		for(int i=num-1;i>0;i--) {
			num = num*i;
		}
		return num;
	}
	public static boolean isPrime(int num) {
		int count = num-1;
		while (count>0){
			if(Calculate.isDivisbleBy(num, count)==false) {
				count--;
			}
			else {
				break;
			}
		}
		if (count==1) {
			return true;
		}else {
			return false;
		}
	}
	/* 
		int smaller = Calculate.min(num1, num2);
		int bigger = (int) Calculate.max(num1, num2);
		if(bigger%smaller==0) {
			return smaller;
		}
		else {
			while(smaller>1) {
			}
		}
	} */
}
