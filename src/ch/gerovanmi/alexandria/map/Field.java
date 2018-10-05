package ch.gerovanmi.alexandria.map;


import ch.gerovanmi.alexandria.enums.FieldType;
import ch.gerovanmi.alexandria.enums.RessourceType;

public class Field {
    private FieldType type;
    private String color;
    private int posX, posY;
    private double width, heigth;

    private RessourceType ressourceType;
    private int ressourcesAmount;

    private boolean hasUnit;

    public Field(FieldType type, int posX, int posY, double width, double heigth, RessourceType ressourceType, int ressourcesAmount) {
        this.type = type;
        this.posX = posX;
        this.posY = posY;
        this.width = width;
        this.heigth = heigth;
        this.ressourceType = ressourceType;
        this.ressourcesAmount = ressourcesAmount;
        this.hasUnit = false;
        selectColor();
    }

    public void selectColor() {
        switch (type) {
            case PLAIN: color = "green";
            break;
            case FOREST: color = "darkgreen";
            break;
        }
    }
}