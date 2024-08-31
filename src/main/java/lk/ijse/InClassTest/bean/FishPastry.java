package lk.ijse.InClassTest.bean;

import lk.ijse.InClassTest.contract.Chose;
import org.springframework.stereotype.Component;

import javax.swing.*;

@Component
public class FishPastry implements Chose {
    @Override
    public void choseFood() {
        System.out.println("Fish Pastry");
    }
}
