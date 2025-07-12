import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.geometry.Pos;

public class Main extends Application {
    private Label messageLabel;
    private int nr = 0;
    @Override
    public void start(Stage primaryStage) {
        Player gabi = new Player("Gabi", "M", 2, 3,"Ie prost tare");
        Player alina = new Player("Alibul", "F", 2, 4,"Mai face canto");
        Button btnPlayer = new Button("Show Players");
        messageLabel = new Label("");

        btnPlayer.setOnAction(e -> {
            messageLabel.setText(alina.toString());

            if(nr ==1)
                messageLabel.setText(alina.toString() + "\n" + gabi.toString());

            nr+=1;
        });
        VBox root = new VBox(10);
        root.getChildren().addAll(btnPlayer, messageLabel);
        root.setAlignment(Pos.CENTER);

        Scene scene = new Scene(root, 400, 200);

        primaryStage.setTitle("Livada Arcca");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
       launch();
    }
}
