import java.util.*;
class stringsearch
{
    public static void main(String args[])
    {
            Scanner obj = new Scanner(System.in);
            int i,flag=0,len;
            System.out.println("Enter the string:");
            String str=obj.nextLine();
            len=str.length();
            char a[]=new char[len+1];
            for(i=0;i<len;i++)
            {
                a[i]=str.charAt(i);
            }
            System.out.println("Enter the search item:");
            char ch = obj.next().charAt(0);
            for(i=0;i<len;i++)
            {
                if(a[i]==ch)
                {
                    flag=1;
                    break;
                }
            }
        
        if(flag==1)
            System.out.println(ch+" is found in "+str+" at position:"+(i+1));
        else 
        System.out.println(ch+" Not found in "+str);
    }
    
}
