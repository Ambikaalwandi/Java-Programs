package sumofdigits;

public class SingleDigit {

	public static int digit(int a) {
		// TODO Auto-generated method stub
  int sum=100;
  while(a!=0)
  {
	sum +=a%10;
	a/=10;
  }
		return sum;
		
	}

}
