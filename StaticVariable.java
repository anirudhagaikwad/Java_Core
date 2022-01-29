
public class StaticVariable {

	int count=0; // get memory each time when instance is created 
	static int counts=0; // get memory once
	
	
	StaticVariable() // Non-Parameterized Constructor
	{
		count++; // increment counter
		System.out.println("instance count = "+count);
	} // end constructor
	
	
	StaticVariable(String s) // Parameterized Constructor
	{
		counts++; // increment counter
		System.out.println("static counts = "+counts);
		
	} 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVariable obj=new StaticVariable();
		StaticVariable obj1=new StaticVariable();
		StaticVariable obj2=new StaticVariable();
		
		StaticVariable objStatic=new StaticVariable("hi");
		StaticVariable obj1Static=new StaticVariable("hello");
		StaticVariable obj2Static=new StaticVariable("yes");

	} // end main()

} // end class StaticVariable
