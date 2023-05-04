//Multithreading Program by extends Thread class.

package com.dailyStudentWork;
 
public class StudentWork extends Thread {
	
	static void Reading()
	{
		for(int i=1 ; i<=25 ; i++)
		{
			System.out.println("1st task: Balaji is reading.");
		}
	}
	
	static void keepCharge()
	{
		for(int i=1 ; i<=25 ; i++)
		{
			System.out.println("2nd task: Balaji is charging his phone while reading a book.");
		}
	}
	
	static void PYQ()
	{
		for(int i=1 ; i<=25 ; i++)
		{
			System.out.println("3rd task: After completing reading , Balaji is solving Previous Year Questions ");
		}
	}
	
	static void Going_Outside()
	{
		for(int i=1; i<=25 ;i++)
		{
			System.out.println("4th task: Balaji mom calling him to go outside and bring some CORIANDER and some VEGITABLES .");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("---------Boy's Daily work------------\n"+"Boy Name: Balaji\n");
		System.out.println("Multithreading Program by extends java.lang. Thread class.\n");
		
		StudentWork s1 = new StudentWork();	
		
		s1.start();
		
		s1.Going_Outside();		
		}
	
	public void run()
	{
		PYQ();
		Reading();
		keepCharge();	
	}
	
	

}
