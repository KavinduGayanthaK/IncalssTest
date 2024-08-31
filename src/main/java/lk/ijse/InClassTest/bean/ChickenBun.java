package lk.ijse.InClassTest.bean;

import lk.ijse.InClassTest.contract.Chose;
import org.springframework.stereotype.Component;

@Component
public class ChickenBun implements Chose {
    @Override
    public void choseFood() {
        System.out.println("Chicken Bun");
    }
}
