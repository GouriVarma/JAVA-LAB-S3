/*Program to create a student class with name, roll no and marks of five
subjects. Write functions to read and display the details.*/
import java.util.*;

class student
{

 void Read()
 {
  Scanner sc=new Scanner(System.in);
  student s=new student();
  int rollno;
  String name;
  int marks[]=new int[5];
  
  System.out.println("Enter the name:");
  name=sc.nextLine();
  
  System.out.println("Enter rollno:");
  rollno=sc.nextInt();
  
  for(int i=0;i<5;i++)
  {
   System.out.println("Enter marks of Sub"+(i+1));
   marks[i]=sc.nextInt();
  }
  s.Display(name,rollno,marks);
 }
 
 void Display(String name,int rollno,int marks[])
 {
  System.out.println("Name is:"+name);
  System.out.println("Rollno is:"+rollno);
  
  for(int i=0;i<5;i++)
  {
   System.out.println("Marks of Sub"+(i+1)+" is "+marks[i]);
  }
 }
   
 public static void main(String args[])
 {
  student s1=new student();
  
  s1.Read();
 }
}
