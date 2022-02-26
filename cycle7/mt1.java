/*Write a Java program that implements a multi-threaded program which has three threads. First
thread generates a random integer every 1 second. If the value is even, second thread computes the
square of the number and prints. If the value is odd the third thread will print the value of cube of
the number.*/
import java.util.Random;
import java.util.Scanner;

class RandomNumberThread extends Thread 
{
	public void run() 
	{
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter how many numbers: ");
		int n = sc.nextInt();
		System.out.println("enter limit of numbers: ");
		int l = sc.nextInt();
		for (int i = 0; i < n; i++) 
		{
			int randomInteger = random.nextInt(l);
			System.out.println("Random Integer generated : " + randomInteger);
			if((randomInteger%2) == 0) 
			{
				SquareThread sThread = new SquareThread(randomInteger);
				sThread.start();
			}
			else
			{
				CubeThread cThread = new CubeThread(randomInteger);
				cThread.start();
			}
			try 
			{
				Thread.sleep(1000);
			} 
			catch (InterruptedException ex)
			{
				System.out.println(ex);
			}
			
		}
	}

}
class SquareThread extends Thread {
	int number;

	SquareThread(int randomNumbern) {
		number = randomNumbern;
	}

	public void run() {
		System.out.println("Square of " + number + " = " + (number * number));
	}
}

class CubeThread extends Thread {
	int number;

	CubeThread(int randomNumber) {
		number = randomNumber;
	}

	public void run() {
		System.out.println("Cube of " + number + " = " + number * number * number);
	}
}

public class mt1 {
	public static void main(String args[]) {
		RandomNumberThread rnThread = new RandomNumberThread();
		rnThread.start();
	}
}
