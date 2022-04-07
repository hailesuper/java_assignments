package test.assignment04.Exercise5Inheritance.question4.entity;

import java.time.LocalDate;

public class Newspaper extends Document {
    private LocalDate publishedDate;

    @Override
    public String toString() {
        return "Newspaper{" +
                "id=" + id +
                ", publisher='" + publisher + '\'' +
                ", publishedAmount=" + publishedAmount +
                ", publishedDate=" + publishedDate +
                '}';
    }

    public Newspaper(int id, String publisher, int publishedAmount, LocalDate publishedDate) {
        super(id, publisher, publishedAmount);
        this.publishedDate = publishedDate;
    }
}
