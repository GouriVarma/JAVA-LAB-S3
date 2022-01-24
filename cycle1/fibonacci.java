import java.util.Scanner;
public class fibonacci{
    public static void main(String args[])
    {
        int n, firstn=0, secn=1 , i=0 , thirdn=0 ;
        Scanner o = new Scanner(System.in);
        System.out.println("enter number : ");
        n = o.nextInt();
        System.out.println("fibonacci series upto first "+n+" numbers is: ");
        for(i=0;i<n;i++)
        {
            System.out.println(+firstn);
            thirdn = firstn + secn;
            firstn = secn;
            secn = thirdn;
        }
        
    }
}
