package ThreadClassDemo;

import java.util.Scanner;
/**
 * 
 * @author Vishwas
 * In here creating a thread class by extending Thread
 * than implementing run method to create a class
 *
 */
class MyClass extends Thread{
	
	public void run(){
		// declaring variables
		int temp;
		boolean isPrime=true;
		// taking input from the user
		Scanner scan= new Scanner(System.in);
		// window console
		System.out.println("Enter a number for check:");
		//capture the input in an integer
		int num=scan.nextInt();
		/**
		 * In here using for loop
		 */
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
// creating class
public class ThreadUse {
	// main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * creating object of MyClass
		 * and calling start method 
		 * to create thread 
		 */
		MyClass myclass= new MyClass();
		myclass.start();
		
	}

}

