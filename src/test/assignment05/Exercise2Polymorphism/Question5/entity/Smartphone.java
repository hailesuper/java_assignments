package test.assignment05.Exercise2Polymorphism.Question5.entity;

public class Smartphone extends MobilePhone implements IBeAWeapon{
    public Smartphone(String serialCode) {
        super(serialCode);
    }

    @Override
    public void attack() {
        System.out.println("Smartphone attacks");
    }

    @Override
    public void answer() {
        System.out.println("Smartphone answers");
    }

    @Override
    public void call() {
        System.out.println("Smartphone calls");
    }

    @Override
    public void sendMessage() {
        System.out.println("Smartphone sends message");
    }

    @Override
    public void receiveMessage() {
        System.out.println("Smartphone receives message");
    }
}
