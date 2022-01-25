import java.util.*;
class slarge
{public static void main(String[] args) 
    {
        int n, i,j,temp;
        Scanner num = new Scanner(System.in);
        int a[] = new int[50];
        System.out.println("enter no of elements in the array: ");
        n = num.nextInt();
        System.out.println("enter of elements of the array: ");
        for(i=0;i<n;i++)
        {
            a[i]=num.nextInt();
        }
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(a[i]>a[j])
                {
                  temp=a[i];
                  a[i]=a[j];
                  a[j]=temp;
                }
            }
        }
        System.out.println("the second largest element in the array is: "+a[n-2]);
    }
}
    
