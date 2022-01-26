/*Program with functions included within the main() class to find factorial
and sum of digits of the number.*/
import java.util.*;

class calculation
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  calculation c=new calculation();
  
  int n;
  System.out.println("Enter the number:");
  n=sc.nextInt();
  
  c.Factorial(n);
  c.Sum(n);
 }
 
void Factorial(int n)
 {
    int fact=1;
    for(int i=1;i<=n;i++)
    {
        fact*=i;
    }
    System.out.println("The factorial is:"+fact);
 }
 
 void Sum(int n)
 {
  int s=0,digit;
  while(n!=0)
  {
    digit=n%10;
    s+=digit;
    n/=10;
  }
  System.out.println("The sum of digits is:"+s);
 }
}
