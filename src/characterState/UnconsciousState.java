package characterState;

import entity.CharacterContext;
import interfaces.CharacterState;

public class UnconsciousState implements CharacterState {
    @Override
    public void performAction(CharacterContext characterContext) {
        System.out.println("Бедняга без сознания");
    }
}
