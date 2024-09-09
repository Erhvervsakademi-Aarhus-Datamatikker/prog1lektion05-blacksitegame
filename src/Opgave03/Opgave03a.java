package Opgave03;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Opgave03a extends Application {
    @Override
    public void start(Stage stage) {
        GridPane root = this.initContent();
        Scene scene = new Scene(root);

        stage.setTitle("Loops");
        stage.setScene(scene);
        stage.show();
    }

    private GridPane initContent() {
        GridPane pane = new GridPane();
        Canvas canvas = new Canvas(200, 200);
        pane.add(canvas, 0, 0);
        this.drawShapes(canvas.getGraphicsContext2D());
        return pane;
    }

    // ------------------------------------------------------------------------

    private void drawShapes(GraphicsContext gc) {
        // Replace the statement here with your code.
        int x1=0;
        int x2=100;
        gc.strokeLine(x1, 20, x2, 20);
        gc.strokeLine(x1, 40, x2, 40);
        gc.strokeLine(x1, 60, x2, 60);
        gc.strokeLine(x1, 80, x2, 80);
        gc.strokeLine(x1, 100, x2, 100);
    }
}
