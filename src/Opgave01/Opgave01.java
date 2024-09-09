package Opgave01;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Opgave01 extends Application {
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
        int x1=100;
        int y1=75;
        int x2=100;
        int y2=125;
        int x3=20;
        int y3=50;

        int x_variable=20;
        int y_variable=8;

        gc.strokeLine(x1, y1, x1+x_variable, y1+y_variable);
        gc.strokeLine(x1, y1, x1+x_variable, y1-y_variable);
        gc.strokeLine(x2, y2, x2+x_variable, y2+y_variable);
        gc.strokeLine(x2, y2, x2+x_variable, y2-y_variable);
        gc.strokeLine(x3, y3, x3+x_variable, y3+y_variable);
        gc.strokeLine(x3, y3, x3+x_variable, y3-y_variable);

    }
}
