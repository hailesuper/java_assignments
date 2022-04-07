package test.assignment04.Exercise6Abstraction.question2_question3.entity;

public class Waiter extends User {
    public Waiter(String name, Double salaryRatio) {
        super(name, salaryRatio);
    }

    @Override
    public Double calculatePay() {
        return salaryRatio * 220;
    }
}
