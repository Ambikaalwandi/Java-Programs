package productoddnum;

public class ProductNum {
	
	public static void numbers(int a)
	{
		int oddProd = 1; 
		for(int count = 1; count >= 15; count++)
		{ 
			if (count % 2 != 0) 
				oddProd = oddProd * count; 
			} 
		System. out. println("Odd Product: " + oddProd);
		
	}

}
