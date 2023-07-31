package SelectionStatement;

import java.util.Scanner;

public class MonthsSwitchNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number(1-12)");
		int month = scan.nextInt();
		String monthName;
		
		switch (month)
		{
		
		case '1':
			System.out.println("january");
		    break;
		
		case '2':
			System.out.println("Feb");
		    break;
		
		case '3':
			System.out.println("March");
		    break;
		
		case '4':
			System.out.println("April");
		    break;
		
		case '5':
			System.out.println("May");
			break;
		
		case '6':
			System.out.println("june");
			break;
			
		case '7':
			System.out.println("july");
			break;
			
		case '8':
			System.out.println("august");
			break;
			
		case '9':
			System.out.println("september");
			break;
		
		case 10:
			System.out.println("october");
			break;
			
		case 11:
			System.out.println("november");
			break;
			
		case 12:
			System.out.println("december");
			break;
			
		default : monthName="invalid month";
		}
		System.out.println("the respective month is :"+ month);
			
		}
		}
	



