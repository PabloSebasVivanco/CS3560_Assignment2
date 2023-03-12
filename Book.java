package Q5;

public class Book extends Course{
	private String name;
	private String author;
	
	
	public Book(String name, String author) {
		this(" "," ", " ");
		this.name = name;
		this.author = author;
		
	}


	public Book(String name, String author, String course_code) {
		super(course_code, course_code, 0);
		this.name = name;
		this.author = author;
	}

}
