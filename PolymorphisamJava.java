
public class PolymorphisamJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArithmeticOperation objArith=new ArithmeticOperation();
		objArith.addition(5.2f, 2.8f);
		objArith.addition(8,6);
		int result=objArith.addition(5,2,6);
		System.out.println("Result = "+result);
		
		
		AddOperation objChild=new AddOperation();
		objChild.addition(8,6); // call override method
		int res=objArith.addition(51,20,8);
		System.out.println("Result = "+res);
		
		
		

	} // end main()

} // end class PolymorphisamJava

class ArithmeticOperation
{
/*
 * Method Overloading : is concept that allows to declare multiple methods with same name but different parameters in same class.
 *                    : It can be done by changing number of arguments or by changing the data-type of arguments.
 *                    : If tow or more methods have same name and same parameter list but differs in return type can not be overloaded.	
 */
	int x,y,z;
	// Method overloading 
	void addition(int x,int y)
	{
		this.x=x;this.y=y;
		System.out.println(x+"+"+y+"="+(x+y));
	} // end addition(int x,int y)
	
	int addition(int x,int y,int z)
	{
		this.x=x;this.y=y;this.z=z;
		return (x+y+z);
	} // end addition(int x,int y,int z)
	
	void addition(float x,float y)
	{
		this.x=(int)x;this.y=(int)y;
		System.out.println(x+"+"+y+"="+(x+y));
		
	} // end addition(float x,float y)
} // end class


class AddOperation extends ArithmeticOperation
{
	/*
	 * Method Overriding : In overriding method of both class must have same name and equal number of parameters 
	 *                   : Method overriding is also referred to as runtime polymorphism because calling method is decide by JVM during runtime.
	 *                   : Method overriding performs if two classes have IS-A relationship or in inheritance
	 * 
	 */
	
	void addition(int x,int y)
	{
		this.x=x;this.y=y;
		System.out.println("This method from Child Class "+x+"+"+y+"="+(x+y));
	} // end addition(int x,int y)
	
	
} // end AddOperation


