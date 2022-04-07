package test.assignment04.Exercise6Abstraction.question2_question3.entity;

public abstract class User {
    protected String name;
    protected Double salaryRatio;

    public User(String name, Double salaryRatio) {
        this.name = name;
        this.salaryRatio = salaryRatio;
    }

    public abstract Double calculatePay();

    public String displayInfor() {
        return "{" +
                "name='" + name + '\'' +
                ", salary=" + calculatePay() +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalaryRatio() {
        return salaryRatio;
    }

    public void setSalaryRatio(Double salaryRatio) {
        this.salaryRatio = salaryRatio;
    }
}
