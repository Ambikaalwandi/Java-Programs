package powercalculator;

public class PowerCalculator
{
	public static double PowerCalculator(double base,int e)
         {
		double result=1;
		int absExponent=Math.abs(e);
		for(int i=0;i<absExponent;i++)
		{
			result*=base;
		}
		if(e<0) {
			return 1/result; 
		}
		else {
			return result;
		}
	 }
}
