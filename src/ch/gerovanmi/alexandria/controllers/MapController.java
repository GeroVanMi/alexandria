package ch.gerovanmi.alexandria.controllers;

import ch.gerovanmi.alexandria.map.Field;
import ch.gerovanmi.alexandria.map.Map;
import javafx.scene.canvas.GraphicsContext;

public class MapController {
    Map map;
    GraphicsContext gc;

    public MapController(GraphicsContext gc, Map map) {
        this.gc = gc;
        this.map = map;
    }

    public void renderMap() {
        for(int i = 0; i < map.getxRange(); i++) {
            for(int j = 0; j < map.getyRange(); j++) {
                Field f = map.getFields()[i][j];
                gc.strokeRect(f.getPosX(), f.getPosY(), map.getGlobalFieldWidth(), map.getGlobalFieldHeigth());
            }
        }
    }

}
