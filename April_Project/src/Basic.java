
public class Basic {
	int roll_num;
	static String college ="Pune Institute Of Computer Technology Pune";
	
	static void Display()
	{
		System.out.println("Display Student Information");
		
	}
	
	public static void main(String[] args) {
		 
		Basic.Display(); 
		
		Basic b1= new Basic();
		
		System.out.println("rollnumber  : "+b1.roll_num);
		System.out.println("college name :"+college);
		
		
		
	}

}
