
public class StringLiteral {
	
	public static void main(String[] args)
{
	String name= "balaji";
	// string name$='pallavi';//Invalid character constant
	
	
	//String name$$= 'pallavi';//Invalid character constant
	
	String name$$= "pallavi";
	System.out.println("string value name$$=>"  +name$$);
	
	System.out.println("==================================================================");
	
	System.out.println("string value =>"  +name );
}
	

}
