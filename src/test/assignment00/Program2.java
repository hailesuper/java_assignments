package test.assignment00;

import java.time.LocalDate;

public class Program2 {
    public static void main(String[] args) {
//        System.out.println(departments[1].departmentName);
    }

    public static Exam[] exams = importExam();
    public static QuestionType[] questionTypes = importQuestionType();
    public static QuestionCategory[] questionCategories = importQuestionCategory();
    public static Question[] questions = importQuestion();
    public static Answer[] answers = importAnswer();

    static {
        setRelation();
    }

    private static void setRelation() {
        questions[0].questionCategory = questionCategories[0];
        questions[0].questionType = questionTypes[0];
        questions[1].questionCategory = questionCategories[0];
        questions[1].questionType = questionTypes[1];
        questions[2].questionCategory = questionCategories[2];
        questions[2].questionType = questionTypes[0];
        answers[2].question = questions[2];
        answers[0].question = questions[0];
        answers[1].question = questions[1];
        exams[2].questionCategory = questionCategories[2];
        exams[0].questionCategory = questionCategories[0];
        exams[1].questionCategory = questionCategories[2];

        exams[0].questions = new Question[] {questions[0]};
        exams[1].questions = new Question[] {questions[0]};
        exams[2].questions = new Question[] {questions[0]};

        questions[0].exams = new Exam[] {exams[0],exams[1],exams[2]};
    }

     private static QuestionType[] importQuestionType() {
        QuestionType questionType1 = new QuestionType();
        questionType1.typeID = 1;
        questionType1.typeName = QuestionType.TypeName.ESSAY;

        QuestionType questionType2 = new QuestionType();
        questionType2.typeID = 2;
        questionType2.typeName = QuestionType.TypeName.MULTIPLE_CHOICE;

        return new QuestionType[] {questionType1, questionType2};
    }

    private static QuestionCategory[] importQuestionCategory() {
        QuestionCategory questionCategory1 = new QuestionCategory();
        questionCategory1.categoryID = 1;
        questionCategory1.categoryName = "HTML and CSS";

        QuestionCategory questionCategory2 = new QuestionCategory();
        questionCategory2.categoryID = 2;
        questionCategory2.categoryName = "Python";

        QuestionCategory questionCategory3 = new QuestionCategory();
        questionCategory3.categoryID = 3;
        questionCategory3.categoryName = "Java";

        return new QuestionCategory[] {questionCategory1, questionCategory2, questionCategory3};

    }

    private static Question[] importQuestion() {
        Question question1 = new Question();
        question1.questionID = 1;
        question1.content = "What does HTML stand for?";

        question1.createDate = LocalDate.now();

        Question question2 = new Question();
        question2.questionID = 2;
        question2.content = "Describe HTML.";

        question2.createDate = LocalDate.now();

        Question question3 = new Question();
        question3.questionID = 3;
        question3.content = "What does HTML stand for?";

        question3.createDate = LocalDate.now();

        return new Question[] {question1, question2, question3};
    }

    private static Answer[] importAnswer() {
        Answer answer1 = new Answer();
        answer1.answerID = 1;
        answer1.content = "A";
        answer1.isCorrect = true;

        Answer answer2 = new Answer();
        answer2.answerID = 2;
        answer2.content = "B";
        answer2.isCorrect = true;

        Answer answer3 = new Answer();
        answer3.answerID = 3;
        answer3.content = "C";
        answer3.isCorrect = false;

        return new Answer[] {answer1, answer2, answer3};
    }

    private static Exam[] importExam() {
        Exam exam1 = new Exam();
        exam1.examID = 1;
        exam1.code = "GK";
        exam1.title = "Gaokao";
        exam1.duration = 30;
        exam1.createDate = LocalDate.of(2008,1,1);

        Exam exam2 = new Exam();
        exam2.examID = 2;
        exam2.code = "GE";
        exam2.title = "IIT-JEE";
        exam2.duration = 60;
        exam2.createDate = LocalDate.now();
       


        Exam exam3 = new Exam();
        exam3.examID = 3;
        exam3.code = "GE";
        exam3.title = "IIT-JEE";
        exam3.duration = 60;
        exam3.createDate = LocalDate.now();
        

        return new Exam[] {exam1, exam2, exam3};
    }
}