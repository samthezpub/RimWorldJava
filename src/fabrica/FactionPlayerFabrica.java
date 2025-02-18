package fabrica;

import entity.Faction;

public class FactionPlayerFabrica extends FactionFabrica{
    @Override
    public Faction createFaction(String name) {
        return new Faction(name,  (byte) 100);
    }
}
