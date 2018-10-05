package ch.gerovanmi.alexandria.map;

import ch.gerovanmi.alexandria.enums.FieldType;
import ch.gerovanmi.alexandria.enums.RessourceType;

public class Map {
    private int xRange, yRange;
    private double globalFieldWidth, globalFieldHeigth;
    private Field[][] fields;

    public Map(int xRange, int yRange, int globalFieldWidth, int globalFieldHeigth) {
        this.xRange = xRange;
        this.yRange = yRange;
        this.globalFieldWidth = globalFieldWidth;
        this.globalFieldHeigth = globalFieldHeigth;
        fields = new Field[xRange][yRange];
    }

    public void generateMap() {
        for(int i = 0; i < xRange; i++) {
            for(int j = 0; j < yRange; j++) {
                fields[i][j] = new Field(FieldType.PLAIN, i, j, RessourceType.FOOD, 1);
            }
        }
    }

    public Field[][] getFields() {
        return fields;
    }

    public int getxRange() {
        return xRange;
    }

    public int getyRange() {
        return yRange;
    }

    public double getGlobalFieldWidth() {
        return globalFieldWidth;
    }

    public double getGlobalFieldHeigth() {
        return globalFieldHeigth;
    }
}
