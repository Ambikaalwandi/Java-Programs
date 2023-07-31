package Programs;

public class DisplayNumbersApp {
	
	public void divisible2(int N) {
		System.out.print("Divisible by 2:");
		for(int i=1;i<=N;i++) 
		{
		if(i%2==0) {
			System.out.print(""+i);
		}
	}
	}
	
	public void divisible3(int N) {
		System.out.println();
		System.out.print("Divisible by 3:");
		for(int i=1;i<=N;i++) 
		{
		if(i%3==0) {
			System.out.print(""+i);
		}
	}
	}
	public void divisible5(int N) {
		System.out.println();
		System.out.print("Divisible by 5:");
		for(int i=1;i<=N;i++) 
		{
		if(i%5==0) {
			System.out.print(""+i);
		}
	}
	}
	public void divisible25(int N) {
		System.out.println();
		System.out.print("Divisible by 2and 5:");
		for(int i=1;i<=N;i++) 
		{
		if(i%2==0 && i%5==0) {
			System.out.print(""+i);
		}
	}
	}
	public void divisible35(int N) {
		System.out.println();
		System.out.print("Divisible by 3and 5:");
		for(int i=1;i<=N;i++) 
		{
		if(i%3==0 && i%5==0) {
			System.out.print(""+i);
		}
	}
	}
	void primenumber(int N) {
		System.out.println();
		System.out.print("prime numbers:");
		for(int i=1;i<=N;i++) 
		{
			int count=0;
			for(int j=1;j<=N;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2) {
			System.out.print(""+i);
		}
	}
}
	void evenprime(int N) {
		System.out.println();
		System.out.print("even prime numbers:");
		for(int i=1;i<=N;i++) 
		{
			int count=0;
			for(int j=1;j<=N;j++) {
				if(i%j==0) 
				{
					count++;
				}
			}
			if(count==3 && i%2==0) 
			{
			System.out.print(""+i);
		}
	}
}
	void oddprime(int N) {
		System.out.println();
		System.out.println("odd prime numbers:");
		for(int i=1;i<=N;i++) 
		{
			int count=0;
			for(int j=i;j<=N;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2 && i%2!=0) {
				System.out.println(""+i);
			}
		}
	}

	void evendiv3(int N) {
		System.out.println();
		System.out.print("even Divisible by 3:");
		for(int i=1;i<=N;i++) 
		{
		if(i%2==0 && i%3==0) {
			System.out.print(""+i);
		}
	}
	}
	public void odddiv5(int N) {
		System.out.println();
		System.out.print("odd Divisible by 5:");
		for(int i=1;i<=N;i++) 
		{
		if(i%2!=0 && i%5==0) {
			System.out.print(""+i);
		}
	}
	}
	
	
	
	
}