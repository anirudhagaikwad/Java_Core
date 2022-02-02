package javaintro;

// java.util.Arrays 
import java.util.Arrays;





public class ArrayManipulationsCopy {
	
	String[] str= {"jan","feb","mar","apr","may","jun","jul","aug","sept","oct","nov","dec"};
	public int[] numArr={2,23,12,45,65,78,98,45,65,79};
	int[] numArr2={2,23,12,45,65,78,98,45,65,79};
	int[] numArr3={233,223,22,445,757,758,948,455,645,969};
	int[] numArr4={233,223,22,445,757,758,948,455,645,969};
	
	void asListArray()
	{
		// converted string array to a list using asList
		
		System.out.println("converted string array to a list using asList : "+Arrays.asList(str));
		
		
	} // end asListArray()
	
	
	
	 public int binaryFind()
	{
		//sort arry using sort method
		Arrays.sort(numArr);
		
		// convert this array in string using toString()
		System.out.println("Convert Array into String using toString : "+Arrays.toString(numArr));
		
		int key=98;
		
				
		return Arrays.binarySearch(numArr,key);
		
		//call binarySearch method to search given key
		
		
	} // end binaryFind()
	
	
	void equalArray()
	{
		
		System.out.println("Convert Array1 into String using toString : "+Arrays.toString(numArr3));
		
		System.out.println("Convert Array2 into String using toString : "+Arrays.toString(numArr4));
		
		//use equals method to check equality of arrays.
		boolean eql=Arrays.equals(numArr3, numArr4);
		
		if(eql)
		{
			System.out.println("equals method returns : "+eql+" hence both arrays are equal...");
		}
		else {System.out.println("equals method returns : "+eql+" hence both arrays are not-equal...");}
		
		
		
	} //equalArray()
	
	
	
	void fillArray(int x)
	{
		System.out.println("Convert numArr into String using toString : "+Arrays.toString(numArr));
		
		//call fill method to fill the array with x
		
		Arrays.fill(numArr,x);
		
		System.out.println("After Fill numArr : "+Arrays.toString(numArr));
		
		
	} //end fillArray(int x)
	
	
	void sortArry(int[] x)
	{
		// sort array in ascending order
		
		System.out.println("Convert x into String using toString : "+Arrays.toString(x));
		
		Arrays.sort(x);
		
		System.out.println("Sorted Array x : "+Arrays.toString(x));
		
		
	}//sortArry(int[] x)
	
	
	int hashCodeArray(int[] x)
	{
		
		return Arrays.hashCode(x);
		
	}//hashCodeArray()
	
	
	
	

	public static void main(String[] args) {
	
		 String[] copyFrom= {"jan","feb","mar","apr","may"};
		 String[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 2, 4); // n-1
		 for(String i:copyTo) {
			 
			 System.out.println(i+" ");
		 }// end for-each
		 
		 
		 
		 // toString()
		 
		 System.out.println("Converting Array to String :: "+java.util.Arrays.toString(copyTo));
		 
		 
		 // Invok Methods
		 
		 ArrayManipulationsCopy obj=new ArrayManipulationsCopy(); // create object
		 
		 obj.asListArray();
		
		 int binaryIndex=obj.binaryFind();
		 System.out.println("numArry element "+obj.numArr[6]+ "index is "+binaryIndex);
		 
		 
		 obj.equalArray();
		 
		 obj.fillArray(binaryIndex);
		 
		 int[] x= {20,44,55,77,66,88,11};
		 obj.sortArry(x);
		 
		 
		 System.out.println("The hashCode for input array : "+Arrays.toString(x)+ " is "+obj.hashCodeArray(x));
		

	} // end main()

}// end class ArrayManipulationsCopy



