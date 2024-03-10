import java.util.Scanner;
/*
 * Scanner utility is imported to enable user input.
 */
public class main {
	public static void main(String[] args) {
		
	Scanner scanner = new Scanner (System.in);
	/*
	 * Scanner is created.
	 */
	System.out.println("In this program you can solve any equiation of the form: Ax^2+Bx+C" + "\n" + 
			"please input the the values for A, B and C. They can be decimals and negatives");
	System.out.println("Input A:");
	String x =scanner.nextLine();
	double  a = Double.parseDouble(x); //STR X is transformed to Double A
	System.out.println("Input B:");
	String y = scanner.nextLine();
	double  b = Double.parseDouble(y); //STR Y is transformed to Double B
	System.out.println("Input C:");
	String z = scanner.nextLine();
	double  c = Double.parseDouble(z); //STR Z is transformed to Double C

	scanner.close();
	/*
	 * Scanner is closed.
	 */
	double discriminant = (b*b-4.0*a*c);
	/*
	 * Discriminant is calculated to enable future
	 * operations and comparisons.
	 */
	double left = ((-b)/(2.0*a));
	double right = (Math.sqrt(discriminant)/(2.0*a));
	double solution1 = left+right;
	double solution2 = left-right;		
	/*
	 * Quadratic formula is divided into the left and
	 * right sides to reduce the amount of written 
	 * operations later.
	 */
	String fsolution = (discriminant>=0)
        ? "The 1st Root is x1 = " + solution2 + ",The 2nd Root is x2 = " + solution1
        : "The square root of:" + discriminant + " is complex, leaving the answers to "
     		+ "this quadratic equation being complex as well";
	/*
     * To fulfill the requirement of not using else or
	 * if its needed to use ternary operators, that in
	 * this case compare the value of the discriminant to
	 * determine if the square root of it is going to be
	 * real or complex.
	 */
	System.out.println(fsolution);	
	/*
	 * Depending on what fsolution is the square roots are
	 * printed or the user is informed of the complex nature
	 * of the solution.
	 */
	}
}		