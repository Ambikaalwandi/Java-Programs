package LoopStmt;

public class PosNegNum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println(" \n Negative Odd Numbers from -100 to 100:");
	        int i = -100;
	        while (i <= 0) {
	            if (i % 2 != 0) {
	                System.out.println(i);
	            }
	            i++;
	        }

	        System.out.println("\nPositive Even Numbers from -100 to 100:");
	        i = 2;
	        while (i <= 100) {
	            if (i % 2 == 0) {
	                System.out.println(i);
	            }
	            i++;
	        }
	
	
	}
}
