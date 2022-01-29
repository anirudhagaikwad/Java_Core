
public class MethodJava {
/*
 * Syntax/Signature Method 
 * 
 *  accessModifier returnType methodName(parameter list)
 * 
 * - we can access instance variable inside instance method directly
 * - we can access static variable inside instance method directly
 * - we can call instance method inside instance method directly
 * - we can call static method inside instance method directly 
 * 
 * - we can access instance variable inside static method using object
 * - we can access static variable inside static method directly
 * - we can call instance method inside instance static using object
 * - we can call static method inside static method directly 
 * - static variable & Method access/call using ClassName inside instance method and static method
 */
	
	
	
// Instance Variable
	int i=20;
	float f=30.5f;
	
	
// Static Variable
	
	static int ii=25;
	static float ff=55.2f;
	
// Instance Method
	
	void access_Instance_Static()
	{
		System.out.println("Instance Variable access inside Instance Method: "+i);
		System.out.println("Static Variable inside Instance Method: "+MethodJava.ii);
		System.out.println("Call Instance Method inside Instance Method : ");
		divMath();  // call instance method inside instance method
		System.out.println("Call Static Method inside Instance Method : ");
		divMath1();
		MethodJava.divMath1();
		
		
	}
	
	// method with returnType and with Argument
	int addMath(int a,int b)
	{
		return (a+b);
		
	} // end addMath()
	
	
	// method without return ,with argument
	void subMath(int a,int b)
	{
		System.out.println(" Result "+(a-b));
		
	} // end subMath()
	
	// method without return ,without argument
	void divMath()
	{
		System.out.println("Result : "+(20/2));
	}// end divMath()
	
	
// Static Method 
	
	static void access_Instance_Static1()
	{
		MethodJava obj1=new MethodJava();
		System.out.println("Instance Variable access inside Static Method: "+obj1.i);
		System.out.println("Static Variable inside Static Method: "+MethodJava.ii);
		System.out.println("Call Instance Method inside Static Method : ");
		obj1.divMath();  // call instance method inside instance method
		System.out.println("Call Static Method inside Static Method : ");
		MethodJava.divMath1();
		
		
	}
	
	// method with returnType and with Argument
		static int addMath1(int a,int b)
		{
			return (a+b);
		} // end addMath()
		
		
		// method without return ,with argument
		static void subMath1(int a,int b)
		{
			System.out.println(" Result "+(a-b));
			
		} // end subMath()
		
		// method without return ,without argument
		static void divMath1()
		{
			System.out.println("Result : "+(20/2));
		}// end divMath()
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodJava obj=new MethodJava();
		obj.access_Instance_Static(); // call instance method using object
		access_Instance_Static1(); // call static method directly inside static method
		

	} // end main()

} // end class MethodJava

