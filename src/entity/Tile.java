package entity;

import enums.TileType;

import java.util.Objects;

public class Tile {
    private byte fertilityPercent;
    private byte pollutionPercent;
    private byte populationPercent;
    private TileType type;

    public Tile(byte fertilityPercent, byte pollutionPercent, byte populationPercent, TileType type) {
        this.fertilityPercent = fertilityPercent;
        this.pollutionPercent = pollutionPercent;
        this.populationPercent = populationPercent;
        this.type = type;
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
    public byte getPopulationPercent() {
        return populationPercent;
    }
    public void setPopulationPercent(byte populationPercent) {
        this.populationPercent = populationPercent;
    }
    public TileType getType() {
        return type;
    }
    public void setType(TileType type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tile tile = (Tile) o;
        return fertilityPercent == tile.fertilityPercent && pollutionPercent == tile.pollutionPercent && populationPercent == tile.populationPercent && type == tile.type;
    }
    @Override
    public int hashCode() {
        return Objects.hash(fertilityPercent, pollutionPercent, populationPercent, type);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Tile{");
        sb.append("fertilityPercent=").append(fertilityPercent);
        sb.append(", pollutionPercent=").append(pollutionPercent);
        sb.append(", populationPercent=").append(populationPercent);
        sb.append(", type=").append(type);
        sb.append('}');
        return sb.toString();
    }
}
