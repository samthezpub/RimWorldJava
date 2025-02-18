package entity;

import java.util.Objects;

public class Faction {
    private String name;
    private byte relationPercent;

    public Faction(String name, byte relationPercent) {
        this.name = name;
        this.relationPercent = relationPercent;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public byte getRelationPercent() {
        return relationPercent;
    }
    public void setRelationPercent(byte relationPercent) {
        this.relationPercent = relationPercent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Faction faction = (Faction) o;
        return relationPercent == faction.relationPercent && Objects.equals(name, faction.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, relationPercent);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Faction{");
        sb.append("name='").append(name).append('\'');
        sb.append(", relationPercent=").append(relationPercent);
        sb.append('}');
        return sb.toString();
    }
}
