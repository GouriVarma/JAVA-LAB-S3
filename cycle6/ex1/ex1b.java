/*Write a program that demonstrates exception handling mechanism.
(b) Array out of index exception*/


public class ex1b
{
	public static void main(String[] args)
	{
		try
		{
			
			int a[] = {1,2,3,8,9};
			System.out.println(a[7]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
	}
}
