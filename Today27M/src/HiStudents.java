
public class HiStudents implements Cloneable {
	int Sr_no=1;
	String FirstName="Pallavi";
	String Gender="Female";
	
	 
	public static void main(String[] args) throws CloneNotSupportedException
	{
		HiStudents h1 = new HiStudents( );
		
		System.out.println("Before clonning: "+h1.Sr_no+"----"+h1.FirstName+"-----"+h1.Gender);

		
		//HiStudents h2 = h1;//sir creating duplicate referance variable is not clonning.
		
		HiStudents h2=(HiStudents)h1.clone();
		
		h2.FirstName="Balaji";
		h2.Gender="Male";
		h2.Sr_no=10;
		
		System.out.println("After clonning: "+h1.Sr_no+"----"+h1.FirstName+"-----"+h1.Gender);
		
		System.out.println("This is by default shallow copy(shallow clonning)");
	}
	
}
