/*Write program that creates a user defined exception when the balance in an account is less than
500*/

public class ex2
{
	public static void main(String[] args )
	{
		try{
			int b = 250;
			if(b<500)
				throw new balanceException();
		
		}
		catch(balanceException e)
		{
			System.out.println(e);
		}
	}
}

class balanceException extends Exception
{
	balanceException()
	{
		System.out.print("Low balance ");
	}
}
