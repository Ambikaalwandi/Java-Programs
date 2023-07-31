package Programs;

import java.util.Scanner;

public class SumNumApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the first number");
		int b= scan.nextInt();
		System.out.println("enter the second number ");
		int c= scan.nextInt();
		SumNum s= new SumNum();
		s.number(b,c);
		

	}

}
