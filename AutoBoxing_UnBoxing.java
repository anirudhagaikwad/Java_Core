import java.util.ArrayList;
import java.util.List;

public class AutoBoxing_UnBoxing {
	
	
/* Autoboxing : it is refers to the auto conversion of primitive type to its correspond object type.
 *              This conversion is done implicitly by java compiler during program execution. 
 */
	void autoboxingJava()
	{
		Integer i=200;  // autoboxing of int i.e. converting int to wrapper class Integer
		System.out.println(i);
		
		Character ch='a';
		System.out.println(ch);
		
	}//autoboxingJava()
	
	
/*
 * Unboxing : it is refers to the auto conversion of correspond object type to primitive type.	
 */
	void unboxingJava()
	{
		ArrayList arrayList=new ArrayList();
		arrayList.add(100); // autoboxing int to Integer
		arrayList.add(200);
		arrayList.add(300);
		
		 // Unboxing Integer to int type
		int first=(int) arrayList.get(0);
				int second=(int) arrayList.get(1);
						int third=(int) arrayList.get(2);	
						System.out.println("int value :"+first+","+second+","+third);
		
	} // unboxingJava()
	
	
	
	
void autoboxing_unboxing()
{
	Integer i=new Integer(-8);
	
// Unboxing through method invocation
	int absVal = absoluteValue(i);
	System.out.println("Absolute Value of "+i+" = "+absVal);
	
	
	List<Double> id=new ArrayList<>();
	id.add(3.1416); // PI is autoboxed through method invocation
	
// Unboxing through assignments
	double pi=id.get(0);
	System.out.println("PI = "+pi);
	
	
	
	
	
} // autoboxing_unboxing()

int absoluteValue(int i)
{
	return (i<0)?-i:i;
}




	public static void main(String[] args) {
		
		AutoBoxing_UnBoxing obj = new AutoBoxing_UnBoxing();
		obj.autoboxingJava();
		obj.unboxingJava();

	} // end main()

}// end class
