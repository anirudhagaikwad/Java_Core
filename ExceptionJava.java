package javaOOP;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;


/*
 Exception Handler : Try,Catch,Finally,Throw,Throws
 Try     : It used to enclose the suspected code (risky code) 
 Catch   : It acts as exception handler
 Finally : It is used to execute necessary code
 Throw   : It Throws the exception explicitly
 Throws  : It informs for the possible exception
 
 Types of Exception : 
 1) Checked Exception   : The exception that can predicted by JVM at the compile time,Syntactical error
 2) Unchecked Exception : are ignore at compile time and checked at runtime, java can provide exception classes.
 3) Error               : Its can not handle by code, like insufficient RAM -hardware error
 
 Throwable --> Exception --> RuntimeException
           --> Error
 
 
*/

public class ExceptionJava {
	
	int a,b;
	int c;
	
	
	void uncaughtException(int a,int b)
	{	
		float z=a/b;
		System.out.println(" Division operation : "+a+"/"+b+"="+z);
		
	}// end uncaughtException()
	
	
	void caughtException(int a,int b)
	{
		try {
			float z=a/b;
			System.out.println(" Division operation : "+a+"/"+b+"="+z);
		} // end try
		
		catch(ArithmeticException e){
			System.out.println("Exception occured due to : "+e);
		} // end catch	
		
	} // end caughtException()
	
	
	
	
	void multipleCatch()
	{
		try {
			int a[]=new int[10];
			System.out.println(a[20]);
			
		} // end try
		
		
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException occured due to : "+e);
		}// end catch(ArithmeticException e)
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException occured due to : "+e);
		}// end catch(ArithmeticException e)
		
		catch(Exception e)
		{
			System.out.println("Exception occured due to : "+e);
		}// end catch(Exception e)
		
