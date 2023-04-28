
public class Test implements Cloneable{
	
	int i=10;
	int j=20;
	
	public static void main(String[] args) throws CloneNotSupportedException{
		System.out.println("The main purpose of clonning is to maintain backup copy \n and to preserve state of an object.");
		Test t1= new Test();
		System.out.println(t1.i+"--Before Clonning-----"+t1.j);
		//Test t2= t1;  //sir creating duplicate referance variable is not clonning.
		// Test t2= t1.clone();
//		System.out.println("Exception in thread \"main\" java.lang.Error: Unresolved compilation problem: \r\n" + 
//				"	Type mismatch: cannot convert from Object to Test\r\n" + 
//				"\r\n" + 
//				"	at Test.main(Test.java:12)\r\n" + 
//				"");
//		
		//Test t2 = (Test)t1.clone();//so compulsory we need to do type casting and throws the exception
//		System.out.println("Exception in thread \"main\" java.lang.Error: Unresolved compilation problem: \r\n" + 
//				"	Unhandled exception type CloneNotSupportedException\r\n" + 
//				"\r\n" + 
//				"	at Test.main(Test.java:19)\r\n" + 
//				"");
//		
		//Test t2=(Test)t1.clone();//we get runtime exception make sure implements  clonable should be there  
//		System.out.println("Exception in thread \"main\" java.lang.CloneNotSupportedException: Test\r\n" + 
//				"	at java.lang.Object.clone(Native Method)\r\n" + 
//				"	at Test.main(Test.java:26)");
		Test t2=(Test)t1.clone();
		t2.i =111;
		t2.j =999;
		
		System.out.println(t1.i+"---After Clonning----"+t1.j);
	}

}
