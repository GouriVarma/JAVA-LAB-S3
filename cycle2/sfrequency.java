import java.util.*;
class sfrequency
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        int i,count=0,len;
        System.out.println("Enter a string(word):");
        String str=obj.nextLine();
        len=str.length();
        char a[]=new char[len+1];
        for(i=0;i<len;i++)
        {
            a[i]=str.charAt(i);
        }
        System.out.println("Enter the item whose frequency is needed:");
        char ch = obj.next().charAt(0);
        for(i=0;i<len;i++)
        {
            if(a[i]==ch)
            {
                count++;
            }
        }
        System.out.println("Frequency of "+ch+" in "+str+" is:"+count);
    }
}
