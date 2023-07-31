package LoopStmt;

public class SumDivisible1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int count=0;
		int i=1;
		
		while(i<=50) {
			if (i%3 ==0)
			{
				sum +=i;
				count++;
			}
			i++;
		}
		System.out.println("count: " +count);
		System.out.println("sum : " +sum);
	}
}
		
		