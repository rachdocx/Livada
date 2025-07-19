import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextInputDialog;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Optional;

import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;
import org.bson.Document;


public class Main extends Application {
    private MongoCollection<Document> players;
    @Override
    public void start(Stage primaryStage) {
        MongoClient client = MongoClients.create("mongodb://localhost:27017");
        MongoDatabase db = client.getDatabase("gameDB");
        players = db.getCollection("players");

        // scena 1 principala
        Button btnManagePlayers = new Button("Manage Players");
        StackPane root1 = new StackPane(btnManagePlayers);
        Scene scene1 = new Scene(root1, 400, 300);

        // scena 2 manage players
        Button btnAddPlayer = new Button("Add Player");
        Button btnBack = new Button("Back");

        VBox root2 = new VBox(15, btnAddPlayer, btnBack);
        root2.setAlignment(Pos.CENTER);
        Scene scene2 = new Scene(root2, 400, 300);

        btnManagePlayers.setOnAction(e -> {
            primaryStage.setScene(scene2);
        });

        btnBack.setOnAction(e -> {
            primaryStage.setScene(scene1);
        });

        btnAddPlayer.setOnAction(e -> {
            String name = getTextFromUser("Enter player name:");
            String gender = getTextFromUser("Enter player gender:");
            int luck = getIntFromUser("Enter player luck (integer):");
            int storage = getIntFromUser("Enter player storage (integer):");
            String special = getTextFromUser("Enter player special ability:");
            if (name != null && gender != null && special != null && luck >= 0 && storage >= 0) {

                Document doc = new Document("name", name)
                        .append("gender", gender)
                        .append("luck", luck)
                        .append("storage", storage)
                        .append("special", special);
                players.insertOne(doc);

            } else {
                System.out.println("Player creation cancelled or invalid input.");
            }
        });

        primaryStage.setTitle("JavaFX Example");
        primaryStage.setScene(scene1);
        primaryStage.show();
    }


    private String getTextFromUser(String message) {
        TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle("Input Required");
        dialog.setHeaderText(null);
        dialog.setContentText(message);
        Optional<String> result = dialog.showAndWait();
        return result.orElse(null);
    }

    private int getIntFromUser(String message) {
        while (true) {
            String input = getTextFromUser(message);
            if (input == null) return -1; // anulare
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid number, try again.");
            }
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
