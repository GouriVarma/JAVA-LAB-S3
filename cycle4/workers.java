class Employee
{
  void display()
  {
    System.out.println("Name of class is Employee");
  }

  void calcSalary()
  {
    System.out.println("Salary of the employee is Rs 90000");
  }
}

class Engineer extends Employee
{
 void calcSalary()  
  {
    super.calcSalary();
    System.out.println("Salary of the engineer is Rs 300000");
  } 

}

class workers
{
    public static void main(String args[])
    {
        Engineer e = new Engineer();
        e.display();
        e.calcSalary();
    }
}
