package ch.gerovanmi.alexandria;

import ch.gerovanmi.alexandria.units.Unit;

import java.util.ArrayList;

public class Nation {
    private String name;
    private int population;
    private ArrayList<Unit> units;
    private ArrayList<Settlement> settlements;

    public Nation(String name) {
        this.name = name;
        population = 10;
        units = new ArrayList<>();
        settlements = new ArrayList<>();
    }
}
