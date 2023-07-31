package LoopStmt;

public class PosNegNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  
        System.out.print(" \n \n  negative odd numbers from -100 to 100: ");  
        for (int i=-100; i<=0; i++)                                                             
        { 
            if ( i%2 !=0 )
            {                                                     
                System.out.print(i);
            }
        }
        System.out.print(" \n  positive even numbers from -100 to 100: ");  
        for (int i=2; i<=100; i++)   
        { 
            if ( i%2 == 0 )
            {
                System.out.print(i);
            }
        } 
	}

}










