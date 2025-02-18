package entity;

import enums.TileType;

import java.util.Objects;

public class Tile {
    private byte fertilityPercent;
    private byte pollutionPercent;
    private TileType type;
    private Faction faction;
    private byte minTemperature;
    private byte maxTemperature;

    public Tile(byte fertilityPercent, byte pollutionPercent, TileType type, Faction faction, byte minTemperature, byte maxTemperature) {
        this.fertilityPercent = fertilityPercent;
        this.pollutionPercent = pollutionPercent;
        this.type = type;
        this.faction = faction;
        this.minTemperature = minTemperature;
        this.maxTemperature = maxTemperature;
    }


    public byte getFertilityPercent() {
        return fertilityPercent;
    }
    public void setFertilityPercent(byte fertilityPercent) {
        this.fertilityPercent = fertilityPercent;
    }
    public byte getPollutionPercent() {
        return pollutionPercent;
    }
    public void setPollutionPercent(byte pollutionPercent) {
        this.pollutionPercent = pollutionPercent;
    }
    public TileType getType() {
        return type;
    }
    public void setType(TileType type) {
        this.type = type;
    }
    public Faction getFaction() {
        return faction;
    }
    public void setFaction(Faction faction) {
        this.faction = faction;
    }
    public byte getMinTemperature() {
        return minTemperature;
    }
    public void setMinTemperature(byte minTemperature) {
        this.minTemperature = minTemperature;
    }
    public byte getMaxTemperature() {
        return maxTemperature;
    }
    public void setMaxTemperature(byte maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tile tile = (Tile) o;
        return fertilityPercent == tile.fertilityPercent && pollutionPercent == tile.pollutionPercent && minTemperature == tile.minTemperature && maxTemperature == tile.maxTemperature && type == tile.type && Objects.equals(faction, tile.faction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fertilityPercent, pollutionPercent, type, faction, minTemperature, maxTemperature);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Tile{");
        sb.append("fertilityPercent=").append(fertilityPercent);
        sb.append(", pollutionPercent=").append(pollutionPercent);
        sb.append(", type=").append(type);
        sb.append(", faction=").append(faction);
        sb.append(", minTemperature=").append(minTemperature);
        sb.append(", maxTemperature=").append(maxTemperature);
        sb.append('}');
        return sb.toString();
    }
}
