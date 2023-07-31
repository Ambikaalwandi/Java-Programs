package Programs;
import java.util.Scanner;
public class EvenNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the numbers");
		int N= scan.nextInt();
		if(N<=100) 
		{
			System.out.println("the number is even");
		}
		else 
		{
			EvenNumApp e= new EvenNumApp();
		}
		

	}

}
