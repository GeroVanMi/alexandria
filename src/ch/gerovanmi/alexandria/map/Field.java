package ch.gerovanmi.alexandria.map;


import ch.gerovanmi.alexandria.enums.FieldType;

public class Field {
    private FieldType type;
    private String color;
    private int posX, posY;
    private double width, heigth;

    private String ressourceType;
    private int ressourcesAmount;

    private boolean hasUnit;

    public Field(FieldType type, int posX, int posY, double width, double heigth, String ressourceType, int ressourcesAmount) {
        this.type = type;
        this.posX = posX;
        this.posY = posY;
        this.width = width;
        this.heigth = heigth;
        this.ressourceType = ressourceType;
        this.ressourcesAmount = ressourcesAmount;
        this.hasUnit = false;
    }
}