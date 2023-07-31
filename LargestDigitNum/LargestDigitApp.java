package LargestDigitNum;
import java.util.Scanner;
public class LargestDigitApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number:");
		long number=scan.nextLong();
		
		int largeDigit =LargestDigit.largestdigit(number);
		System.out.println("the largest digit in the number is "+largeDigit);
           
	}
}
