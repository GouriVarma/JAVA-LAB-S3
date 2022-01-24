import java.util.Scanner;
public class armstrong{
    public static void main(String args[])
    {
        int n,i,sum=0,digit=0,rem ;
        Scanner o = new Scanner(System.in);
        System.out.println("enter number : ");
        n = o.nextInt();
        int n1 = n;
        while(n>0)
        {
            n=n/10;
            digit =digit+ 1;
        }
        n=n1;
        while(n1>0)
        {
            int mult = 1;
            rem = n1%10;
            for(i=0;i<digit;i++)
            {
                mult = mult*rem;      
            }
            n1 = n1/10;
            sum = sum + mult;
        }
        if(sum==n)
            System.out.println(+n+" is an armstrong number");
        else
            System.out.println(+n+" is not an armstrong number");
    }
}
