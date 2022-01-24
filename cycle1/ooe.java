import java.util.Scanner;
public class ooe {
    public static void main(String args[])
    {
        Scanner o = new Scanner(System.in);
        System.out.println("enter a number: ");
        int num = o.nextInt();
        if(num%2==0)
        {
            System.out.println(+num+" is even");
        }
        else
        {
            System.out.println(+num+" is odd");
        }
    }  
}
