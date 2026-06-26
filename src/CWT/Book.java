package CWT;

public class Book {
	
	private int bookid;
	private String bookname;
	private String authorName;
	
	
	
	
	
	
	
	
	
	

	public int getBookid() {
		return bookid;
	}











	public void setBookid(int bookid) {
		this.bookid = bookid;
	}











	public String getBookname() {
		return bookname;
	}











	public void setBookname(String bookname) {
		this.bookname = bookname;
	}









 

	public String getAuthorName() {
		return authorName;
	}











	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}











	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book b = new Book();
		
		b.setBookid(2705);
		b.setAuthorName("Tushar Ingale");
		b.setBookname("Java");
		
		
		System.out.println("Book Id :" + b.getBookid());
		System.out.println("Book Author Name:" + b.getAuthorName());
		System.out.println("Book Name : " + b.getBookname());

	}

}
