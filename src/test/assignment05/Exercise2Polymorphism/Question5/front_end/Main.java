package test.assignment05.Exercise2Polymorphism.Question5.front_end;

import test.assignment04.Exercise6Abstraction.question1.back_end.Phone;
import test.assignment05.Exercise2Polymorphism.Question5.entity.AcientMobileMobilePhone;
import test.assignment05.Exercise2Polymorphism.Question5.entity.MobilePhone;
import test.assignment05.Exercise2Polymorphism.Question5.entity.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<MobilePhone> mobilePhones = new ArrayList<>();
        var myPhone = new Smartphone("iPhone20");
        var grandfatherPhone = new AcientMobileMobilePhone("Nokia Brick");
        mobilePhones.add(myPhone);
        mobilePhones.add(grandfatherPhone);
        for (MobilePhone phone : mobilePhones) {
            System.out.print(phone.getSerialCode());
            if (phone instanceof Smartphone)
                ((Smartphone) phone).attack();
            if (phone instanceof AcientMobileMobilePhone)
                ((AcientMobileMobilePhone) phone).attack();
            phone.receiveMessage();
        }
    }
}
