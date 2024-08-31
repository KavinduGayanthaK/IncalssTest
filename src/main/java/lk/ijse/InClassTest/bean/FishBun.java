package lk.ijse.InClassTest.bean;

import lk.ijse.InClassTest.contract.Chose;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Qualifier


public class FishBun implements Chose {
    @Override
    public void choseFood() {
        System.out.println("Fish Bun");
    }
}
