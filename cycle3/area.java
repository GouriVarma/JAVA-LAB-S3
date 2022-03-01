/*Write a Java program to calculate the area of different shapes namely
circle, rectangle, and triangle using the concept of method overloading.*/
import java.util.*;
class area {
    public static void main(String args[])
    {
       System.out.println("AREA CALCULATOR(Circle,Rectangle,Triangle)");
       Scanner sc = new Scanner(System.in);
       area obj = new area();
       System.out.println("Enter radius of the circle: ");
       double r = sc.nextInt();
       obj.method(r);
       System.out.println("Enter length and breadth of rectangle: ");
       int l = sc.nextInt();
       int b = sc.nextInt();
       obj.method(l,b);
       System.out.println("Enter base length and height of triangle: ");
       float bl = sc.nextInt();
       float h = sc.nextInt();
       obj.method(bl,h);
    }
    void method(double r)
    {
        float areac = (float) (3.14*r*r);
        System.out.println("Area of the circle is: "+areac);
    }
    void method(int l,int b)
    {
        int arear = l*b;
        System.out.println("Area of the rectangle is: "+arear);
    }
    void method(float bl,float h)
    {
        double areac = 0.5*bl*h;
        System.out.println("Area of the triangle is: "+areac);
    }
}
