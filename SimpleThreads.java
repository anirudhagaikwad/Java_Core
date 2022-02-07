package multithreading;

public class SimpleThreads {
	
	
	static void threadMessage(String message)
	{
		String threadName=Thread.currentThread().getName();
		System.out.format("%s: %s%n",threadName,message);
	}
	
	private static class MessageLoop implements Runnable
	{
		public void run()
		{
			String importantInfo[]= {"FreeBSD is a free and open-source Unix-like operating system",
					"which was based on Research Unix","Berkeley Software Distribution",
					"Its faster and relible than linux"};
			
			try {
			for(int i=0;i<importantInfo.length;i++)
			{
				// pause for 4 seconds
				Thread.sleep(4000);
				
				//print message
				System.out.println(importantInfo[i]);
				
			}
			
		   }
			catch(InterruptedException e)
			{
				threadMessage("It wasnt done...");
			}
			
		} // end run()
	} // end MessageLoop

	public static void main(String[] args) throws InterruptedException {
		
		long patience=1000*60*60;
		
		if(args.length>0)
		{
			try
			{
				patience=Long.parseLong(args[0])*1000;
			}
			catch(NumberFormatException e)
			{
				System.err.println("Argument must be integer number");
				System.exit(1);
			}
		}
		
		threadMessage("Starting MessageLoop Thread...");
		long startTime=System.currentTimeMillis();
		Thread t =new Thread(new MessageLoop());
		t.start();
		
		threadMessage("Waiting MessageLoop Thread to Finish...");
		while(t.isAlive())
		{
			threadMessage("still waiting.....");
			t.join(1000);
			if(((System.currentTimeMillis()-startTime)>patience) && t.isAlive())
			{
				threadMessage("Tired of waiting....");
				t.interrupt();
				t.join();
				
			}
		}
		
		threadMessage("Finally....");

	}// end main()

}// end SimpleThreads
