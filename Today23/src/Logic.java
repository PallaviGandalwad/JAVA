
public class Logic {
	public static void main(String[] args)
	{
		System.out.println("4x4 matrix square printing =>\n");
		 for(int i=0 ; i<=3 ; i++) {
			 
			 for (int j=0 ; j<=3 ;j++) {
				
				 //if(i==3 && i==0 || j==0 && j==3 )
				 if(i==0 || i==3 || j==0 || j==3)
				 {
					 System.out.print("$"+"\t");
					 continue;
					 //break;
				 }
				 if(i==1 || i==2) 
				 {
				 System.out.print(""+"\t");
				 continue;
				 }
				 System.out.print(i+""+j +"\t");
			 }
			 
				 System.out.println("\n\n");
		 }
	
		
	}

}
