package ch.gerovanmi.alexandria.units;

public abstract class Unit {
    private int posX, posY, movesPerTurn, movesLeft, healthpoints;

    public Unit(int posX, int posY, int movesPerTurn, int healthpoints) {
        this.posX = posX;
        this.posY = posY;
        this.movesPerTurn = movesPerTurn;
        this.healthpoints = healthpoints;
        this.movesLeft = movesPerTurn;
    }
}
