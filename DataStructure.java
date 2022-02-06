
/*
 * Example of Inner Class
 * 
 * # The DataStructure outer class which includes constructorto create an instance of DataStructure containing an array
 *   filed with consecutive integer values and method that prints elements of array that have even index value.
 * # The EvenIterator inner class which implements interface i.e. DataStructureIterator which extends Iterator,Integer>
 *   
 * 
 */
public class DataStructure {
	
		private final static int SIZE=15;
	// create array
		private int[] arrayOfInts=new int[SIZE];
		
		public DataStructure()
		{
			// fill array with ascending integer values
			for(int i=0;i<SIZE;i++)
			{
				arrayOfInts[i]=i;
			}
		}// Constructor
	
		
		public void printEven()
		{
			// print values of even indices of array
			DataStructureIterator itretor =this.new EvenIterator();
			while(itretor.hasNext())
			{
				System.out.print(itretor.next()+" ");
			}
			System.out.println();
			
		} // end printEven()
	
	
		interface DataStructureIterator extends java.util.Iterator<Integer>
		{
			
		}
		
		// Inner class implements interface DataStructureIterator which extends Iterator<Integer> interface
		
		private class EvenIterator implements DataStructureIterator
		{
			// start stepping through array from begining
			
			private int nextIndex=0;
			
			public boolean hasNext()
			{
				// check if current lement is the last in array
				return (nextIndex<=SIZE-1);
			}
			
			public Integer next()
			{
				// record value of an even index of array
				Integer retValue =Integer.valueOf(arrayOfInts[nextIndex]);
				
				// get next even element
				nextIndex +=2;
				return retValue;
				
			}
			
		} // end EvenIterator
		

	public static void main(String[] args) {
		
		DataStructure obj =new DataStructure();
		obj.printEven();

	} //end main()

}// end DataStructure
