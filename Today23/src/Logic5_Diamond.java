
public class Logic5_Diamond {

	public static void main(String[] args)
	{
		System.out.println("Printing diamond diagram=>\n");
		
		for(int i=0 ; i<=4 ;i++)
		{
			for(int j= 0 ; j< 5 ; j++) {
				
				if((i==0 && j==2 )||(i==2 && j==0) || (i==4 && j==2) || (i==2 && j==4)
						)
				{
					System.out.print("*"+"\t");
					continue;
				}
				if(i==0 || j==0 || i==1 || j==1 ||i==2 ||j==2 ||i==3||j==3 || i==4||j==4)  {
					System.out.print(""+"\t");
					continue;
				}
				System.out.print(""+i+j   +"\t");//5X5 matrix view
				
			}
			System.out.println("\n");
		}
		
	}// end of main
}//end of class
