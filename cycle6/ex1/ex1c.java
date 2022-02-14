/*Write a program that demonstrates exception handling mechanism.
(c ) File not found exception*/

import java.io.*;
public class ex1c
{
	public static void main(String[] args) throws Exception
	{
		try
		{
			FileInputStream fin = new FileInputStream("e.txt");
			int i;
			while((i=fin.read())!=-1)
				System.out.println((char)i);
			fin.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e);
		}
	}
}
