package ThreadDemo;

import java.util.Scanner;
/**
 * 
 * @author Vishwas
 * In here creating a Runnable class by Implementing
 * than implementing run method to create a class
 *
 */

class MyPrime implements Runnable{

	
	public void run() {
		// declaring variables
		int temp;
		boolean isPrime=true;
		// taking input from the user
		Scanner scan= new Scanner(System.in);
		//window console
		System.out.println("Enter a number for check:");
		//capture the input in an integer
		int num=scan.nextInt();
		
		for(int i=2;i<=num/2;i++)
		{
	           temp=num%i;
		   if(temp==0)
		   {
		      isPrime=false;
		      break;
		   }
		}
		//If isPrime is true then the number is prime else not
		if(isPrime)
		   System.out.println(num + " is Prime Number");
		else
		   System.out.println(num + " is not Prime Number");
	   }
		
	}
	
public class PrimeNumber {
	//main method
	public static void main(String[] args) {
		/**
		 * creating thread
		 * and inside the thread constructor MyPrime method
		 * and calling start method to create thread 
		 * which will run method automatically
		 * 
		 */
			Thread thread= new Thread(new MyPrime());
			thread.start();
			
		}
	}

