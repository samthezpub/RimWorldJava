package enums;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

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

    private static final List<TileType> VALUES =
            Collections.unmodifiableList(Arrays.asList(values()));
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    public static TileType randomType()  {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }
}
