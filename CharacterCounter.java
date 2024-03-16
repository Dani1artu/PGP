package src;
import java.util.Scanner;
/*
 * Scanner utility is imported to enable user input.
 */
public class CharacterCounter {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		/*
		 * Scanner is created.
		 */
		System.out.println("Input #:"); //user input is asked
		String x =scanner.nextLine();

		scanner.close();
		/*
		 * Scanner is closed.
		 */
		x = x.replace("-", "");
		x = x.replace("+", "");
		/*
		 * the + or - signs that could be added to the number are disregarded
		 * so that the count is made only in the number part
		 */
		int charnum = 0;
		/*
		 * variable charnum is created to track the number of characters
		 */
		for (char c : x.toCharArray()) {
		    charnum++;
		}
		/*
		 * a for each cycle is created where the function .toCharArray converts
		 * the user String input to the variable char c, and as the cycle is
		 * working charnum saves the amount of passes.
		 */
		System.out.println(charnum);
		/*
		 * charnum is printed, and outputs the number of characters in the user string
		 */
		
	}
}
