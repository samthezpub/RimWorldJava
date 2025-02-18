package fabrica;

import entity.Faction;

public class FactionEnemyFabrica extends FactionFabrica{
    @Override
    public Faction createFaction(String name) {
        return new Faction(name,  (byte) -100);
    }
}
