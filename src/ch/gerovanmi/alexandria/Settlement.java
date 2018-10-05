package ch.gerovanmi.alexandria;

import ch.gerovanmi.alexandria.map.Field;

public class Settlement {
    private String name;
    private int population;
    private Field field;

    public Settlement(String name, int population, Field field) {
        this.name = name;
        this.population = population;
        this.field = field;
    }
}
