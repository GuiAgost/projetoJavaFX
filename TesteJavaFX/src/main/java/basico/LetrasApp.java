package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class LetrasApp extends Application {
    @Override
    public void start(Stage stage) {
        //FXMLLoader fxmlLoader = new FXMLLoader(LetrasApp.class.getResource("hello-view.fxml"));

        Button botaoA = new Button("A");
        Button botaoB = new Button("B");
        Button botaoC = new Button("C");

        botaoA.setOnAction(e -> System.out.println("A"));
        botaoB.setOnAction(e -> System.out.println("B"));
        botaoC.setOnAction(e -> System.exit(0));

        HBox box = new HBox();
        box.setAlignment(Pos.CENTER);
        box.setSpacing(10);
        box.getChildren().add(botaoA);
        box.getChildren().add(botaoB);
        box.getChildren().add(botaoC);


        stage.setTitle("Hello!");

        //Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        Scene scene2 = new Scene(box, 320, 240);

        stage.setScene(scene2);
        //stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}

// https://www.youtube.com/watch?v=d_hc_3B1iVQ