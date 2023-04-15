import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ShowCircle extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Circle circle = new Circle();
        circle.setRadius(100);
        circle.setFill(Color.PINK);
        circle.setStroke(Color.GREEN);



        StackPane pane = new StackPane();
        pane.getChildren().add(circle);
        StackPane.setAlignment(circle, Pos.CENTER);


        Scene scene = new Scene(pane,500,500);
        primaryStage.setTitle("ShowCircle V2");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
