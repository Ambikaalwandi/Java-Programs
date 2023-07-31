package Programs;
import java.util.Scanner;
public class CharIdentifierApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter the character");
		
		char ch=scan.next().charAt(0);
		CharIdentifier c=new CharIdentifier();
		CharIdentifier.Identify(ch);
		
		

	}

}
