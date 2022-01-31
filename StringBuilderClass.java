package javaintro;
import java.lang.StringBuilder;

public class StringBuilderClass {
	/*
	 StringBuilder not Thread Safe.
	 StringBuilder to create string object which is mutable and non synchronized.
	 */

	public static void main(String[] args) {
		
		StringBuilder obj=new StringBuilder("Java");
		obj.append("hello");
		
		System.out.println(obj);

	} // end main()

} // end class StringBuilderClass
