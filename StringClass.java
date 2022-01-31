
public class StringClass {
	
	// Create String object using string literal
			String str1="Hello";
			String str6="Hello";
			
	// Create String object using new keyword
			String str2=new String("Java");
			String str5=new String("Hello");

	public static void main(String[] args) {
	
//Contactenation String		
		StringClass obj=new StringClass();
		//Contactenation String using concat method
		String str3=obj.str1.concat(obj.str2);
		//Contactenation String using "+" operator
		String str4=str3+25;
		System.out.println("Str3 ="+str3+"\n Str4 ="+str4);
		
//Compare String
		//using equals() Syntax --> boolean equals(Object str )
		boolean b=obj.str1.equals(obj.str2);
		if(b)
		{
			System.out.println("Both object equal...");
		}
		else
		{
			System.out.println("Both object not equal...");
		}
		
		//using == operator
		if(obj.str1==obj.str6)
		{
			System.out.println("Both object equal...");
		}
		else
		{
			System.out.println("Both object not equal...");
		}
		
		//Using CompareTo() syntax --> int compareTo(String str)
		int a=obj.str1.compareTo(obj.str6); 
		System.out.println("obj.str1.compareTo(obj.str6) Return : "+a);
		a=obj.str2.compareTo(obj.str1);
		System.out.println("obj.str2.compareTo(obj.str1) Return : "+a); // str1>str2 2
		
		/*
		 * if str1>str2 it return positive number
		 * if str1<str2 it return negative number
		 * if str1==str2 it return 0
		 * 
		 * 
		 */
		
//charAt()
		System.out.println(str4.charAt(3));
		
//equalsIgnorCase()
		String str7="hello";
		System.out.println(obj.str1.equalsIgnoreCase(str7));
		
//indexOf()
		System.out.println(str4.indexOf('e')); 
		System.out.println(str4.indexOf('l',2)); 
		System.out.println(str4.indexOf(obj.str2));
		System.out.println(str4.indexOf(obj.str2,4));
		
//length()
		System.out.println(str4.length());
		
//replace()
		System.out.println(obj.str1.replace('H','h'));
		
//toLowerCase()
		String str8="CASE";
		System.out.println(str8.toLowerCase());
		
//toUpperCase()
		System.out.println(str4.toUpperCase());
		
//valueOf()
		int n=55;
		String str9=String.valueOf(n);
		System.out.println("Type of numbr is "+str9.getClass().getName());
			
		
//startWith()	
		System.out.println(str4.startsWith("h"));
		System.out.println(str4.startsWith("t"));
		
//join()
		String date1=String.join("/","31","01","2022"); // 31/01/2022
		System.out.println("Date : "+date1);
		
//isEmpty()
		System.out.println(date1.isEmpty());
		
//getChars()
		String c=new String("Hello Welcome to Java World");
		char[] ch=new char[16];
		
		try
		{
			c.getChars(6, 12, ch, 0);
			System.out.println(ch);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
//getBytes()
		byte[] bb=c.getBytes();
		for(int i=0;i<bb.length;i++)
		{
			System.out.println(bb[i]);
		}
		
//format()
		/*
		 * %a %f floating point
		 * %c character
		 * %d %x integer
		 * %t Date/Time
		 * 
		 */
		String str10=String.format("%d",199);
		String str11=String.format("%s","Wiki");
		String str12=String.format("%f",9.5);
		String str13=String.format("%c",'q');
		System.out.print("Integer Value"+str10);
		System.out.print("String Value"+str11);
		System.out.print("Float Value"+str12);
		System.out.print("Char Value"+str13);
		
		
		
		
		
		
		
	}// end main()

	
	

	
	
} //end class
