package String_practise;

public class FirstLetterofString 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		String str ="Hello Fais Pathan ";
		returnFirstAlphabates (str);
	}

	public static void returnFirstAlphabates(String str) 
	{
		String word="";
		String [] split =str.split(" ");
		for (int i=0; i<split.length;i++)
		{
			word=split[i];
			System.out.print(word.charAt(0));		
		}	
	}
}
 