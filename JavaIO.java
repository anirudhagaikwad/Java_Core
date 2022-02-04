package javaio;

import java.io.BufferedReader;
import java.io.BufferedWriter;

/*
 * The most typical source and destination of data are File ,Pipes,Network Connections,In-Memory Buffers
 * System.in,System.out,System.error
 * 
 * Streams : IO Streams are core concept in Java IO,
 * - A Stream is linked to physical layer by java IO System to make input and output operation in java.
 * - A Stream is conceptually endless flow of data , you can either read from stream or write to a stram
 * 
 * Java IO Purposes:File Access,Network Access,Internal Memory Buffer Access,Inter-Thread Communications(Pipes)
 *                  Buffering,Filtering,Parsing,Reading & Writing Texts,Reading & Writing premitive data,Reading & Writing Objects.
 *  
 *
 * Byte Stream Classes : BufferedInputStream,BufferedOutputStream,DataInputStream,DataOutputStream,FileInputStream,
 *                       FileOutputStream,InputStream,OutputStream etc.
 *                       
 * Character Stream Classes : BufferReader,BufferWriter,FileReader,FileWriter,InputStreamReader,OutputStreamReader,
 *                            Reader,Writer etc.                                        
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

public class JavaIO {
	
// #Byte Streams	
void copyBytes()
{
	FileInputStream in =null;
	FileOutputStream out=null;
	try
	{
		in = new FileInputStream("/media/vaishnavi/Training/Java/JavaWorkPlace/Java_27Jan2022/src/javaio/abc.txt");
		out= new FileOutputStream("/media/vaishnavi/Training/Java/JavaWorkPlace/Java_27Jan2022/src/javaio/xyz.txt");
		int c;
		while((c=in.read())!=-1)
		{
			out.write(c);
		}
	}
	catch(FileNotFoundException e)
	{
		e.printStackTrace();
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
	
	finally {
		if(in!=null) {
			
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} 
		
		if(out!=null)
		{
			try {
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		}
	
} // copyBytes()


//#Character Streams
void copyCharacters()
{
//	FileReader in =null;
//	FileWriter out=null;

	// try with resources
	try(FileReader in=new FileReader("/media/vaishnavi/Training/Java/JavaWorkPlace/Java_27Jan2022/src/javaio/abc.txt");
		FileWriter out=new FileWriter("/media/vaishnavi/Training/Java/JavaWorkPlace/Java_27Jan2022/src/javaio/xyz.txt"))
		{
		int c;
		while((c=in.read())!=-1)
		{
			out.write(c);
		}
		
	}
	catch(FileNotFoundException e)
	{
		e.printStackTrace();
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
	
} // copyCharacters()



//Character Streams - Line Oriented I/O
void copyLines()
{
	// try with resources
	try(BufferedReader in=new BufferedReader(new FileReader("/media/vaishnavi/Training/Java/JavaWorkPlace/Java_27Jan2022/src/javaio/abc.txt"));
		PrintWriter out=new PrintWriter(new FileWriter("/media/vaishnavi/Training/Java/JavaWorkPlace/Java_27Jan2022/src/javaio/xyz.txt")))
	{
		String l;
		while((l=in.readLine())!=null)
		{
			out.println(l);
		}
	}
	catch(FileNotFoundException e)
	{
		e.printStackTrace();
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
	
} // end copyLines()


//#Buffered Stream
void copyCharactersBufferedStream()
{
	// try with resources
	try(BufferedReader in=new BufferedReader(new FileReader("/media/vaishnavi/Training/Java/JavaWorkPlace/Java_27Jan2022/src/javaio/abc.txt"));
		BufferedWriter out=new BufferedWriter(new FileWriter("/media/vaishnavi/Training/Java/JavaWorkPlace/Java_27Jan2022/src/javaio/xyz.txt")))
		{
		int c;
		while((c=in.read())!=-1)
		{
			out.write(c);
		}
		
	}
	catch(FileNotFoundException e)
	{
		e.printStackTrace();
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
	
} // copyCharactersBufferedStream()



/* Scanner object are useful for breaking down formatted input into tokens and translating individual
   tokensaccording to their data types.
*/

void scannerData()
{
	try(Scanner s=new Scanner(new BufferedReader(new FileReader("/media/vaishnavi/Training/Java/JavaWorkPlace/Java_27Jan2022/src/javaio/abc.txt"))))
	{
		while(s.hasNext())
		{
			System.out.println(s.next());
		}
	}
	catch(FileNotFoundException e)
	{
		e.printStackTrace();
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
} // end scannerData()


void ScanSum()
{
	double sum=0;
	try(Scanner s=new Scanner(new BufferedReader(new FileReader("/media/vaishnavi/Training/Java/JavaWorkPlace/Java_27Jan2022/src/javaio/xyz.txt"))))
	{
		
		s.useLocale(Locale.US);
		while(s.hasNext())
		{
			if(s.hasNextDouble())
			{
				sum +=s.nextDouble();
			}
			else{System.out.println(s.next()); }
		}
	}
	catch(FileNotFoundException e)
	{
		e.printStackTrace();
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
	finally
	{
		System.out.println(sum);
	}
}// end ScanSum()



	public static void main(String[] args) {
		
		JavaIO obj=new JavaIO();
		obj.copyBytes();
		obj.copyCharacters();
		obj.copyLines();
		obj.scannerData();
		obj.ScanSum();
		System.out.println("Statement after Calling method.....");

	} // end main()

}// end class


