package SelectionStatement;

import java.util.Scanner;
public class IfStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		int marks = scan.nextInt();
		if(marks>90)
		{
			System.out.println("Welcome to TechClubApp");
		}
	}

}
