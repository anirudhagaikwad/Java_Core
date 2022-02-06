
public class JavaClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//InnerInnerClass obj=new InnerInnerClass();
		
		OuterClass objOuterClass =new OuterClass();
		int z=objOuterClass.addition(20, 30);
		objOuterClass.accessInnerClassMembers(); // call outerclass member which is access innerclass members
		
		OuterClass.InnerClass objInnerClass=objOuterClass.new InnerClass(); // create InnerClass Object
		objInnerClass.accessOuterClassMembers(); // call InnerClass Method using InnerClass object
		
		
		OuterClass.InnerClass.InnerInnerClass objInnerInnerClass = objInnerClass.new InnerInnerClass(); // create InnerInnerClass object
		objInnerInnerClass.accessOuter(); // call InnerInnerClass Method using InnerInnerClass object

	} // end main()

}//end class


/*
 * Nested Class : It enables you to logically group classes that are uses in onlyon place.
 *                Its increase the use of encapsulation and create more readable,maintainable code.
 */

class OuterClass
{
	int a,b;
	
	int addition(int a,int b)
	{
		this.a=a;
		this.b=b;
		return (a+b);
	}
	
	private int substraction(int a,int b)
	{
		this.a=a;this.b=b;
		return (a-b);
	}
	
	void accessInnerClassMembers()
	{
		//accessOuterClassMembers(); // OuterClass can not directly access of InnerClass
		InnerClass objInnerClass=new InnerClass();
		objInnerClass.accessOuterClassMembers();
		
		//InnerInnerClass obj=new InnerInnerClass();
	}
	
	class InnerClass
	{
		void accessOuterClassMembers()
		{
			int result=addition(10,20);
			System.out.println("Access OuterClass Members in InnerClass : addition(10,20) = "+result);
			int z=substraction(20,5);
		    System.out.println("Access Private OuterClass Members in InnerClass : substraction(20,5) = "+z);	
		}
		
		class InnerInnerClass
		{
			void accessOuter()
			{
				System.out.println("Access InnerClass Members in InnerInnerClass : accessOuterClassMembers() ");
				accessOuterClassMembers();
				int result=addition(10,20);
				System.out.println("Access OuterClass Members in InnerInnerClass : addition(10,20) = "+result);
				
			}
		} // end InnerInnerClass
		
	} // end InnerClass
	
} // end OuterClass







