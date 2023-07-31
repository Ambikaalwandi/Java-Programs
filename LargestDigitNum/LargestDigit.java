package LargestDigitNum;

public class LargestDigit {
	public static int largestdigit(long number) {
		
		number=Math.abs(number);
		int largeDigit=0;
		while(number>0);
		int digit =(int)(number %10);
		if(digit>largeDigit) {
			largeDigit=digit;
		}
		number=number/10;
	
	return largeDigit;
	}
}

