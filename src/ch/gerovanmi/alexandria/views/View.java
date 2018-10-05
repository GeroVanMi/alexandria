package ch.gerovanmi.alexandria.views;

import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;

public class View {
    private Scene scene;
    private Pane pane;
    private Canvas canvas;
    private GraphicsContext gc;

    public View() {
        this.canvas = new Canvas(900, 1080);
        gc = canvas.getGraphicsContext2D();
        this.pane = new Pane(canvas);
        this.pane.setPrefSize(900, 1080);
        this.scene = new Scene(pane);
    }

    public Scene getScene() {
        return scene;
    }
}
