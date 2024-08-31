package lk.ijse.InClassTest.contract;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier


public class FishBun implements Chose{
    @Override
    public void choseFood() {
        System.out.println("Fish Bun");
    }
}
