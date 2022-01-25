import java.util.*;
public class smallest
{public static void main(String[] args) 
	{
        int n,i;
	    Scanner num = new Scanner(System.in);
	    int a[] = new int[50];
        System.out.println("enter number of elements: ");
	    n = num.nextInt();
		System.out.println("enter elements of the array: ");
		for(i=0;i<n;i++)
		{
		   a[i]=num.nextInt();
		}
        int small = a[0];
        for(i=0;i<n;i++)
		{
		   if(a[i]<small)
           {
               small = a[i];
           }
		}
	   System.out.println("smallest element is: "+small);
	}
}

