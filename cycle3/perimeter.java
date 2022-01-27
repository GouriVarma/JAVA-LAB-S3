/*Write a Java program to calculate the perimeter of different shapes
namely circle and rectangle using the concept of constructor
overloading.*/
import java.util.Scanner;
class perimeter
{
        perimeter(float r)
        {
            float peric = (float) (2*3.142*r);
            System.out.println("Perimeter of the circle is: "+peric);
        }
        
        perimeter(float l,float b)
        {
            float perir =(float) (2*(l+b));
            System.out.println("Perimeter of the rectangle is: "+perir);
        }
    
    public static void main(String[] args) 
    { 
       System.out.println("PERIMETER CALCULATOR(Circle and Rectangle)");
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter radius of the circle: ");
       float r = sc.nextInt();
       perimeter obj = new perimeter(r);
       System.out.println("Enter length and breadth of rectangle: ");
       float l = sc.nextInt();
       float b = sc.nextInt();
        obj = new perimeter(l,b);
    }
}
