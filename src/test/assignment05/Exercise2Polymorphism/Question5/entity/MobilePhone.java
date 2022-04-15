package test.assignment05.Exercise2Polymorphism.Question5.entity;

public abstract class MobilePhone {
    protected String serialCode;
    public abstract void answer();
    public abstract void call();
    public abstract void sendMessage();
    public abstract void receiveMessage();

    public String getSerialCode() {
        return serialCode;
    }

    public MobilePhone(String serialCode) {
        this.serialCode = serialCode;
    }
}
