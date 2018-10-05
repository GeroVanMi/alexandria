package ch.gerovanmi.alexandria.map;

import ch.gerovanmi.alexandria.enums.FieldType;
import ch.gerovanmi.alexandria.enums.RessourceType;

public class Map {
    private int width, heigth;
    private Field[][] fields;

    public Map(int width, int height) {
        this.width = width;
        this.heigth = height;
        fields = new Field[width][height];
    }

    public void generateMap() {
        for(int i = 0; i < width; i++) {
            for(int j = 0; j < heigth; j++) {
                fields[i][j] = new Field(FieldType.PLAIN, i, j, 5, 5, RessourceType.FOOD, 1);
            }
        }
    }
}
