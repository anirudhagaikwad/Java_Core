
public class AggregationExample {

	public static void main(String[] args) {
		
		Author authObj=new Author("Munsi",85,"MP",1234567890,"auth@gmail.com");
		Book bookObj=new Book("home town",450.80f,authObj);
		
// Book Details
		System.out.println("Book Name: "+bookObj.bookName);
		System.out.println("Book Price: "+bookObj.price);
//Author details
		System.out.println("Book Author Name: "+bookObj.auther.authorName);
		System.out.println("Book Author Age: "+bookObj.auther.age);
		System.out.println("Book Author Address: "+bookObj.auther.location);
		System.out.println("Book Author Mobile: "+bookObj.auther.mobile);
		System.out.println("Book Author Email: "+bookObj.auther.email);

	} // end main()

} // end class

class Author
{
	String authorName;
	int age;
	String location;
	int mobile;
	String email;
	
	Author(String name,int age,String loc,int mob,String eml)
	{
		this.authorName=name;
		this.age=age;
		this.location=loc;
		this.mobile=mob;
		this.email=eml;
	}//end constructor
	
}// end Author

class Book
{
	String bookName;
	float price;
//Author details
	Author auther;
	
	Book(String bname,float price,Author auther)
	{
		this.bookName=bname;
		this.price=price;
		this.auther=auther;
	}
	
}// end Book




















