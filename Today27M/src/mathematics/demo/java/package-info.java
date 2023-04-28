/**
 * 
 */
/**
 * @author hp
 *
 */
package mathematics.demo.java;

class Hello
{
	public static void main(String[] args) 
	{
		System.out.println("Main method Started\n");
//calling different methods in Hello class ,
//by another class name as Basic_Maths .
		Basic_Maths.addition(100,100);
		Basic_Maths.substraction(100,100);
		Basic_Maths.divistion(100,100);
		Basic_Maths.multiplication(100,100);
	
		System.out.println("\nMain method completed");	
		
	}
}