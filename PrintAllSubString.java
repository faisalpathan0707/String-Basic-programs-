package String_practise;

public class PrintAllSubString 
{
	public static void main(String[] args) 
	{
		
		String str = "abcdef";
		printsubstring(str);
	}

	private static void printsubstring(String str) 
	{
		for (int i=0;i<str.length();i++)
		{
			for (int j=0;j<str.length();j++)
			{
				System.out.println(str.substring(i,j));
			}
		}
	}
}
