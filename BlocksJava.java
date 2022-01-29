
public class BlocksJava {

	/*
	 * Static Block
	 * Instance Block
	 * 
	 * {Stetements...}
	 */
	
	{System.out.println("Its Instance Block1...");} // Instance block
	
	static {System.out.println("Its Static Block1...");} // static block
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BlocksJava obj=new BlocksJava();

		System.out.println("Its Statement inside main...");
	} // end main()
	
	{System.out.println("Its Instance Block2...");} // Instance block
	static {System.out.println("Its Static Block2...");} // static block

}// end class BlocksJava
