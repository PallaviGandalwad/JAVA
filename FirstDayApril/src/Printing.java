/*my first program
 * problem statement: printing the statement and sum of two number by user .
 * 
 */
import java.util.*;
public class Printing {
	//this is the class 
	
	//variables
	//methods
	static void print3()
	{
		System.out.println("Go to print2 method");
	}
	
	public static void main(String[] args)
	{
		System.out.println("this is instruction 1");
		System.out.println("this is instruction 2");
		System.out.println("this is instruction 3");
		
		//print1();//Cannot make a static reference to the non-static method print1() from the type Printing
		print1();
		System.out.println("this is instruction 4");
		System.out.println("this is instruction 5");
		System.out.println("this is instruction 6");
		print3();
		System.out.println("main method is the strting point");
		print2();
		
		
	}
	
	static void print1()
	{
		int a,b,c;
		
		Scanner s1= new Scanner(System.in);
		a=s1.nextInt();
		b=s1.nextInt();
		System.out.println("you entered a value:"+a);
		
		System.out.println("you entered b value:"+b);
		c=a+b;
		System.out.println("sum:"+c);
	}
	
	 
	static void print2()
	{
		System.out.println("this print2 method is called");
	}
	
	

}