// At a time Only one exception is processed and only one respective catch block is executed.		
		
	}//end multipleCatch()
	
	
	
	void unreachableCatchBlock()
	{
		try {
			int a[]=new int[10];
			System.out.println(a[20]);
			
		} // end try
		
		catch(Exception e)
		{
			System.out.println("Exception occured due to : "+e);
		}// end catch(Exception e)
		
		
	/*	catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException occured due to : "+e);
		}// end catch(ArithmeticException e)
	*/	
		
/*
    It is important to remember that subclasses of class Exception inside catch must come before any of teir superclass.
    Otherwise it produced compile time error.
    		
 */
		
	} // unreachableCatchBlock()
	
	
	
	
	void nestedTry()
	{
		try {
			int arr[]= {1,0,3,4,5,6,7,8};
			try {
				int x=arr[3]/arr[1];
				
			} // end Inner try
			catch(ArithmeticException e)
			{
				System.out.println("ArithmeticException occured due to : "+e);
				
			}// end Inner catch()
			
			arr[8]=3;
			
		} // end Outer try
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException occured due to : "+e);
		}//end Outer catch()
		
	} //end nestedTry()
	
	
	
	
	void tryWithoutResource()
	{
		try
		{
			String str;
			// opening file in read mode using BufferedReader stream
			BufferedReader br =new BufferedReader(new FileReader("L:\\nikita.txt"));
			while((str=br.readLine())!=null)
			{
			    System.out.println(str);	
			}// end while
			br.close(); // close
		} // end try
		catch(IOException e)
		{
			System.out.println("IOException ocuured due to : "+e);
		}
		
	} // end tryWithoutResource()
	
	
	
	void tryWithResource() throws FileNotFoundException
	{   
		BufferedReader br =new BufferedReader(new FileReader("L:\\nikita.txt"));
//		try(BufferedReader br =new BufferedReader(new FileReader("L:\\nikita.txt"))) older way Java V7
		try(br) // from java v9
		{   
			String str;
			while((str=br.readLine())!=null)
			{
			    System.out.println(str);	
			}// end while
			
		} // end try
		catch(IOException e)
		{
			System.out.println("IOException ocuured due to : "+e);
		}
		catch(Exception e)
		{
			System.out.println("Exception ocuured due to : "+e);
		}
		
/*
   In try-with-resources statement,any catch or finally block is run after the resources declared have been close.		
*/
		
	}// end tryWithResource()
	
	
	

	public static void main(String[] args) {
		
		ExceptionJava exceptionObj=new ExceptionJava();	
		
		try (Scanner sObj = new Scanner(System.in)) {
						
			try {
			System.out.println(" Enter First Number : ");
			exceptionObj.a=sObj.nextInt();
			
			System.out.println("\n Enter Second Number : ");
			exceptionObj.b=sObj.nextInt();
			
			System.out.println("\n Enter Your Age : ");
			exceptionObj.c=sObj.nextInt();
			} // end try
			catch(InputMismatchException e)
			{
			  System.out.println("InputMismatchException ocuured due to : "+e);	
			}
			
			/*
			 When input character
			   Exception in thread "main" java.util.InputMismatchException
at java.base/java.util.Scanner.throwFor(Scanner.java:939)
at java.base/java.util.Scanner.next(Scanner.java:1594)
at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
at javaOOP.ExceptionJava.main(ExceptionJava.java:54)

			 */
			
			
			
			
			System.out.println("  Perform Division operation : ");
			exceptionObj.uncaughtException(exceptionObj.a,exceptionObj.b);
			
/*
			This exception occurred when b=0 : 
			
			Exception in thread "main" java.lang.ArithmeticException: / by zero
			at javaOOP.ExceptionJava.uncaughtException(ExceptionJava.java:11)
			at javaOOP.ExceptionJava.main(ExceptionJava.java:32) 
			
*/
			
			System.out.println(" Division operation Perform Sucessfully... : ");
			
			
			
			System.out.println("  Perform Division operation using caughtException(): ");
			exceptionObj.caughtException(exceptionObj.a,exceptionObj.b);
			System.out.println(" Division operation Perform Sucessfully by caughtException()... : ");
			
			System.out.println("  Perform operation using multipleCatch() : ");
			exceptionObj.multipleCatch();
			System.out.println(" Oeration Perform Sucessfully by multipleCatch()... : ");
			

			System.out.println("  Perform operation using nestedTry() : ");
			exceptionObj.nestedTry();
			System.out.println(" Oeration Perform Sucessfully by nestedTry()... : ");	
			
			System.out.println("  Perform operation using tryWithoutResource() : ");
			exceptionObj.tryWithoutResource();
			System.out.println(" Oeration Perform Sucessfully by tryWithoutResource()... : ");	
			
			System.out.println("  Perform operation using tryWithoutResource() : ");
			try
			{
			exceptionObj.tryWithResource();
			}
			catch(Exception e)
			{
				System.out.println("Exception occured due to : "+e);
			}
		}
		System.out.println(" Oeration Perform Sucessfully by tryWithResource()... : ");	
		
		
		exceptionObj.votingAge(exceptionObj.c); // throw
		
		try {
		exceptionObj.searchElement();  //throws
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException occured due to : "+e);
			
		}// end catch()
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException occured due to : "+e);
			
		}// end catch()
		
		
		try {
		exceptionObj.find(new int[] {11,1,2,13,55,88,99}, 12);
		}
		catch(ItemNotFound i)
		{
			System.out.println("ItemNotFound occured due to : "+i);
		}
		
		exceptionObj.finallyTest(); //finally
		
		/*
		
		
		exceptionObj.scanner = new Scanner(System.in);
				
			
			while(true) {
				
				
				System.out.println("For Exit press X ");
				System.out.println("For call method votingAge press                 1 ");
				System.out.println("For call method searchElement press             2 ");
				System.out.println("For call method finallyTest press               3 ");
				System.out.println("For call method find press                      4 ");
				System.out.println("For call method tryWithResource press           5 ");
				System.out.println("For call method tryWithoutResource press        6 ");
				System.out.println("For call method nestedTry press                 7 ");
				System.out.println("For call method unreachableCatchBlock press     8 ");
				System.out.println("For call method multipleCatch press             9 ");
				System.out.println("For call method caughtException press           10 ");
				System.out.println("For call method unCaughtException press         11 ");
				try
				{
					exceptionObj.input=exceptionObj.scanner.nextLine();
				}
				catch(InputMismatchException m)
				{
					System.out.println("InputMismatchException occurred due to : "+m);
				}
				
				if(exceptionObj.input.equals("X"))
						{
					System.exit(0); // terminate JVM
						}

         switch(exceptionObj.input)
         {
         case "1" :   break;
         case "2" :   break;
         case "3" :   break;
         case "4" :   break;
         case "5" :   break;
         case "6" :   break;
         case "7" :   break;
         case "8" :   break;
         case "9" :   break;
         case "10" :   break;
         case "11" :   break;
         default:  throw new CaseNotFound("Not Found case which is enter by User...."); 
                 break;
         
         
         } // end switch
				
			} // end while
		
			
		*/		
		
	} // end main()
	
	
	//String input;
	//Scanner scanner;
	
