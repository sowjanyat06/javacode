package copyprog;

public class Thiscalling 
{
	Thiscalling(String a)
		{
			this('A');
			System.out.println("3");
		}
	Thiscalling(String a,boolean b)
		{
			this("Java");
			System.out.println("2");
		}
	Thiscalling()
		{
			this("Pallavi",false);
			System.out.println("1");
		}
		
	Thiscalling(char a)
		{
			System.out.println("4");
		}
		public static void main(String[] args) 
		{
			new Thiscalling();
		}
	

}
