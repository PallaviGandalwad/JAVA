package com.SunMicro.java.dataType;

public class DataType {
	//Primitive->numeric->whole numbers-> data type
	byte memory_cell;
	short cell;
	int fees;
	long company_erning;
	
	//primitive->numeric->fraction numbers->data type
	float pi;
	double percentage;
	double weight;
	
	char value='B';
	
	boolean situation;
	
	
	
	public static void main(String[] args) {
		
		DataType d1 = new DataType();
		d1.memory_cell= 127;
		d1.cell=128;
		d1.fees=9900000;
		d1.company_erning=1234567890;
		d1.percentage=96.78;
		d1.weight=99.99;
		d1.pi=(float)33.26;
		d1.situation=true;
		
		DataType d2=new DataType();
		System.out.println("=====Assigning values ======");
		System.out.println("memory cell ="+d1.memory_cell);
		System.out.println("cell ="+d1.cell);
		System.out.println("fees ="+d1.fees);
		System.out.println("company_erning="+d1.company_erning);
		System.out.println("Percentage ="+d1.percentage );
		System.out.println("Weight ="+d1.weight);
		System.out.println("Situation="+d1.situation);
		System.out.println("Pi="+d1.pi +"\n");
		
		System.out.println("=====Default value of datatype=====");
		System.out.println("byte->"+"memory cell ="+d2.memory_cell);
		System.out.println("short->"+"cell ="+d2.cell);
		System.out.println("int->"+"fees ="+d2.fees);
		System.out.println("long"+"company_erning="+d2.company_erning);
		System.out.println("Double->"+"Percentage ="+d2.percentage );
		System.out.println("Double->"+"Weight ="+d2.weight);
		System.out.println("boolean->"+"Situation="+d2.situation);
		System.out.println("float->"+"Pi="+d2.pi );
	}
	

}
