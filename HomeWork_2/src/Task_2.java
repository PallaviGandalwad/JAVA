/*
 * Problem statement :
 * 2) Take array of integers 1 to 40 , 
 *    and separate out on another array only square number 
 *    like 1,4,9,25.......
 * 
 */
public class Task_2 {
	
	public static void main(String[] args)
	{
		 
		int array []= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,
				21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40};
		System.out.println("Array size:"+array.length);
		System.out.println("square number from given array of integer 1 to 40:");

		for(int i=0; i<array.length;i++)
		{
		  if(Math.sqrt(array[i])==Math.floor(Math.sqrt(array[i])))
		  {
			  System.out.println(+array[i]);
		  }
		}	
		
	}

}
