package LoopStmt;

public class PosNegNum3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println(" \n Negative Odd Numbers from -100 to 100:");
		int i = -100;
        do {
            if (i % 2 != 0 && i < 0) {
                System.out.println(i);
            }
            i++;
        } while (i <= 0);
        
        System.out.println("\n Positive Even Numbers from -100 to 100:");
        i = 2;
        do {
            if (i % 2 == 0 && i > 0) {
                System.out.println(i);
            }
            i++;
        } while (i <= 100);
	}
}
	
	
			 
		 
		 
		 
	

	


