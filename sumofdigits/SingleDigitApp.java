package sumofdigits;

import java.util.Scanner;

public class SingleDigitApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number:");
		int a=scan.nextInt();
		SingleDigit s=new SingleDigit();
		
		int res=s.digit(a);
		
		System.out.println("the sum of digits until it "
				+ "becomes a single digit is:" +res);

	}

}
