/*
 * Problem Statement:
 *   1) show two string buffer object on basic of contents.
 */
public class Task_1 {
	
	public static void main(String[] args)
	{
		StringBuffer p1 = new StringBuffer("Pallavi");
		System.out.println("1st bucket name :"+p1);
		
		p1.append("Gandalwad");
		System.out.println("2nd bucket name :"+p1);
		System.out.println("==================================");
		
		
		StringBuffer p2 = new StringBuffer("Balaji");
		System.out.println("1st bucket name :"+p2);
		p2.append(" _");
		System.out.println("2nd bucket name :"+p2);
		p2.append("Pamalwad");
		System.out.println("3rd bucket name :"+p2);
		
		
			 
	}

}
