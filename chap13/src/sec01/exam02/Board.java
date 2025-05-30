package sec01.exam02;

public class Board {
	
	// field
	private String subject;
	
	private String content;

	private String writer;

	
	
	// constructor
	public Board(String subject, String content, String writer) {
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}



	// method
	public String getSubject() {
		return subject;
	}


	public String getContent() {
		return content;
	}


	public String getWriter() {
		return writer;
	}
	
	
	
}
