/*
 * Within an instance method or constructor this is a reference to the current object
 * - use this with field and method(we can access/call any instance variable and method )
 * - use this with constructor & also call another constructor inside constructor 
 * 
 */
public class ThisJava {

	int x,y,w;
	float z;
	
	ThisJava(int x,int y)
	{
		this(20,30,55.2f,12);
		// x=x;y=y
		this.x=x ; // instance=local 
		this.y=y;
       // This avoid confusion when we use same filed(variable) name for instance variable and local variable				
	} // constructor 1
	
	ThisJava(int x,int y,float z,int w)
	{
		// x=x;y=y
		this.x=x ; // instance=local 
		this.y=y;
		this.z=z;
		this.w=w;
       // This avoid confusion when we use same filed(variable) name for instance variable and local variable				
	} // constructor 3
	
	
	ThisJava(int x,int y,float z)
	{
		this(60,20);// call constructor 1 // its called explicit constructor invocation
		
		// x=x;y=y
		this.x=x ; // instance=local 
		this.y=y;
		this.z=z;
       // This avoid confusion when we use same filed(variable) name for instance variable and local variable				
	} //constructor 2
	
	
	void getStr()
	{
		System.out.println("String from method getStr");
	} // end getStr()
	
	void getMethod()
	{
		this.getStr();
	} // end getMethod()
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThisJava obj=new ThisJava(20,30);
		obj.getMethod();

	} // end main()

} // end class This Java
