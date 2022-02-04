package javaio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class FileIOJava {
	
	
//Create File
	void createNewFile(String str)
	{
		try
		{
			File obj=new File(str);
			if(obj.createNewFile())
			{
				System.out.println(obj.getName()+" File Created ");
			}
			else
			{
				System.out.println(obj.getName()+" File Already Exists... ");
			}
		
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
			
		}
	} // end createNewFile(String str)
	

// Write File
	void writeFile(String str)
	{
		try(FileWriter obj=new FileWriter(str);)
		{
			obj.write("welcomw java\n"
					+ "Nodar Kumaritashvili (1988–2010) was a Georgian ");
			System.out.println("File Updated...");
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
			
		}
	} //writeFile(String str)
	
	
//Read File
	void readFile(String str) 
	{
		File obj=new File(str);
		try(Scanner obj1=new Scanner(obj);)
		{
		while(obj1.hasNextLine())
		{
			String str1=obj1.nextLine();
			System.out.println(str1);
		}
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}//readFile(String str)
	
	

	public static void main(String[] args) {
		
		FileIOJava obj=new FileIOJava();
		
	
		obj.createNewFile("/media/vaishnavi/Training/Java/JavaWorkPlace/Java_27Jan2022/src/javaio/qwec.txt");
		obj.writeFile("/media/vaishnavi/Training/Java/JavaWorkPlace/Java_27Jan2022/src/javaio/qwec.txt");
		obj.readFile("/media/vaishnavi/Training/Java/JavaWorkPlace/Java_27Jan2022/src/javaio/qwec.txt");
		
	
		obj.readFromFile("/media/vaishnavi/Training/Java/JavaWorkPlace/Java_27Jan2022/src/javaio/qwec.txt");

		obj.readUserInput();
	}// end main()
	
	
void readFromFile(String str)
{
	File file =new File(str);
	try(BufferedReader br=new BufferedReader(new FileReader(file));)
	{
		String s;
		while((s=br.readLine())!=null)
		{
			System.out.println(s);
		}
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	} catch (IOException e) {
		
		e.printStackTrace();
	}
}// end readFromFile()



void readUserInput()
{
	
	try
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Character :");
		
		char ch=(char)br.read(); // reading character
		System.out.println("User Enter Character : "+ch);	
		
		
		
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	
	try
	{
		BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter String :");
		String str=br1.readLine(); // reading String 
		System.out.println("User Enter String : "+str);		
		
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	
} // end readUserInput()

}// end class
