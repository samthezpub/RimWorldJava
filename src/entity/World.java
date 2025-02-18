package entity;

import enums.TileType;
import enums.WorldSize;
import exception.WorldTypeNoSelectedException;
import fabrica.FactionEnemyFabrica;
import fabrica.FactionFriendlyFabrica;
import fabrica.FactionNeutralFabrica;
import settings.Settings;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class World {
    private String name;
    private byte minTemperature;
    private byte maxTemperature;
    private byte populationPercent;
    private byte pollutionPercent;
    private WorldSize size;
    private Tile[][] tiles;

    public World(String name) throws WorldTypeNoSelectedException {
        this.name = name;
        this.minTemperature = (byte) -25;
        this.maxTemperature = (byte) 60;
        this.populationPercent = (byte) 20;
        this.pollutionPercent = (byte) 5;
        this.size = WorldSize.MEDIUM;
        this.tiles = generateTiles();
    }

    private Tile[][] generateTiles() throws WorldTypeNoSelectedException {
        // Вычисляем размер мира в зависимости от типа ENUM,
        // ArrayWidth - ширина массива
        // ArrayHeight - высота массива
        // [*, *, *]
        // [*, *, *] - пример массива с высотой 3 и шириной 3
        // [*, *, *]
        int arraySize = 0;
        int arrayWidth = 0;
        int arrayHeight = 0;
        switch (size){
            case SMALL -> {
                arrayWidth = 6;
                arrayHeight = 6;
                break;
            }
            case MEDIUM -> {
                arrayWidth = 9;
                arrayHeight = 9;
                break;
            }
            case LARGE -> {
                arrayWidth = 16;
                arrayHeight = 16;
                break;
            }
            case null, default -> {
                throw new WorldTypeNoSelectedException("Тип мира не выбран!");
            }
        }

        arraySize = arrayHeight * arrayWidth;

        // Заполняем плитками
        Tile[][] tiles = new Tile[arrayWidth][arrayHeight];

        for (int i = 0; i < arrayWidth; i++) {
            for (int j = 0; j < arrayHeight; j++) {
                // Продумываем логику плодородности почвы у плитки
                // По сути 100% - процент загрязнения
                // Если минимальная температура меньше 10 градусов, то 0
                // Если максимальная температура больше 60 градусов, то 0
                byte fertilityPercent = 100;
                if (minTemperature < 10 || maxTemperature > 60){
                    fertilityPercent = 0;
                }
                else{
                    fertilityPercent = (byte) (100 - pollutionPercent);
                }

                // Генерим фракцию, абсолютно случайно, в зависимости от процента оставляем плитку пустой или заполненой фракцией
                Random random = new Random();
                Faction faction = null;
                int randomValue =  random.nextInt(100);
                if (randomValue < populationPercent){

                    int fractionTypeRand = random.nextInt(3);
                    int fractionNameRand = random.nextInt(Settings.FACTION_NAMES.length);
                    String factionName = Settings.FACTION_NAMES[fractionNameRand];


                    switch (fractionTypeRand){
                        case 0 -> {
                           faction = new FactionNeutralFabrica().createFaction(factionName);
                        }
                        case 1 -> {
                            faction = new FactionEnemyFabrica().createFaction(factionName);
                        }
                        case 2 -> {
                            faction = new FactionFriendlyFabrica().createFaction(factionName);
                        }
                    }
                }

                tiles[i][j] = new Tile(fertilityPercent, pollutionPercent, TileType.randomType(), faction, minTemperature, maxTemperature);
            }
        }

        return tiles;
    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("World{");
        sb.append("name='").append(name).append('\'');
        sb.append(", minTemperature=").append(minTemperature);
        sb.append(", maxTemperature=").append(maxTemperature);
        sb.append(", populationPercent=").append(populationPercent);
        sb.append(", pollutionPercent=").append(pollutionPercent);
        sb.append(", size=").append(size);
        sb.append(", tiles=").append(Arrays.stream(tiles)  // Преобразуем в Stream<Tile[]>
                .flatMap(Arrays::stream)  // Разворачиваем Tile[][] в Stream<Tile>
                .map(Tile::toString)  // Вызываем toString() у каждого Tile
                .collect(Collectors.joining(", ", "[", "]"))); // Собираем в строку
        sb.append('}');
        return sb.toString();
    }
}
