package test.assignment04.Exercise5Inheritance.question4.entity;

public class Document {
    protected int id;
    protected String publisher;
    protected int publishedAmount;

    public Document(int id, String publisher, int publishedAmount) {
        this.id = id;
        this.publisher = publisher;
        this.publishedAmount = publishedAmount;
    }

    public int getID() {
        return id;
    }

    @Override
    public String toString() {
        return "Document{" +
                "id=" + id +
                ", publisher='" + publisher + '\'' +
                ", publishedAmount=" + publishedAmount +
                ", type=" + this.getClass().getSimpleName() +
                '}';
    }
}
