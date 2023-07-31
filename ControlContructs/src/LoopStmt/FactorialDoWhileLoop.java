package LoopStmt;
import java.util.Scanner;
public class FactorialDoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int factorial = 1;
        int i = 1;

		 Scanner scan = new Scanner(System.in);
		 
	        System.out.print("Enter a number: ");
	        int number = scan.nextInt();

	       

	        do {
	            factorial *= i;
	            i++;
	        } while (i <= number);

	        System.out.println("The factorial of " + number + " is: " + factorial);
	}

}
