import java.util.*;
public class replace
{public static void main(String[] args) 
	{
	   int n,i,r,R;
	   Scanner num = new Scanner(System.in);
	   int a[] = new int[50];
		System.out.println("enter number of elements: ");
		n = num.nextInt();
		System.out.println("enter elements of the array: ");
		for(i=0;i<n;i++)
		{
		   a[i]=num.nextInt();
		}
	   System.out.println("enter the index of number to be replaced: ");
		r = num.nextInt();
		System.out.println("enter the number for replacement: ");
		R = num.nextInt();
		a[r]=R;
		System.out.println("new array is:");
	   for(i=0;i<n;i++)
	   {
	      System.out.println(a[i]);   
	   }
	}
}
