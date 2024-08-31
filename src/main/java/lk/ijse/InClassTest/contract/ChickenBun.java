package lk.ijse.InClassTest.contract;

import org.springframework.stereotype.Component;

@Component
public class ChickenBun implements Chose{
    @Override
    public void choseFood() {
        System.out.println("Chicken Bun");
    }
}
