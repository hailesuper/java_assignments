package test.assignment00;

import java.time.LocalDate;

public class Exam {
    public int examID;
    public String code;
    public String title;
    public QuestionCategory questionCategory;
    public int duration;
    public Account creator;
    public LocalDate createDate;
    public Question[] questions;
}
