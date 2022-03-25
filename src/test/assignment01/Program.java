package test.assignment01;

import java.time.LocalDate;
import test.assignment01.QuestionType.TypeName;

public class Program {
    public static void main(String[] args) {
        /* PRINT DATA */
//        System.out.println(department1);
//        System.out.println(department1.departmentName);
    }

    public static void importData() {
        // Departments
        Department department1 = new Department();
        department1.departmentID = 1;
        department1.departmentName = "Ban giám đốc";

        Department department2 = new Department();
        department1.departmentID = 2;
        department1.departmentName = "Marketing";

        Department department3 = new Department();
        department1.departmentID = 3;
        department1.departmentName = "Sales";

        // Positions
        Position position1 = new Position();
        Position position2 = new Position();
        Position position3 = new Position();
        Position position4 = new Position();

        position1.positionID = 1;
        position2.positionID = 2;
        position3.positionID = 3;
        position4.positionID = 4;

        position1.positionName = "Dev";
        position2.positionName = "Test";
        position3.positionName = "Scrum Master";
        position4.positionName = "PM";

        // Accounts
        Account account1 = new Account();
        Account account2 = new Account();
        Account account3 = new Account();
        Account account4 = new Account();

        account1.accountID = 1;
        account1.accountID = 2;
        account1.accountID = 3;
        account1.accountID = 4;

        account1.createDate = LocalDate.of(2020,03,22);
        account2.createDate = LocalDate.of(2021,11,2);
        account3.createDate = LocalDate.of(2022,03,06);
        account4.createDate = LocalDate.now();

        account1.department = department1;
        account2.department = department1;
        account3.department = department2;
        account4.department = department3;

        account1.email = "kattie.corkery@yahoo.com";
        account2.email = "aleen57@hotmail.com";
        account3.email = "grimes.alek@hotmail.com";
        account4.email = "cleveland.schneider@williamson.com";

        account1.fullName = "Phạm Thiên An";
        account1.fullName = "Trần Ngọc Bảo";
        account1.fullName = "Hoàng Nguyễn Phúc Nguyên Chương";
        account1.fullName = "Nguyễn Thanh Danh";

        account1.position = position1;
        account2.position = position2;
        account3.position = position1;
        account4.position = position4;

        account1.username = "dutyhungarian";
        account1.username = "toupeeaustralian";
        account1.username = "bowyangslovakian";
        account1.username = "rickshawliberian";

        // Groups
        Group group1 = new Group();
        group1.groupID = 1;
        group1.groupName = "Dumbledore' Army.";
        group1.creator = account1;
        group1.createDate = LocalDate.of(2022,9,12);
        group1.accounts = new Account[] {account1, account2};

        Group group2 = new Group();
        group2.groupID = 2;
        group2.groupName = "The Nerd Herd   1";
        group2.creator = account2;
        group2.createDate = LocalDate.now();
        group2.accounts = new Account[] {account1, account3};


        Group group3 = new Group();
        group3.groupID = 3;
        group3.groupName = "Fantastic Four";
        group3.creator = account1;
        group3.createDate = LocalDate.of(2021,7,12);
        group3.accounts = new Account[] {account3};

        // QuestionType
        QuestionType questionType1 = new QuestionType();
        questionType1.typeID = 1;
        questionType1.typeName = TypeName.ESSAY;

        QuestionType questionType2 = new QuestionType();
        questionType2.typeID = 2;
        questionType2.typeName = TypeName.MULTIPLE_CHOICE;

        // QuestionCategory
        QuestionCategory questionCategory1 = new QuestionCategory();
        questionCategory1.categoryID = 1;
        questionCategory1.categoryName = "HTML and CSS";

        QuestionCategory questionCategory2 = new QuestionCategory();
        questionCategory2.categoryID = 2;
        questionCategory2.categoryName = "Python";

        QuestionCategory questionCategory3 = new QuestionCategory();
        questionCategory3.categoryID = 3;
        questionCategory3.categoryName = "Java";

        // Question
        Question question1 = new Question();
        question1.questionID = 1;
        question1.content = "What does HTML stand for?";
        question1.questionCategory = questionCategory1;
        question1.questionType = questionType1;
        question1.creator = account1;
        question1.createDate = LocalDate.now();

        Question question2 = new Question();
        question2.questionID = 2;
        question2.content = "Describe HTML.";
        question2.questionCategory = questionCategory1;
        question2.questionType = questionType2;
        question2.creator = account2;
        question2.createDate = LocalDate.now();

        Question question3 = new Question();
        question3.questionID = 3;
        question3.content = "What does HTML stand for?";
        question3.questionCategory = questionCategory3;
        question3.questionType = questionType1;
        question3.creator = account3;
        question3.createDate = LocalDate.now();

        // Answer
        Answer answer1 = new Answer();
        answer1.answerID = 1;
        answer1.content = "A";
        answer1.question = question1;
        answer1.isCorrect = true;

        Answer answer2 = new Answer();
        answer2.answerID = 2;
        answer2.content = "B";
        answer2.question = question2;
        answer2.isCorrect = true;

        Answer answer3 = new Answer();
        answer3.answerID = 3;
        answer3.content = "C";
        answer3.question = question3;
        answer3.isCorrect = false;

        // Exam
        Exam exam1 = new Exam();
        exam1.examID = 1;
        exam1.code = "GK";
        exam1.title = "Gaokao";
        exam1.questionCategory = questionCategory1;
        exam1.duration = 30;
        exam1.creator = account1;
        exam1.createDate = LocalDate.of(2008,1,1);
        exam1.questions = new Question[] {question1, question2};

        Exam exam2 = new Exam();
        exam2.examID = 2;
        exam2.code = "GE";
        exam2.title = "IIT-JEE";
        exam2.questionCategory = questionCategory3;
        exam2.duration = 60;
        exam2.creator = account2;
        exam2.createDate = LocalDate.now();
        exam2.questions = new Question[] {question1, question3};


        Exam exam3 = new Exam();
        exam3.examID = 3;
        exam3.code = "GE";
        exam3.title = "IIT-JEE";
        exam3.questionCategory = questionCategory3;
        exam3.duration = 60;
        exam3.creator = account3;
        exam3.createDate = LocalDate.now();
        exam3.questions = new Question[] {question1, question2, question3};
        // ExamQuestion

        System.out.println(department1);
        System.out.println(department1.departmentName);



    }
}