package test.assignment01;

import java.time.LocalDate;

public class Exam {
    int examID;
    String code;
    String title;
    QuestionCategory questionCategory;
    int duration;
    Account creator;
    LocalDate createDate;
    Question[] questions;
}
