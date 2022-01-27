/*Java program to concatenate two numbers and strings using method
overloading concept.*/
import java.util.*;
class concatenate {
    public static void main(String args[])
    {
       System.out.println("SIMPLE CONCATENATING PROGRAM(numbers and strings)");
       Scanner sc = new Scanner(System.in);
       concatenate obj = new concatenate();
       System.out.println("enter first number: ");
       int num1 = sc.nextInt();
       System.out.println("enter second number: ");
       int num2 = sc.nextInt();
       obj.method(num1,num2);
       System.out.println("Enter first word: ");
       String w1 = sc.next();
       System.out.println("Enter second word: ");
       String w2 = sc.next();
       obj.method(w1,w2);
    }
      
    void method(int num1,int num2)
    {
        System.out.println("Concatenated number is: "+num1+num2);
    }
    void method(String w1,String w2)
    {
        System.out.println("Concatenated string is: "+w1+w2);
    }
}
