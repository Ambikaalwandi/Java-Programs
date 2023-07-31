package CubeRoot;

import java.util.Scanner;

public class CubeNumApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number :");
        
		  double numbers=scan.nextDouble();
		  double cuberoot=CubeNum.CubeNum(numbers);
		  System.out.println("the cuberoot is " + cuberoot);

	}

}
