/*A Program for taking employee,officer and manager details from the user and displaying it ,using the concept of inheritance in java*/
import java.util.*;
class employee 
{
    String Name,Address,Phnno,Salary;;
    int Age;
   

    void print_salary()
    {
        System.out.println("Salary is: "+Salary);
    }
    

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        employee e = new employee();
        System.out.println("Enter Employee details: ");
        e.inputs();
        Officer o = new Officer();
        Manager m = new Manager();
        System.out.println("\nEnter Officer details: ");
        o.inputs();
        System.out.println("Enter specialization");
        o.specialization = sc.next();
        System.out.println("\nEnter Manager details: ");
        m.inputs();
        System.out.println("Enter department");
        m.department = sc.next();
        System.out.println("\nDisplaying employee details");
        e.display();
        e.print_salary();
        System.out.println("\nDisplaying officer details");
        o.display();
        o.print_salary();
        System.out.println("\nDisplaying manager details");
        m.display();
        m.print_salary();

    }
    
    void inputs()
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter name: ");
        Name = sc.nextLine();
        System.out.println("Enter address: ");
        Address = sc.nextLine();
        System.out.println("Enter age: ");
        Age = sc.nextInt();
        System.out.println("Enter phone number: ");
        Phnno = sc.next();
        System.out.println("Enter salary: ");
        Salary = sc.next();
    }
    void display()
    {
        System.out.println("Name: "+Name+"\nAddress: "+Address+"\nPhnno: "+Phnno+"\nAge: "+Age);
    }
}
class Officer extends employee
{
    public String specialization;
}
class Manager extends employee
{
    public String department;
}
