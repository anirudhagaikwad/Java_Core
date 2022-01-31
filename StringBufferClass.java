package javaintro;

import java.lang.StringBuffer;

public class StringBufferClass {
	
	/*
	 StringBuffer class is used to create a mutable string object.
	 Mutable means we can able to change value.
	 StringBuffer class is used when we have to make lot of modifications to our string.
	 StringBuufer is Thread Safe.
	 StringBuffer defines 4 Constructor
	 - StringBuffer();
	 - StringBuffer(int size); takes integer argument to set capacity of buffer.
	 - StringBuffer(String str); it create StringBuffer object  from specified string.
	 - StringBuffer(charSequence []ch); it create StringBuffer object  from charsequence array.
	 */

	public static void main(String[] args) {
		
		
// Create StringBuffer Object
		StringBuffer sbObj1= new StringBuffer("Hello Java");  //StringBuffer(String str);
		StringBuffer sbObj2= new StringBuffer("Hello Python");
		
// append() Method
		sbObj1.append(156);
		System.out.println("append() : "+sbObj1);

		
		sbObj1.append(sbObj2);
		System.out.println("append() : "+sbObj1);
		

//insert() Method
		sbObj1.insert(2, 789);
		System.out.println("insert() : "+sbObj1);
		
		
// reverse() Method	
		sbObj1.reverse();
		System.out.println("reverse() : "+sbObj1);
		
// capacity() Method
		int capacityBuffer= sbObj1.capacity();
		System.out.println("capacity() : "+capacityBuffer);
		
// ensureCapacity() Method
            // newCapacity=(oldCapacity*2)+2
		StringBuffer sbObj3= new StringBuffer();
		System.out.println("sbObj3.capacity() : "+sbObj3.capacity()); //16 - empty constructor reserves for 16 characters
		int x=30;
		sbObj3.ensureCapacity(x);// grater than the existing capacity
		System.out.println("ensureCapacity() : "+sbObj3.capacity()); // 34  by following the rule : ((oldCapacity*2)+2.)  i.e.  (16*2)+2=34
		
		
	} // end main()

} // end class StringBufferClass


























