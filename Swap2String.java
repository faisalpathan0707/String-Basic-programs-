package String_practise;

import java.util.Scanner;

public class Swap2String 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String temp;
		System.out.println("Enter the String one :- ");
		String one=sc.next();
		System.out.println("Enter the String two  :- ");
		String two=sc.next();
		
		temp=one;
		one=two;
		two=temp;
		
		System.out.println("After Swaping ");
		System.out.println("The String one :- "+one);
		System.out.println("The String Two:- "+two);
	}
}
