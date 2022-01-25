import java.util.*;
public class trace
{public static void main(String[] args) 
    {
        int r,c, i,j,trace=0;
        Scanner num = new Scanner(System.in);
        int a[][] = new int[50][50];
        System.out.println("CONDITION: Equal number of rows and columns are needed to find trace of the matrix");
        System.out.println("enter no of rows in the array: ");
        r = num.nextInt();
        System.out.println("enter no of columns in the array: ");
        c = num.nextInt();
        if(r==c)
        {
            System.out.println("enter of elements of the array: ");
            for(i=0;i<r;i++)
            {
                for(j=0;j<c;j++)
                {
                    a[i][j]=num.nextInt();
                }
            }
            for(i=0;i<r;i++)
            {
                for(j=0;j<c;j++)
                {
                    if(i==j)
                    {
                        trace = trace + a[i][j];
                    }
                }
            }
            System.out.println("Trace of the matrix is: "+trace);
        }
        else
        {
            System.out.println("Not a square matrix");
        }       
    }
}
