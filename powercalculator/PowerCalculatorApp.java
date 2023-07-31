package powercalculator;
import java.util.Scanner;
public class PowerCalculatorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the base:");
		double base= scan.nextDouble();
		System.out.println("enter the exponent:");
		int exponent =scan.nextInt();
		
		double result=PowerCalculator.PowerCalculator(base,exponent);
		System.out.println(base+"is the power of"+exponent+"is:" +result);
	}
}
		
		
	
