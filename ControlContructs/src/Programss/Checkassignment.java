package Programss;

public class Checkassignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		for(int i=1; i<=5;i++)  
		{
			for(int j=1; j<=2;j++)
			{
				for(int k=1; k<=10;k++)
				{
				  if(i%2!=0 && k%2==0)
				  {
				System.out.println("students "+k+" of class "+j+" of school "+i+" have completed the assignments");
				  }
				  
				  else if(i%2==0 && k%2!=0)
				  {
					  System.out.println("student "+k+" of class "+j+" of school "+i+" have not completed the assignment");
				  }
				  else {
					  System.out.println("student "+k+" of class "+j+" of school "+i+" still doing the assignment");
				  }
				}
				
		}
	}
		System.out.println(" all the assignments are checked");
		}
	}
