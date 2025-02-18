package fabrica;

import entity.Faction;

public class FactionNeutralFabrica extends FactionFabrica{
    @Override
    public Faction createFaction(String name) {
        return new Faction(name,  (byte) 0);
    }
}
