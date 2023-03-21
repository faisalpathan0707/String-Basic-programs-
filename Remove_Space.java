package String_practise;

import java.util.Scanner;

public class Remove_Space 
{
	public static void main(String[]args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String :- ");
		String str=sc.next();
		str=str.replaceAll(" ", "");
		System.out.println("String without Space :- "+str);
	}
}
