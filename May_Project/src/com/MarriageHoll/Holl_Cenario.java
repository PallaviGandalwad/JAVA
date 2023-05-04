//multithreading by implements java.lang.Runnable interface
package com.MarriageHoll;

public class Holl_Cenario implements Runnable {
	int i;
	  
	
	void Chair_Arrengement()
	{
		for(i=1 ; i<= 20;i++)
		{
			System.out.println(+i+"  "+"Chair Arrengment done");
		}
	}
	
	void Sound()
	{
		for(i=1 ; i<= 20;i++)
		{  
			System.out.println(i+"  "+"****South music started*****");
		}
	}
	
	void Pandit()
	{
		for(i=1 ; i<= 20;i++)
		{
			System.out.println(+i+"  "+"Pandit speaking in Sanskrit for marriage matra");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("multithreading by implements java.lang.Runnable interface\n");
//		new Holl_Cenario().Chair_Arrengement();
//		new Holl_Cenario().Sound();
//		new Holl_Cenario().Pandit();
		
		Holl_Cenario h1 = new Holl_Cenario();//created new runnable target as h1.
		Thread t1 = new Thread(h1);//created new thread t1.
		t1.start();
		
		h1.Sound();
			
	}
	public void run() {  
		Chair_Arrengement();
		Pandit();
	}

}
