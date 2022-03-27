package test.assignment00;

import java.time.LocalDate;

public class Program {
    public static void main(String[] args) {
        System.out.println(departments[1].departmentName);
    }

    public static Department[] departments = new Department[] {importDepartment1(), importDepartment2(), importDepartment3()};
    public static Position[] positions = new Position[] {importPosition1(), importPosition2(), importPosition3()};
    public static Account[] accounts = new Account[] {importAccount1(), importAccount2(), importAccount3()};
    public static Group[] groups = importGroup();
    public static QuestionType[] questionTypes = importQuestionType();
    public static QuestionCategory[] questionCategories = importQuestionCategory();
    public static Question[] questions = importQuestion();
    public static Answer[] answers = importAnswer();
    public static Exam[] exams = importExam();


    private static Department importDepartment1() {
        Department department1 = new Department();
        department1.departmentID = 1;
        department1.departmentName = "Ban giám đốc";
        return department1;
    }

    private static Department importDepartment2() {
        Department department2 = new Department();
        department2.departmentID = 2;
        department2.departmentName = "Marketing";
        return department2;
    }

    private static Department importDepartment3() {
        Department department3 = new Department();
        department3.departmentID = 3;
        department3.departmentName = "Sales";
        return department3;
    }
    
    private static Position importPosition1() {
        Position position1 = new Position();
        position1.positionID = 1;
        position1.positionName = Position.PositionName.DEV;
        return position1;
    }

    private static Position importPosition2() {
        Position position2 = new Position();
        position2.positionID = 2;
        position2.positionName = Position.PositionName.SCRUM_MASTER;
        return position2;
    }

    private static Position importPosition3() {
        Position position3 = new Position();
        position3.positionID = 3;
        position3.positionName = Position.PositionName.TESTER;
        return position3;
    }
    
    private static Account importAccount1() {
        Account account1 = new Account();
        account1.accountID = 1;
        account1.username = "hai1";
        account1.fullName = "Le Van Hai";
        account1.position = positions[0];
        account1.email = "hai@gmail.com";
        account1.department = departments[0];
        account1.createDate = LocalDate.now();
        return account1;
    }

    private static Account importAccount2() {
        Account account2 = new Account();
        account2.accountID = 2;
        account2.username = "hai2";
        account2.fullName = "Le Van Hai 2";
        account2.position = positions[1];
        account2.email = "hai2@gmail.com";
        account2.department = departments[1];
        account2.createDate = LocalDate.of(2009,4,12);
        return account2;
    }

    private static Account importAccount3() {
        Account account3 = new Account();
        account3.accountID = 3;
        account3.username = "hai3";
        account3.fullName = "Le Van Hai 2";
        account3.position = positions[2];
        account3.department = departments[2];
        account3.email = "hai3@gmail.com";
        account3.createDate = LocalDate.of(2018,12,31);
        return account3;
    }
    
    private static Group[] importGroup() {
        int[] a = new int[1000];
        Group group1 = new Group();
        group1.groupID = 1;
        group1.groupName = "Army";
        group1.creator = accounts[0];
        group1.createDate = LocalDate.of(2022,9,12);
        group1.accounts = new Account[] {accounts[0], accounts[1]};

        Group group2 = new Group();
        group2.groupID = 2;
        group2.groupName = "The Nerd Herd";
        group2.creator = accounts[1];
        group2.createDate = LocalDate.now();
        group2.accounts = new Account[] {accounts[1]};

        Group group3 = new Group();
        group3.groupID = 3;
        group3.groupName = "Fantastic Four";
        group3.creator = accounts[1];
        group3.createDate = LocalDate.of(2021,7,12);
        group3.accounts = new Account[] {accounts[2],accounts[1], accounts[0]};
        return new Group[] {group1, group2, group3};
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
        question1.questionCategory = questionCategories[0];
        question1.questionType = questionTypes[0];
        question1.creator = accounts[0];
        question1.createDate = LocalDate.now();

        Question question2 = new Question();
        question2.questionID = 2;
        question2.content = "Describe HTML.";
        question2.questionCategory = questionCategories[0];
        question2.questionType = questionTypes[1];
        question2.creator = accounts[1];
        question2.createDate = LocalDate.now();

        Question question3 = new Question();
        question3.questionID = 3;
        question3.content = "What does HTML stand for?";
        question3.questionCategory = questionCategories[2];
        question3.questionType = questionTypes[0];
        question3.creator = accounts[2];
        question3.createDate = LocalDate.now();

        return new Question[] {question1, question2, question3};
    }

    private static Answer[] importAnswer() {
        Answer answer1 = new Answer();
        answer1.answerID = 1;
        answer1.content = "A";
        answer1.question = questions[0];
        answer1.isCorrect = true;

        Answer answer2 = new Answer();
        answer2.answerID = 2;
        answer2.content = "B";
//        answer2.question = questions[1];
        answer2.isCorrect = true;

        Answer answer3 = new Answer();
        answer3.answerID = 3;
        answer3.content = "C";
//        answer3.question = questions[2];
        answer3.isCorrect = false;

        return new Answer[] {answer1, answer2, answer3};
    }

    private static Exam[] importExam() {
        Exam exam1 = new Exam();
        exam1.examID = 1;
        exam1.code = "GK";
        exam1.title = "Gaokao";
        exam1.questionCategory = questionCategories[0];
        exam1.duration = 30;
        exam1.creator = accounts[0];
        exam1.createDate = LocalDate.of(2008,1,1);
        exam1.questions = new Question[] {questions[0], questions[1]};

        Exam exam2 = new Exam();
        exam2.examID = 2;
        exam2.code = "GE";
        exam2.title = "IIT-JEE";
        exam2.questionCategory = questionCategories[2];
        exam2.duration = 60;
        exam2.creator = accounts[1];
        exam2.createDate = LocalDate.now();
//        exam2.questions = new Question[] {questions[0], questions[2]};


        Exam exam3 = new Exam();
        exam3.examID = 3;
        exam3.code = "GE";
        exam3.title = "IIT-JEE";
        exam3.questionCategory = questionCategories[2];
        exam3.duration = 60;
        exam3.creator = accounts[2];
        exam3.createDate = LocalDate.now();
        exam3.questions = new Question[] {questions[0], questions[1], questions[2]};

        return new Exam[] {exam1, exam2, exam3};
    }
}