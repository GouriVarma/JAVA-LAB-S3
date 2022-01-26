import java.util.*;
class sreplace
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int i,len;
        System.out.println("Enter the string");
        String str=obj.nextLine();
        len=str.length();
        char a[]=new char[len];
        for(i=0;i<len;i++)
        a[i]=str.charAt(i);
        System.out.println("Enter character to be replaced");
        char ch=obj.next().charAt(0);
        System.out.println("Enter new character");
        char ch1=obj.next().charAt(0);
        System.out.print("New String is: ");
        for(i=0;i<len;i++)
        {
          if(a[i]==ch)
           a[i]=ch1;
           System.out.print(a[i]);
        }
    }
}
