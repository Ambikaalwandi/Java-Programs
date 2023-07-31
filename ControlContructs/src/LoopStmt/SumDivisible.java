package LoopStmt;

public class SumDivisible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum =0;
		int count =0;
		for(int i =1; i<=50; i++)
		{
			if(i%3==0){
				sum +=i;
				count++;
			}
		}
				System.out.println("count:" +count);
				System.out.println("sum:" +sum);
				
			
		}
				
		}

	


