import java.util.*;
public class add { 
    public static void main(String args[])
    {
        int a,b,sum;
        Scanner o = new Scanner(System.in);
        System.out.println("enter two numbers: ");
        a = o.nextInt();
        b = o.nextInt();
        sum = a+b;
        System.out.println("the sum of "+a+" and "+b+" is "+sum);
    }
}
