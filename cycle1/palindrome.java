import java.util.Scanner;
public class palindrome{
    public static void main(String args[])
    {
        int n,d=0,i,rem ;
        Scanner o = new Scanner(System.in);
        System.out.println("enter number : ");
        n = o.nextInt();
        int n1=n;
        while(n>0)
        {
            rem = n%10;
            d = d*10+rem;
            n = n/10;
        }
        if(d==n1)
        {
            System.out.println(+n1+" is a palindrome number");
        }
        else
        {
            System.out.println(+n1+" is not a palindrome number");
        }
    }
}
