
public class AccessModifiers {
/*
 *                        Access Levels
 ########################################################################
 Modifier		Class		Package			Subclass		OutOfProject	
 ------------------------------------------------------------------------
 public          Yes		  Yes			  Yes				Yes
 
 protected		 Yes		  Yes			  Yes				No
 
 private		 Yes		  No			  No				No
 
 default		 Yes		  Yes			  No				No
--------------------------------------------------------------------------
##########################################################################
Class : Second Column indicates whether the class itself has access to members
Package : Third Column indicates whether the classes in same package as the class have access to the members.
Subclass : Fourth Column indicates whether the subclasses of the class declared outside this package have access to the member

     
 */
	
	
	
	public String str="Java";
	
	private int i=10;
	
	protected int j=20;
	
	private void methodAccessModifiers()
	{
		System.out.println("value for i ="+i);
		
		
	}
	
	
	public void methodPublic()
	{
		System.out.println("value of String ="+str);
	}
	
	protected void metodProtected()
	{
		System.out.println("value for j ="+j);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Default Access Modifiers
		Author authObj=new Author("Munsi",85,"MP",1234567890,"auth@gmail.com");
		Book bookObj=new Book("home town",450.80f,authObj);	
		
		// Book Details
				System.out.println("Book Name: "+bookObj.bookName);
				System.out.println("Book Price: "+bookObj.price);
		//Author details
				System.out.println("Book Author Name: "+bookObj.auther.authorName);
				System.out.println("Book Author Age: "+bookObj.auther.age);
				System.out.println("Book Author Address: "+bookObj.auther.location);
				System.out.println("Book Author Mobile: "+bookObj.auther.mobile);
				System.out.println("Book Author Email: "+bookObj.auther.email);
			
				
				AccessModifiers obj=new AccessModifiers();
				obj.methodAccessModifiers();
				obj.metodProtected();
				
		
				// private Access Modifiers
				
				


	}//end main()

}//end class


class SingleInheritance extends AccessModifiers
{
	void method()
	{
		SingleInheritance obj=new SingleInheritance();
		obj.metodProtected();
		obj.methodPublic();
	}
}


