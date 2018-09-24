/* This class contains methods that perform various mathematical operations.
 * @author Joe Shen
 * @version 9/6/2018
 */
public class Calculate {
	//returns the square of the input
	public static int square(int number) {
		return number*number;
		
	}
	//returns the cube of the input
	public static int cube(int number) {
		return number*number*number;
	}
	//returns the average of 2 inputs
	public static double average(double num1, double num2) {
		return (num1+num2)/2;
	}
	//returns the average of 3 inputs 
	public static double average(double num1, double num2, double num3) {
		return (num1+num2+num3)/3;
	}
	//returns the degree conversion of an input in radians 
	public static double toDegrees(double radians) {
		return (radians/3.14159);
	}
	//returns the radian conversion of a degree input
	public static double toRadians(double degrees) {
		return (degrees/180)*3.14159;
	}
	//returns the discriminant based off of the three input, which represent the co-efficients of a 
	//quadratic equation in standard form
	public static double discriminant(double a, double b, double c) {
		return (b*b)-(4*a*c);
	}
	//returns an improper fraction conversion from a mixed number input
	public static String toImproperFrac(int wholenum,int numerator, int denominator) {
		return (wholenum*denominator)+numerator +"/" + numerator;
	}
	//converts an improper fraction to a mixed number
	public static String toMixedNum(int numerator, int denominator) {
		return (numerator/denominator)+"_"+7%2+"/"+denominator;
	}
	//given an expression in the form (ax*b)(cx*d), this method will return the expansion in 
	//the form of a quadratic equation in standard form
	public static String foil(int a, int b, int c, int d, String e) {
		return a*c + e + "^2" + " + " + ((a*d)+(b*c)) + e + " + " + b*d;
	}
	//
	public static boolean isDivisbleBy(int num1, int num2) {
		if(num1<0 | num2<0) {
			throw new IllegalArgumentException("negative numbers are not accepted");
		}
		else if(num1%num2 == 0) {
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
	public static double mindouble(double num1, double num2) {
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
		if(exp<0) {
			throw new IllegalArgumentException();
		}
		else if(exp==0) {
			return 1;
		}
		else {
		double answer = num;
		for(int i=1; i < exp; i++) {
			answer = answer * num;
		}
		return answer;
		}
	}
	public static int factorial(int num) {
		if(num<0) {
			throw new IllegalArgumentException("negative numbers are not accepted");
		}
		else if(num==0) {
			return 1;
		}
		else {
			
		for(int i=num-1;i>0;i--) {
			num = num*i;
		}
		return num;
		}
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
	public static int gcf(int num1, int num2) {
		int smaller = Calculate.min(num1, num2);
		int bigger = (int) Calculate.max(num1, num2);
		int count = smaller;
		while(count>1) {
			if(bigger%count==0 && smaller%count==0) {
				return count;
			}
			else {
				count--;
			}
		}
		return 1;
	} 
	public static double sqrt(double num) {
		if(num<0) {
			throw new IllegalArgumentException("negative numbers are not accepted");
		}
		else {
		double answer1=10;
		while(Calculate.absValue((answer1*answer1)-num)>=0.005) {
			answer1 =(0.5)*((num/answer1)+answer1);
	}
		
		return Calculate.round2(answer1);
			}
	}
	public static String quadForm(int a, int b, int c) {
		double discrim= Calculate.discriminant(a, b, c);
		if(discrim<0) {
			return "no real roots";
		}else if(discrim==0) {
			double singleRoot= Calculate.round2((-1*b)/(2*a));
			return ""+singleRoot;
		}else {
			double root1 = ((-1*b)+Calculate.sqrt(discrim))/(2*a);
			double root2 = ((-1*b)-Calculate.sqrt(discrim))/(2*a);
			return Calculate.mindouble(root1, root2) +" and " + Calculate.max(root1, root2);
		}
	}
}
