
public class Logic3_Triangle {
	public static void main(String[] args)
	{
		System.out.println("printing Triangle=>\n");
		
		for(int i=0 ; i< 4 ; i++)
		{
			for(int j=0 ; j< 4 ;j++)
			{
				if(j==0 || i==j  || i==3)
				{
					System.out.print("*"+"\t");
					continue;
				}
				if(i>j) {
					System.out.print(""+"\t");//skip inner part of triangle
					continue;
					
				}
				if(i<j || i<3 )
				{
				System.out.println(""+"");//skiped outer part of triangle
				 continue;
				}
				System.out.print(""+i+j+"\t");
			}
			System.out.println("\n");
		}
		
		
		
	}
	

}
