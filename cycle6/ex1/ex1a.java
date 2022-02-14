/*Write a program that demonstrates exception handling mechanism.
(a) Arithmetic exception*/
public class ex1a
{
	public static void main(String[] args)
	{
		try
			{
		        int x, y = 5;
		        x = y/0;
		        System.out.println(x);
			}
		catch(ArithmeticException e)
			{
				System.out.println(e);
			}
	}	
}	
