package javaio;

/*
 * Console is a more advanced alternative to the Standard Stream(System.out,System.in,System.err)
 */

import java.io.Console;
import java.util.Arrays;
import java.io.IOException;

public class Password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Console c=System.console();
		if(c==null)
		{
			System.err.println("No Console...");
			System.exit(1);
		}
		
		String login = c.readLine("Enter your login : ");
		char[] oldPassword=c.readPassword("Enter your old password : ");
		
		if(verify(login,oldPassword))
		{
			boolean noMatch;
			do {
				char[] newPassword1=c.readPassword("Enter your new password : ");
				char[] newPassword2=c.readPassword("ReEnter your new password : ");
				noMatch=!Arrays.equals(newPassword1, newPassword2);
				if(noMatch)
				{
					c.format("Password not match.. Try again..%n");
				}
				else {change(login,newPassword1); c.format("Password for %s changed %n",login);}
				Arrays.fill(newPassword1,' ');
				Arrays.fill(newPassword2,' ');
				
			}while(noMatch);
		}
		Arrays.fill(oldPassword,' ');
	} // end main()

	
	// Dummy verify method
	static boolean verify(String login,char[] password)
	{
		//Modify this method to verify password according to your rules
		return true;
	}
	
	
	// Dummy change method
	static void change(String login,char[] password)
	{
		//Modify this method to change password according to your rules
	}
	
	
	
	
	
	
	
	
} // end class
