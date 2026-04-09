package copyprog;

public class Palin {

	public static void main(String[] args)
	{
		String input ="madam";
		
		String reverse ="";
		
		
		for(int i=input.length()-1;i>=0;i--)
		{
			
			char c1 = input .charAt(i);
			reverse =reverse+c1;
		}
	if(reverse.equals(input))
	{
		System.out.println("palindrome ");
	}
	else
	{
		System.out.println("not palindrome ");
	}

	}

}
