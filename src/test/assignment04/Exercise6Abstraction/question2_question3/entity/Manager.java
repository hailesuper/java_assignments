package test.assignment04.Exercise6Abstraction.question2_question3.entity;

public class Manager extends User {
    public Manager(String name, Double salaryRatio) {
        super(name, salaryRatio);
    }

    @Override
    public Double calculatePay() {
        return salaryRatio * 520;
    }
}
