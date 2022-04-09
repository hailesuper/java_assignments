package test.assignment04.Exercise5Inheritance.question4.entity;

import java.time.YearMonth;

public class Magazine extends Document {
    private int version;
    private YearMonth yearMonth;

    public Magazine() {
    	super();
    }
    public Magazine(int id, String publisher, int publishedAmount, int version, YearMonth yearMonth) {
        super(id, publisher, publishedAmount);
        this.version = version;
        this.yearMonth = yearMonth;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "id=" + id +
                ", publisher='" + publisher + '\'' +
                ", publishedAmount=" + publishedAmount +
                ", version=" + version +
                ", yearMonth=" + yearMonth +
                '}';
    }
	@Override
	public void inputFromConsole() {
		// TODO Auto-generated method stub
		
	}
}
