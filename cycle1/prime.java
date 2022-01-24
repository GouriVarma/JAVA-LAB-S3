import java.util.Scanner;
public class prime {
    public static void main(String args[])
    {
        int flag = 1;
        Scanner o = new Scanner(System.in);
        System.out.println("enter a number: ");
        int num = o.nextInt();
        if(num==0 || num==1)
        {
            System.out.println(+num+" is not a prime number");
        }
        else
        {
            for(int i=2;i<num/2;i++)
            {
                if(num%i==0)
                {
                    flag = 0;
                    break;
                }
            }
            if(flag==0)
            {
                System.out.println(+num+" is not a prime number");
            }
            else
            {
                System.out.println(+num+" is a prime number");
            }
        }
    }  
}
