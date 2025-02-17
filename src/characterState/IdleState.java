package characterState;

import entity.CharacterContext;
import interfaces.CharacterState;

public class IdleState implements CharacterState {
    @Override
    public void performAction(CharacterContext characterContext) {
        // TODO сделать Обычная деятельность зависящая от профессии
        System.out.println("Обычная деятельность зависящая от профессии");
    }
}
