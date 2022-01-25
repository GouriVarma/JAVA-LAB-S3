import java.util.*;
class multiply{
  public static void main(String args[])
  {
    Scanner in =  new Scanner(System.in);
    int r1,c1,r2,c2,i,j,sum=0;
    //intializing arrays
    int a[][] = new int[50][50];//first matrix
    int b[][] = new int[50][50];//second matrix
    int m[][] = new int[50][50];//product matrix
    System.out.println("This is a program to multiply two matrices");
    System.out.println("Condition: NO of columns in first matrix should be equal to NO of rows in second matrix");
    System.out.println("enter number of rows and columns in the first matrix: ");
    r1 = in.nextInt();
    c1 = in.nextInt();
    System.out.println("enter the elements of the first matrix(row wise)");
    for(i=0;i<r1;i++)
    {
      for(j=0;j<c1;j++)
      {
        a[i][j] =in.nextInt(); 
      }
    }
    System.out.println("enter number of rows and columns in the second matrix: ");
    r2 = in.nextInt();
    c2 = in.nextInt();
    //conditon for multiplication of matrices
    if(c1!=r2)
    {
      System.out.println("Sorry,multiplication not possible");
      System.exit(0);
    }
    System.out.println("enter the elements of the second matrix(row wise)");
    for(i=0;i<r2;i++)
    {
      for(j=0;j<c2;j++)
      {
        b[i][j] =in.nextInt(); 
      }
    }
    //multiplying..
    for(i=0;i<r1;i++)
    {
      for(j=0;j<c2;j++)
      {
        for(int k=0;k<c1;k++)
        {
          sum =sum +a[i][k]*b[k][j];
        }
        m[i][j]=sum;
        sum =0;
      }
    }
    //printing multiplied matrix
    System.out.println("product of the two matrices is: ");
    for(i=0;i<r1;i++)
    {
      System.out.println("\n");
      for(j=0;j<c2;j++)
          System.out.print("\t" +m[i][j]);
    }     
  }
}
