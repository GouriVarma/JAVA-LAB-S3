import java.util.Scanner;
public class sumn{
    public static void main(String args[])
    {
        int sum=0,num,i=0;
        Scanner o = new Scanner(System.in);
        System.out.println("enter the number upto which you want sum: ");
        num = o.nextInt();
        for(i=0;i<=num;i++)
        {
            sum = sum +i;
        }
        System.out.println("sum of first "+num+" natural numbers are: "+sum);
    }
}
