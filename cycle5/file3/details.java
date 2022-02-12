/*Write a java program that writes your name and address into a file with help of file writer
class and read the contents from file and display in the console using appropriate reader class.*/

import java.io.*;
import java.util.*;
class details
{
  public static void main(String[] args) throws Exception
   {
try
{
Scanner sc = new Scanner(System.in);
FileWriter fw = new FileWriter("d.txt");
System.out.println("Enter your name:");
String name = sc.nextLine();
System.out.println("Enter your Address:");
String address = sc.nextLine();
fw.write(name + "\n");
fw.write(address);
fw.close();
FileReader fr = new FileReader("d.txt");
int ch;
while((ch = fr.read()) != -1)
{
System.out.print((char)ch);
}
fr.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}
