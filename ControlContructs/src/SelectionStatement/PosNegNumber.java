package SelectionStatement;
import java.util.Scanner;

public class PosNegNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		int num = scan.nextInt();
		if(num>0)
		{
			System.out.println("the number is positive");
		}
		else 
		{
			System.out.println("the number is negative");
		}

	}

}
