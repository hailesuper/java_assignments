package test.assignment09.back_end;

import test.assignment09.entity.CPU;
import test.assignment09.entity.Car;

public class Exercise3 {
    public void run() {
    }
    public void question1() {
        var cpu = new CPU(800);
        var processor = cpu.new Processor(10,"Apple Sillicon");
        var ram = cpu.new Ram(32,"Samsung");
        System.out.println(processor.getCache());
        System.out.println(ram.getClockSpeed());
    }

    public void question2() {
        var car = new Car("Mazda","8WD");
        var engine = car.new Engine("Chrysler");
        System.out.println(engine.getEngineType());
    }

    public void question3() {
        System.out.println("Dự đoán output là 2 lần \"Đây là inner class \"");
    }

    public void question4() {
        System.out.println("Dự đoán in ra lần lượt theo các giá trị nhập");
    }
}
