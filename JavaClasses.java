
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

		AnonymousTest objAnonymousTest =new AnonymousTest();
		objAnonymousTest.method();
		
		
		LocalClassTest objLocalClassTest=new LocalClassTest();
		objLocalClassTest.validatePhoneNumber("9158888608","123546");
		
		
		
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





/*
 * Anonymous class enable you to make your code more concise
 * A class without any name is called Anonymous class
 * 
 */

interface MathOperation{
	void mathOperationType();
}

class AnonymousTest
{
	
	void method()
	{
		MathOperation mObj=new MathOperation() // Anonymous class create
	
			{
		public void mathOperationType()
		{
			System.out.println("Its method from Anonymous class");
		}
			}; // end Anonymous class
			
			mObj.mathOperationType();
	}
	
} // end AnonymousTest





/*
 * Local Class : are define in block , typically this blocks are methods
 */


class LocalClassTest
{
	String regularExpression ="[^0-9]";
	
	public void validatePhoneNumber(String phoneNumber1,String phoneNumber2)
	{
		final int numLenght=10;
		
		class PhoneNumber // Local class start here
		{
			String formattedPhoneNumber=null;
			
			PhoneNumber(String phoneNumber)
			{
				String currentNumber=phoneNumber.replaceAll(regularExpression,"");
				if(currentNumber.length()==numLenght)
				{
					formattedPhoneNumber=currentNumber;
				}
				else {formattedPhoneNumber=null;}
			} // end local class constructor
			
			public String getNumber()
			{
				return formattedPhoneNumber;
			}
			
			public void printOriginalNumber()
			{
				System.out.println("Original numbers are "+phoneNumber1+" and "+phoneNumber2);
			}
			
			
		} // end Local Class
		
		PhoneNumber objLocalClass1=new PhoneNumber(phoneNumber1);
		PhoneNumber objLocalClass2=new PhoneNumber(phoneNumber2);
		
		objLocalClass1.printOriginalNumber();
				
		if(objLocalClass1.getNumber()==null)
		{
			System.out.println(objLocalClass1.getNumber()+" Phone number is invalid....");
		}
		else {System.out.println("Phone number is valid...."+objLocalClass1.getNumber());}
		
		
		if(objLocalClass2.getNumber()==null)
		{
			System.out.println(objLocalClass2.getNumber()+" Phone number is invalid....");
		}
		else {System.out.println("Phone number is valid...."+objLocalClass2.getNumber());}
		
		
	} // end validatePhoneNumber()
		
		
} // end LocalClassTest
















