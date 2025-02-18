package enums;

public enum TileType {
    HILLS("Холмы"),
    SEA("Море"),
    MOUNTAINS("Горы"),

    ;


    private String name;

    TileType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
