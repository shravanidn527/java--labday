//Author class
class Author{
	 String authorName;
	 String authorCountry;
	public Author(String authorname,String authorcountry)
	{
		authorName=authorname;
		authorCountry=authorcountry;
	}
}
//Book Class
class Book{
	int BookNum;
	String BookName;
	Author BookAuthor;//passing class reference to book class
	
	public Book(int num,String book, Author atr)
	{
	
		BookNum=num;
		BookName=book;
		BookAuthor=atr;
	}
	//printing
	public void bookPrint(){
		System.out.println("Hello "+BookName+"book id :"+BookNum+" and author is "+BookAuthor.authorName);
	}
}

class library{
	public static void main(String ...args)
	{
		//author object
		Author a1=new Author("Kathy Seirra","UK");
		//book object
		Book b1=new Book(1234,"Java SCJP",a1);
			b1.bookPrint();
	
	}

}


