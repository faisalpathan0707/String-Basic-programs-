package String_practise;

import java.util.Scanner;

public class count_The_words 
{
	public static void main(String[]args) 
	{
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String :- ");
		String s=sc.next();
		String [] words =s.trim().split(" ");
		System.out.println("Count of words is :- "+words.length);
	}
}
