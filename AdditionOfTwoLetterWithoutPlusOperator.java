package String_practise;

import java.util.Scanner;

public class AdditionOfTwoLetterWithoutPlusOperator 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st Number :- ");
		double a=sc.nextDouble();
		System.out.println("Enter the 2nd Number :- ");
		double b=sc.nextDouble();
		int count=0;
		if(a>b)
		{
			for (double i=a;i<b;i++)
			{
				count++;
			}
			System.out.println("The count is :- "+((b*2)-count));		
		}
		else
		{
			for(double i=b;i<a;i++)
			{
				count++;
			}
			System.out.println("The count is :- "+((a*2)-count));
		}	
	}
}
