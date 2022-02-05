
public class JavaWrapperClass {
/*
 * Why use Wrapper classes : As we knew that in java when input is given by the user it is in form of string.
 *                           to convert a string to different datatypes wrapper classes are used.
 *                           We can use wrapper class each time when want to convert preimitive data type to object and vice versa.
 * All Primitive wrapper classes are immutable.
 *      Primitive_Data_Type     Wrapper_ClassName       Conversion_Methods
 * ##########################################################################################
 *     byte                     Byte                  public ststic byte parseByte(String)
 *     short                    Short                 public ststic short parseShort(String)
 *     int                      Integer               public ststic int parseInt(String)
 *     long                     Long                  public ststic long parseLong(String)
 *     float                    Float                 public ststic float parseFloat(String)
 *     double                   Double                public ststic double parseDouble(String)
 *     char                     Character
 *     boolean                  Boolean               public ststic boolean parseBoolean(String)
 */
	
	
	void wrapperClassImmutable()
	{
		/*
		 * When a new object is created the old object is not modified
		 */
		Integer a=new Integer(15);
		System.out.println("Old value : "+a);
		xyz(a);
		System.out.println("New value : "+a);
		
	}// end wrapperClassImmutable()
	
	private void xyz(Integer a)
	{
		a=a+10;
	}
	
	
/*
 * Java Number class is super class of all the numeric wrapper classes.	
 * The number class contains some methods to provide the comman operation for all sub classes.
 */
	void numberClassMethod()
	{ // conversion object to primitive type
		Double d1=new Double("4.7898");
		byte b=d1.byteValue();
		short s=d1.shortValue();
		int i=d1.intValue();
		long l=d1.longValue();
		float f=d1.floatValue();
		double d=d1.doubleValue();
		
		System.out.println("Double Object to byte type : "+b);
		System.out.println("Double Object to short type : "+s);
		System.out.println("Double Object to int type : "+i);
		System.out.println("Double Object to long type : "+l);
		System.out.println("Double Object to float type : "+f);
		System.out.println("Double Object to double type : "+d);
	}// end numberClassMethod()
	
	
/*
 * Java Integer Class : is used to handle integer objects.
 * it provides methods that can be used for conversion primitive to object and vice-versa	
 */
void integerClassMethod()
{
	int a=88;
	Integer x=new Integer(a);
	System.out.println("toString(a) = "+Integer.toString(a));
	System.out.println("toHexString(a) = "+Integer.toHexString(a));
	System.out.println("toOctalString(a) = "+Integer.toOctalString(a));
	System.out.println("toBinaryString(a) = "+Integer.toBinaryString(a));
	
	Integer y=Integer.valueOf(a);
	System.out.println("valueOf(a) = "+y);
	
	String s="89";
	Integer w=Integer.parseInt(s);
	System.out.println("parseInt(s) = "+w);

	String d="65";
	String e="004";
	String f="0x0f";
	Integer a1=Integer.decode(d);
	System.out.println("decode(65) = "+a1);
	Integer a2=Integer.decode(e);
	System.out.println("decode(004) = "+a2);
	Integer a3=Integer.decode(f);
	System.out.println("decode(0x0f) = "+a3);
	
}//integerClassMethod()


/*
 * Long Class
 */
void longClassMethod()
{
	long a=25;
	System.out.println("toString(a) = "+Long.toString(a));
	System.out.println("toHexString(a) = "+Long.toHexString(a));
	System.out.println("toOctalString(a) = "+Long.toOctalString(a));
	System.out.println("toBinaryString(a) = "+Long.toBinaryString(a));
	
	Long y=Long.valueOf(a);
	System.out.println("valueOf(a) = "+y);
	
	String s="89";
	Long w=Long.parseLong(s);
	System.out.println("parseLong(s) = "+w);

	String d="65";
	String e="004";
	String f="0x0f";
	Long a1=Long.decode(d);
	System.out.println("decode(65) = "+a1);
	Long a2=Long.decode(e);
	System.out.println("decode(004) = "+a2);
	Long a3=Long.decode(f);
	System.out.println("decode(0x0f) = "+a3);
	
}//longClassMethod()


/*
 * Byte Class
 */
void byteClassMethod()
{
	byte a=25;
	System.out.println("toString(a) = "+Byte.toString(a));
	
	
	Byte y=Byte.valueOf(a);
	System.out.println("valueOf(a) = "+y);
	
	String s="25";
	Byte w=Byte.parseByte(s);
	System.out.println("parseByte(s) = "+w);

	String d="65";
	String e="004";
	String f="0x0f";
	Byte a1=Byte.decode(d);
	System.out.println("decode(65) = "+a1);
	Byte a2=Byte.decode(e);
	System.out.println("decode(004) = "+a2);
	Byte a3=Byte.decode(f);
	System.out.println("decode(0x0f) = "+a3);
	
}//byteClassMethod()


/*
 * Short Class
 */
void shortClassMethod()
{
	short a=25;
	System.out.println("toString(a) = "+Short.toString(a));
	
	
	Short y=Short.valueOf(a);
	System.out.println("valueOf(a) = "+y);
	
	String s="25";
	Short w=Short.parseShort(s);
	System.out.println("parseShort(s) = "+w);

	String d="65";
	String e="004";
	String f="0x0f";
	Short a1=Short.decode(d);
	System.out.println("decode(65) = "+a1);
	Short a2=Short.decode(e);
	System.out.println("decode(004) = "+a2);
	Short a3=Short.decode(f);
	System.out.println("decode(0x0f) = "+a3);
	
}//shortClassMethod()

/*
 * Float Class
 */
void floatClassMethod()
{
	float a=25.5f;
	System.out.println("toString(a) = "+Float.toString(a));
	
	
	Float y=Float.valueOf(a);
	System.out.println("valueOf(a) = "+y);
	
	String s="25";
	Float w=Float.parseFloat(s);
	System.out.println("parseFloat(s) = "+w);
	
}//floatClassMethod()

/*
 * Double Class
 */
void doubleClassMethod()
{
	double a=25.5;
	System.out.println("toString(a) = "+Double.toString(a));
	
	
	Double y=Double.valueOf(a);
	System.out.println("valueOf(a) = "+y);
	
	String s="25";
	Double w=Double.parseDouble(s);
	System.out.println("parseDouble(s) = "+w);
	
}//doubleClassMethod()


/*
 * Boolean Class
 */
void booleanClassMethod()
{
	boolean obj1=true;
	boolean obj2=false;
	
	Boolean obj3=Boolean.valueOf(obj1);
	Boolean obj4=Boolean.valueOf(obj2);
	System.out.println("valueOf(obj1) = "+obj3);
	System.out.println("valueOf(obj2) = "+obj4);
	
	System.out.println("obj3.toString() = "+obj3.toString());
	
	String s="True";
	Boolean w=Boolean.parseBoolean(s);
	System.out.println("parseBoolean(s) = "+w);
	
}//booleanClassMethod()


/*
 * Character Class
 */
void characterClassMethod()
{
	System.out.println("Character.isLetter('S') = "+Character.isLetter('S'));
	System.out.println("Character.isLetter('8') = "+Character.isLetter('8'));
	
	System.out.println("Character.isDigit('S') = "+Character.isDigit('S'));
	System.out.println("Character.isDigit('8') = "+Character.isDigit('8'));
	
	System.out.println("Character.isWhitespace('S') = "+Character.isWhitespace('S'));
	System.out.println("Character.isWhitespace(' ') = "+Character.isWhitespace(' '));
	System.out.println("Character.isWhitespace('\n') = "+Character.isWhitespace('\n'));
	System.out.println("Character.isWhitespace('\t') = "+Character.isWhitespace('\t'));
	System.out.println("Character.isWhitespace(5) = "+Character.isWhitespace(5));
	
	System.out.println("Character.isUpperCase('S') = "+Character.isUpperCase('S'));
	System.out.println("Character.isUpperCase('x') = "+Character.isUpperCase('x'));
	
	System.out.println("Character.isLowerCase('S') = "+Character.isLowerCase('S'));
	System.out.println("Character.isLowerCase('x') = "+Character.isLowerCase('x'));
	
	System.out.println("Character.toUpperCase('c') = "+Character.toUpperCase('c'));
	
	System.out.println("Character.toLowerCase('S') = "+Character.toLowerCase('S'));
	
	System.out.println("Character.toString('S') = "+Character.toString('S'));
	
	Character a =new Character('a');
	char b=a.charValue();
	System.out.println("a.charValue() = "+b);
			
}//characterClassMethod()



	public static void main(String[] args) {
		
		JavaWrapperClass obj=new JavaWrapperClass();
		obj.wrapperClassImmutable();
		obj.numberClassMethod();
		obj.integerClassMethod();
		obj.longClassMethod();
		obj.byteClassMethod();
		obj.floatClassMethod();
		obj.doubleClassMethod();
		obj.booleanClassMethod();
		obj.characterClassMethod();
		
		
	} // end main()

}// end class
