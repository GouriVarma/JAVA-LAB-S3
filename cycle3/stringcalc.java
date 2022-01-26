/*Create a class with functions to find the frequency of a given character
in a string and to reverse a given string. The functions should be invoked
from the main().*/
import java.util.*;

class stringcalc
{
 public static void main(String args[])
 {
    stringcalc c=new stringcalc();
    Scanner obj=new Scanner(System.in);
    int i,len;
    System.out.println("Enter the string");
    String str=obj.nextLine();
    len=str.length();
    char a[]=new char[len];
    for(i=0;i<len;i++)
    {
        a[i]=str.charAt(i);
    }
    System.out.println("Enter the item whose frequency is needed:");
    char ch = obj.next().charAt(0);
   
    c.frequency(str,ch);
    c.reverse(str);
 }

void frequency(String str, char ch )
{
    int count =0,i;
    for(i=0;i<str.length();i++)
    {
        if(str.charAt(i)==ch)
        {
            count++;
        }
    }
        System.out.println("Frequency of "+ch+" in "+str+" is:"+count);
}
void reverse(String str)
{
    int n=str.length();
    String rev ="";
    for(int i=0;i<n;i++)
    {
        rev = rev + str.charAt(n-1-i);
    }
    System.out.println("Reversed string is: "+rev);
}
}
