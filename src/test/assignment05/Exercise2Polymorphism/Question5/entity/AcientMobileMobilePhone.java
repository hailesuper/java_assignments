package test.assignment05.Exercise2Polymorphism.Question5.entity;

public class AcientMobileMobilePhone extends MobilePhone implements IBeAWeapon{
    public AcientMobileMobilePhone(String serialCode) {
        super(serialCode);
    }

    @Override
    public void attack() {
        System.out.println("Acient Mobilephone attacks");
    }

    @Override
    public void answer() {
        System.out.println("Acient Mobilephone answers");
    }

    @Override
    public void call() {
        System.out.println("Acient Mobilephone calls");
    }

    @Override
    public void sendMessage() {
        System.out.println("Acient Mobilephone sends message");
    }

    @Override
    public void receiveMessage() {
        System.out.println("Acient Mobilephone receives message");
    }
}
