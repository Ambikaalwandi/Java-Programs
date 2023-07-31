package PrimeNum;

import java.util.Scanner;

public class PrimeNumApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int N=scan.nextInt();
       PrimeNum s1=new PrimeNum();
		s1.primenum(N);


	}

}
