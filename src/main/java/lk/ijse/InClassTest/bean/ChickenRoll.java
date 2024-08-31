package lk.ijse.InClassTest.bean;

import lk.ijse.InClassTest.contract.Chose;
import lk.ijse.InClassTest.custom.ChickenROll;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Qualifier
@ChickenROll
public class ChickenRoll implements Chose {
    @Override
    public void choseFood() {
        System.out.println("Chicken Roll");
    }
}
