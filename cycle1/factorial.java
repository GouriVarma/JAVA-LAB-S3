import java.util.Scanner;
public class factorial{
    public static void main(String args[])
    {
        int num,i,fact=1;
        Scanner o = new Scanner(System.in);
        System.out.println("enter the number : ");
        num = o.nextInt();
        for(i=1;i<=num;i++)
        {
            fact *= i;
        }
        System.out.println(+num+"! is: "+fact);
    }
}
