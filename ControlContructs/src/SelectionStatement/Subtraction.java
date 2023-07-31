package SelectionStatement;
import java.util.Scanner;

      public class Subtraction {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	          
	        System.out.print("Enter the first number: ");
	        int num1 = scanner.nextInt();
	        
	        
	        System.out.print("Enter the second number: ");
	        int num2 = scanner.nextInt();
	        
	        
	        int larger = Math.min(num1, num2);
	        int smaller = Math.max(num1,num2);
	        
	        
	        int result = larger - smaller;
	        
	        System.out.println("The result is: " + result);
	        
	        scanner.close();
	    }
    }
      
  