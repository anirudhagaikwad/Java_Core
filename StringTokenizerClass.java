import java.util.StringTokenizer;

/*
 * StringTokenizer class allows to break a string into tokens.
 * This class is legacy class 
 */
public class StringTokenizerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringTokenizer st=new StringTokenizer("This is Token");
		
		while(st.hasMoreTokens()) {
			
			System.out.println(st.nextToken());
			
			}// end while
	
		StringTokenizerClass obj=new StringTokenizerClass();
		obj.stringSplitMethod();
		
	} // end main()
	
// String.split method can be used to break up string into its basic tokens	
	void stringSplitMethod()
	{
		String[] sp="This is Token".split("\\s");
		for(int x=0;x<sp.length;x++)
		{
			System.out.println(sp[x]);
		}// end for
	}

}// end class
