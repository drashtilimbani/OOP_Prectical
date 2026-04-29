import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.geometry.Insets;

public class BarChartFX extends Application {
    public void start(Stage stage) {
        HBox root = new HBox(20);
        root.setAlignment(Pos.BOTTOM_CENTER);
        root.setPadding(new Insets(20));

        root.getChildren().add(createBar("Projects - 20%", 20, Color.RED));
        root.getChildren().add(createBar("Quizzes - 10%", 10, Color.BLUE));
        root.getChildren().add(createBar("Midterm Exams - 30%", 30, Color.GREEN));
        root.getChildren().add(createBar("Final Exam - 40%", 40, Color.ORANGE));

        Scene scene = new Scene(root, 500, 400);
        stage.setScene(scene);
        stage.setTitle("Grade Distribution");
        stage.show();
    }

    private VBox createBar(String text, int value, Color color) {
        Rectangle rect = new Rectangle(60, value * 5);
        rect.setFill(color);

        Label label = new Label(text);

        VBox box = new VBox(10);
        box.setAlignment(Pos.BOTTOM_CENTER);
        box.getChildren().addAll(rect, label);

        return box;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
