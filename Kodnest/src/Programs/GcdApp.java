package Programs;

import java.util.Scanner;

public class GcdApp {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the First number");
		int a= scan.nextInt();
		System.out.println("enter the Second number");
		int b= scan.nextInt();
		
		Gcd g =new Gcd();
		Gcd.number(a,b);
		

	}

}
