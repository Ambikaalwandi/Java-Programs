package Fibonacci;

public class Fibonacci {
	
	 public  void Fibon(int n) {
		  int n1=0,n2=1,n3,i,count=10;
		  for(i=2;i<=n;i++) {
			  n3=n1+n2;
			  n1=n2;
			  n2=n3;
			  System.out.println(n3+"");
		  }
	  }
	

}
