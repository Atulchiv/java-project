package java_project;

class Book{
	private int bookid;
	private String bookname;
	private String authorname;
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
	public String getAuthorname() {
		return authorname;
	}
	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}
}
public class Task_encapsulation2 {

	public static void main(String[] args) {
		Book b = new Book();
		b.setBookid(356);
		b.setBookname("Agnipankh");
		b.setAuthorname("A.P.J Abdul Kalam");
		System.out.println(b.getBookid());
		System.out.println(b.getBookname());
		System.out.println(b.getAuthorname());

	}

}
