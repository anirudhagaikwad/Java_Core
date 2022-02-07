package multithreading;

public class HelloRunnable implements Runnable{
	
	public void run()
	{
		System.out.println("HeloRunnable from Thread...");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		(new Thread(new HelloRunnable())).start();

	}

}
