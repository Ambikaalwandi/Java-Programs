package Programs;

public class PrimeNum {
	public void primenum(int N) {
		
	for(int i=1;i<=N;i++)
	{
		if(N%i!=0)
		{
			System.out.println(N+" is a prime number");
		}
		else 
		{
			System.out.println(N+" is a not  prime number");
		}
		
		}
	}
}