/*
Throw   : It is  used to throw an exception.
Throws  : It used to declare the list of possible exceptions with method signature.
Finally : It is used to execute essential code,specially to release the occupied resources. 	
*/
	
//Throw

	void votingAge(int age)
	{
		try 
		{
			if(age>18)
			{
				System.out.println("Eligible for Voting.... Age :"+age);
			}
			else
			{
				throw new ArithmeticException("Not Eligible for Voting");
			}
		}// end try
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException occured due to : "+e+" : "+age);
			
		}// end catch()
		
		
	}//end votingAge(int age)
	
	
	

//Throws
	
	void searchElement() throws ArithmeticException,ArrayIndexOutOfBoundsException
	{
		//Branching Statement of Unlabeled Break
		int[] arrayInt= {32,87,589,479,625,458,2000,8000,64,8};
		
		int serch=arrayInt[15];
		
		int i;
		boolean foundIt=false;
		
		for(i=0;i<arrayInt.length;i++)
		{
			if(arrayInt[i]==serch)
			{
				foundIt=true;
				break;  //Unlabeled Break
			} // end if
			
		} // for end
		
		
		if(foundIt)
		{
			System.out.println("Found "+serch+" at Array index "+i);
		}
		else {
			throw new ArithmeticException(serch+" Element not found in Array....");
			//throw new ArrayIndexOutOfBoundsException(serch+" Element not found in Array....");
			
		}
		
		
	}// end searchElement()
	
	
/* Difference between throw and throws
########################################################################################################################################################### 	
                       Throw                                                                  Throws
--------------------------------------------------------------------------------------------------------
1) throw an exception explicitly                                       1) To declare an exception possible during its execution
2) followed by instance of Throwable class or its sub-classes          2) followed by one or more exception class name separated by commas
3) It can be declare inside method body                                3) Its used with method signature
4) we can not throw multiple exception in method using throw keyword   4) we can declare multiple exception using throws keyword,its separated by commas
#############################################################################################################################################################       


*/
	

	
// Finally
	void finallyTest()
	{
		int a[]= new int[2];
		System.out.println("out of try..");
		try
		{
			System.out.println("Access array element.."+a[3]);	
		}// end try
		finally
		{
			System.out.println("Finally block always excecuted..");
		}
		
		System.out.println("After Finally block ..");
		
	}// end finallyTest()
	
	
	
	

// 	Custom/User define Exception
	
	void find(int arr[],int item) throws ItemNotFound
	{
		boolean flag=false;
		for(int i=0;i<arr.length;i++)
		{
			if(item==arr[i])
			{
				flag=true;
			}
			
		}// end for
		
		if(!flag)
		{
			throw new ItemNotFound("Item not found in array...");
		}
		else
		{
			System.out.println("Item found..");
		}
		
	} // end find()
	

}//end ExceptionJava class



/*
   Custom/User define Exception
 */

class ItemNotFound extends Exception
{
	public ItemNotFound(String str)
	{
		super(str);
		
	} // end constructor
	
} // end ItemNotFound class
































