/**
 * 
 */
/**
 * @author hp
 *
 */
package com.java.sample;

class sample{
	
	public static void main(String[] args) {
		
	for(int i =1; i<=4 ;i++)
	{
		for(int j=1 ;j<=4 ; j++)
		{
			if(j=1) {//Type mismatch: cannot convert from int to boolean
			System.out.println("@");	
			break;
				
			}
			System.out.print("A"+i+j +"\t");
			continue;
		}
		
		System.out.print("\n");
	}
			
	}
	
}