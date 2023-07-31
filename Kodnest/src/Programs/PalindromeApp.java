package Programs;

import java.util.Scanner;

public class PalindromeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int b= scan.nextInt();
		Palindrome p =new Palindrome();
		Palindrome.number(b);
	
	}

}
