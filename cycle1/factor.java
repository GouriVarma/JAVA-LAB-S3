import java.util.Scanner;
public class factor{
    public static void main(String args[])
    {
        int num,i=0;
        Scanner o = new Scanner(System.in);
        System.out.println("enter the number : ");
        num = o.nextInt();
        System.out.println("factors of "+num+" are: ");
        for(i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                System.out.println(+i);
            }
        }   
    }
}
