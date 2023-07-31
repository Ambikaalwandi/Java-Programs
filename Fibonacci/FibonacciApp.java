package Fibonacci;

import java.util.Scanner;

public class FibonacciApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the  numbers");
		int i= scan.nextInt();
		Fibonacci s1=new Fibonacci();
		s1.Fibon(i);

	}

}
