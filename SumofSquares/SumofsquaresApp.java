package SumofSquares;

import java.util.Scanner;

public class SumofsquaresApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number :");
        
		  double numbers=scan.nextDouble();
		  double squareroot=Sumofsquares.Sumofsquares(numbers);
		  System.out.println("the squareroot is " + squareroot);
	    }
	}

