/*Create a java program that enters the details of 10 students by creating a class student. The details
entered are Rollno, Name, Phone number, age and CGPA. Display the name of the student with the
highest CGPA. Display the phone number of the student whose name is ‘ANU’. Display the Rollno of
the youngest student in the class.*/
import java.util.*;

class student
{
	String name;
	int Rollno,age;
	long Phone_number;
	float CGPA;
	
	public static void main(String[] args)
	{
		int n = 10;
		student s[] = new student[n];
		int i;
		for(i=0; i<n; i++)
		{
			s[i] = new student();
			System.out.println("\n\nEnter the Details of Student "+(i+1));
			s[i].EnterDetails();
		}
		int c = 0;
		int a = 0;
		long ph=0;
		for(i=0; i<n; i++)
		{
			if(s[c].CGPA<s[i].CGPA)
					c = i;
			if(s[a].age > s[i].age)
					a=i;
			if(s[i].name.equalsIgnoreCase("ANU"))
					ph=s[i].Phone_number;
		}
		
			System.out.println("\nNAME OF STUDENT WITH HIGHEST MARK: "+s[c].name);
			
			System.out.println("\nRoll no of youngest: "+s[a].Rollno);
			
			System.out.println("\nAnu's phnno:"+ph);
	}
	void EnterDetails()
	{
		    Scanner sc = new Scanner(System.in);
			System.out.print("Enter the Roll Number : ");
			Rollno = sc.nextInt();
			System.out.print("Enter the Name : ");
			sc.nextLine();
			name = sc.nextLine();
			
			System.out.print("Enter the Phone Number : ");
			Phone_number = sc.nextLong();
			
			System.out.print("Enter the Age : ");
			age = sc.nextInt();
			
			System.out.print("Enter the CGPA : ");
			CGPA = sc.nextFloat();
		}
	}
