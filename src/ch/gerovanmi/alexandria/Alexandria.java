package ch.gerovanmi.alexandria;

import ch.gerovanmi.alexandria.views.View;
import javafx.application.Application;
import javafx.stage.Stage;

public class Alexandria  extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        View mapView = new View();
        primaryStage.setScene(mapView.getScene());
        primaryStage.show();
    }
}