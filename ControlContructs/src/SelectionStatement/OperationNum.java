package SelectionStatement;
import java.util.Scanner;
public class OperationNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("enter the first number");
		double num1 = input.nextDouble();
		System.out.println("enter the second number");
		double num2 = input.nextDouble();
		System.out.println("enter the operation(+,-,*,/):");
		char operation = input.next().charAt(0);
		if(operation=='+'){
			System.out.println(num1+num2);
		}
		else if(operation=='-')
		{
			System.out.println(num1-num2);
		
		}
		
		else if(operation=='*')
		{
			System.out.println(num1*num2);
		}
		else if(operation=='/')
		{
			System.out.println(num1/num2);
		}
		else {
			System.out.println("invalid operation please enter only +,-,*,/");
		}
	}

}
