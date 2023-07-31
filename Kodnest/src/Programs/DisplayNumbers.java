package Programs;
import java.util.Scanner;
public class DisplayNumbers {

		public static void main(String[] args)
		{
			Scanner scan=new Scanner(System.in);
			System.out.println("enter the numbers");
			int N= scan.nextInt();
			if(N<=100) 
			{
				System.out.println("enter the valid numbers");
			}
			else 
			{
			   DisplayNumbersApp d= new  DisplayNumbersApp();
			   d.divisible2(N);
			   d.divisible3(N);
			   d.divisible5(N);
			   d.divisible25(N);
			   d.divisible35(N);
			   d.primenumber(N);
			   d.evenprime(N);
			   d.oddprime(N);
			   d.evendiv3(N);
			   d.odddiv5(N);
			   
			}
			
			
			}
		}
