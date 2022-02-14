/*Write a Java program that reads a line of integers from a file, and then displays each integer,
and the sum of all the integers (Use String Tokenizer class of java.util).*/

import java.io.*;
import java.util.*;
class prog4
{
    public static void main(String[] args) throws Exception
    {
	try
	{
    FileInputStream fin = new FileInputStream("int1.txt");
    int ch;
	String a;int sum=0;
	System.out.println("The Numbers in the file are : ");
	while( (ch = fin.read())!=-1 )  
    {
		String s=Character.toString((char)ch);
		StringTokenizer st = new StringTokenizer(s);
		while( st.hasMoreTokens()) 
		{
			a = st.nextToken();
			int b = Integer.parseInt(a);
			System.out.println(b);
			sum = sum + b; 
		}
	}
	
	System.out.println("The sum is " + sum);
	}
	catch(Exception e) {System.out.print(e);}
	}

}
