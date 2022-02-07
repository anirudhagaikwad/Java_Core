package multithreading;

public class MultithreadingJava {

	public static void main(String[] args) {
		
		MultithreadingJava obj=new MultithreadingJava();
		try {
			obj.sleepMessage();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	} // end main()
	
	
	void sleepMessage() throws InterruptedException
	{
		String importantInfo[]= {"FreeBSD is a free and open-source Unix-like operating system",
				"which was based on Research Unix","Berkeley Software Distribution",
				"Its faster and relible than linux"};
		
		for(int i=0;i<importantInfo.length;i++)
		{
			// pause for 4 seconds
			Thread.sleep(4000);
			
			//print message
			System.out.println(importantInfo[i]);
			
		}
		
	} //end sleepMessage()
	
	

} // end class









