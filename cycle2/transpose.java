import java.util.*;
public class transpose
{public static void main(String[] args) 
    {
        int r,c, i,j;
        Scanner num = new Scanner(System.in);
        int a[][] = new int[50][50];
        System.out.println("enter no of rows in the array: ");
        r = num.nextInt();
        System.out.println("enter no of columns in the array: ");
        c = num.nextInt();
        System.out.println("enter of elements of the array: ");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
              a[i][j]=num.nextInt();
            }
        }
        System.out.println("Transpose of the matrix is: ");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                System.out.println(+a[j][i]);
            }
        }
    }
}
