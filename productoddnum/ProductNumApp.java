package productoddnum;

import java.util.Scanner;

public class ProductNumApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number:");
		
		int a=scan.nextInt();
		
		ProductNum s1=new ProductNum();
		s1.numbers(a);

	}

}
