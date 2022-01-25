import java.util.*;
public class suma
{public static void main(String[] args) 
	{
	   int n,i,s=0;
	   Scanner num = new Scanner(System.in);
	   int a[] = new int[50];
		System.out.println("enter number of elements: ");
		n = num.nextInt();
		System.out.println("enter elements of the array: ");
		for(i=0;i<n;i++)
		{
		   a[i]=num.nextInt();
		}
        for(i=0;i<n;i++)
		{
		   s=s+a[i];
		}
	   System.out.println("sum is: "+s);
	}
}


