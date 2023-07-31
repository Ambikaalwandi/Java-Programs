package SelectionStatement;
import java .util.Scanner;
public class RangeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		int num = scan.nextInt();
		if (num>=1 && num<=10)
		{
			System.out.println("the number is at range 1");
		}
		else if (num>=2 && num<=11)
		{
			System.out.println("the number is at range 2");
		}
		else if (num>=3 && num<=21)
		{
			System.out.println("the number is at range 3");
		}
		else if (num>=4 && num<=31)
		{
			System.out.println("the number is at range 4");
		}
		if (num>=5 && num<=41)
		{
			System.out.println("the number is at range 5");
		}
	}

}
