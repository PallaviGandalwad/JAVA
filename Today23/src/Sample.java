import java.util.Scanner;

public class Sample {
	
	public static void main(String[] args)
	{
	 System.out.println("Switch case story");
	 
	 System.out.println("Pallavi enter the day you want ->");
	 
	 Scanner s = new Scanner(System.in);
	 System.out.println("//================================");
	 
	 
	 
	 String enter = s.nextLine();
	 
	 //System.out.println("you have Entered\t"+enter +"\tday");
	 
	 if(enter=="mon" && enter =="tue" && enter=="wen" && enter =="thu" &&
			 enter=="fri" && enter=="sat" && enter=="sun") 
	 {
		 
		 System.out.println("Invalid string-> X");
	 }
	 
	 System.out.println("//================================");
	 System.exit(0);
	 
	 switch(enter)
	 {
	 case "MON": final String enter1  = "MON";
		 System.out.println("GReennnn sareee on ->"+enter1);
	 break;
	 
	 case "TUE":final String enter2  = "THU";
		 System.out.println("PINKKKKK sareee "+enter2);
	 break;
	 
	 case "WEN":final String enter3  = "WEN";
		 System.out.println("GRAYYYYYY sareee "+enter3);
	 break;
	 
	 case "THU":final String enter4 = "THU";
		 System.out.println("WHITE sareee "+enter4);
	 break;
	 
	 case "FRI":final String enter5  = "FRI";
		 System.out.println("RED sareee "+enter5);
	 break;
	 
	 case "SAT":final String enter6  = "SAT";
		 System.out.println("BLACK sareee "+enter6);
	 break;
	 
	 case"SUN":final String enter7  = "SUN";
		 System.out.println("formal dress "+enter7);
	 break;
	 
	 default:System.out.println(" Any dress ");
	 System.out.println("Invalid Day");
	
	 
	 }
	 System.out.println("=====End OF switch case==== ");
	}
	

}
