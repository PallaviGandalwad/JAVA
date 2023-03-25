public class Test
{
	public static void main(String[] arg) {
		
		System.out.println("Practicing Local variable examples ");
		
		//System.out.println("print var3 value====>>"  +   var3);//output=>var3 cannot be resolved to a variable
		
		//System.out.println("print var1==>"  +  var1 );Suggestion/output=>var1 cannot be resolved to a variable
		// local variables practicing 
		int var1= 10;
		
		System.out.println("print var1==>>"  +  var1);
		
	    System.out.println("========================================================");

		
		int var2=20;
		 
		System.out.println("print var1 value is "+var1);
		
		System.out.println("print var2 value is "  +var2);
		
		System.out.println("print both var1 and var 2 is"+var1+var2);
		
		System.out.println("print var 1 and var2 values  are "   +var1      +var2);
		
		System.out.println("print var1 & var2 values are "        +var1   +var2);
	
	    System.out.println("print var1 and var2 values as -->>BUT THIS IS WRONG "+var2     +var1);
	
	    int var3=var2;
	    
	    System.out.println("========================================================");

	    
	    System.out.println("print var3---->>"    +    var3);
	    
	    int var4=var1;
	    
	    System.out.println("========================================================");

	    
	    System.out.println("print var4--->"   +   var4);
	    
	    System.out.println("========================================================");
	    
	    System.out.println("print var4---->>>>>>>>"+var4);
	        
	
	
	}
	
	
	
	
}