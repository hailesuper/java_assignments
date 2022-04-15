package test.assignment05.Exercise1Interface.Question1Interface.entity;

import java.time.LocalDate;

public class News implements INews {
    public static int counter;
    private int id;
    private String title;
    private LocalDate publicationDate;
    private String author;
    private String content;
    private float averageRate;
    private int[] rates = new int[3];

    public News(String title, LocalDate publicationDate, String author, String content) {
        this.id = ++counter;
        this.title = title;
        this.publicationDate = publicationDate;
        this.author = author;
        this.content = content;
    }

    public News(String title, LocalDate publicationDate, String author, String content, int[] rates) {
        this.id = ++counter;
        this.title = title;
        this.publicationDate = publicationDate;
        this.author = author;
        this.content = content;
        this.rates = rates;
    }

    public void display() {
        System.out.println(
            "News{" +
                    "id='" + id + '\'' +
                    "title='" + title + '\'' +
                    ", publicationDate=" + publicationDate +
                    ", author='" + author + '\'' +
                    ", content='" + content + '\'' +
                    ", averageRate=" + averageRate +
                    '}'
        );
    }

    @Override
    public float calculate() {
        float averageRate;
        averageRate = (float) (rates[0] + rates[1] + rates[2]) / 3;
        this.averageRate = averageRate;
        return averageRate;
    }

    public float getAverageRate() {
        return averageRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(LocalDate publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int[] getRates() {
        return rates;
    }
}
