package copyprog;

public class Checking_vowels 
{

	public static void main(String[] args) 
	{
		String input = "sowjanya";
		
		int countofvowels = 0;
		for(int i=0;i<input.length();i++)
		{
			char output=input.charAt(i);
			if (output=='a'||output=='e'||output=='i'||output=='o'||output=='u')
			{
			countofvowels++ ;
			}
		}
System.out.println("count is " + countofvowels);
	}

}
