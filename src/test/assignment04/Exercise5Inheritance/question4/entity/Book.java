package test.assignment04.Exercise5Inheritance.question4.entity;

public class Book extends Document {
    private String author;
    private int pageAmount;

    public Book() {
    	super();
    }
    public Book(int id, String publisher, int publishedAmount, String author, int pageAmount) {
        super(id, publisher, publishedAmount);
        this.author = author;
        this.pageAmount = pageAmount;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", pageAmount=" + pageAmount +
                ", id=" + id +
                ", publisher='" + publisher + '\'' +
                ", publishedAmount=" + publishedAmount +
                '}';
    }
    
	@Override
	public void inputFromConsole() {
		// TODO Auto-generated method stub
		
	}
}
