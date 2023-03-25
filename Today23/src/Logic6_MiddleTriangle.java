
public class Logic6_MiddleTriangle {
public static void main(String[] args) {
	System.out.println("printing middle triangle=>\n");
	for(int i=0 ; i<3 ;i++)
	{
		for(int j=0 ; j<=4 ;j++)
		{
			if(i==2 || (i==0 && j==2) || (i==1 && j==1) || (i==1 && j==3))
			{
				System.out.print("*"+"\t");//middle triangle printed
				continue;
			}
			if(i==0||(i==1&& j==2)||(i==1&& j==4)||j==0)
			{
				System.out.print(""+"\t");//skipped outer and inner part of middle triangle
				continue;
			}
			System.out.print(""+i+j+"\t");//3x5 matrix view 
		}
		
		System.out.println("\n");
	}
	
	
	
}//end of main
}//end of class
