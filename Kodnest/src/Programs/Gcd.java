package Programs;

public class Gcd {
    public static void number(int a,int b) 
    {
    	
    	int gcd = 0;
    	 for (int i = 1; i <= a || i <= b; ++i)
    	 {
    		 if (a % i == 0 && b% i == 0)
    		        gcd = i;
    		 {
    		System.out.println("GCD of the number is :" +gcd);
    		        
    	}

    	 }

    }
}
