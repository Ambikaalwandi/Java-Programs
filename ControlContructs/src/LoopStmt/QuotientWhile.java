package LoopStmt;
import java.util.Scanner;
public class QuotientWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scan.nextInt();
        
        while (number >= 1) 
        {
            System.out.println(number);
            number /= 2;

	}

}
}




	