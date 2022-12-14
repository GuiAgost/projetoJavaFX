package layout;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class AppLayout extends Application {

    private Stage janela;
    private Scene cenaMenu;

    @Override
    public void start(Stage stage){
        janela = stage;
        menu();

        janela.setScene(cenaMenu);
        janela.setTitle("Gerenciadores de Layout :: Menu");
        janela.show();
    }

    private void menu(){
        Button anchorPane = new Button("TesteAnchorPane");
        anchorPane.setOnAction(e -> {
            Parent raiz = new TesteAnchorPane();
            Scene principal = new Scene(raiz, 600, 400);
            raiz.setOnMousePressed(clickRight -> janela.setScene(cenaMenu));
            janela.setScene(principal);
            janela.setTitle("Wizard :: AnchorPane");
        });

        Button borderPane = new Button("TesteBorderPane");
        borderPane.setOnAction(e -> {
            Parent raiz = new TesteBorderPane();
            Scene principal = new Scene(raiz, 600, 400);
            raiz.setOnMousePressed(clickRight -> janela.setScene(cenaMenu));
            janela.setScene(principal);
            janela.setTitle("Wizard :: BorderPane");
        });

        Button flowPane = new Button("TesteFlowPane");
        flowPane.setOnAction(e -> {
            Parent raiz = new TesteFlowPane();
            Scene principal = new Scene(raiz, 600, 400);
            raiz.setOnMousePressed(clickRight -> janela.setScene(cenaMenu));
            janela.setScene(principal);
            janela.setTitle("Wizard :: FlowPane");
        });

        Button gridPane = new Button("TesteGridPane");
        gridPane.setOnAction(e -> {
            Parent raiz = new TesteGridPane();
            Scene principal = new Scene(raiz, 600, 400);
            raiz.setOnMousePressed(clickRight -> janela.setScene(cenaMenu));
            janela.setScene(principal);
            janela.setTitle("Wizard :: GridPane");
        });

        Button stackPane = new Button("TesteStackPane");
        stackPane.setOnAction(e -> {
            Parent raiz = new TesteStackPane();
            Scene principal = new Scene(raiz, 600, 400);
            raiz.setOnMousePressed(clickRight -> janela.setScene(cenaMenu));
            janela.setScene(principal);
            janela.setTitle("Wizard :: StackPane");
        });

        Button tilePane = new Button("TesteTilePane");
        tilePane.setOnAction(e -> {
            Parent raiz = new TesteTilePane();
            Scene principal = new Scene(raiz, 600, 400);
            raiz.setOnMousePressed(clickRight -> janela.setScene(cenaMenu));
            janela.setScene(principal);
            janela.setTitle("Wizard :: StackPane");
        });

        VBox box = new VBox(); // Botão vertical
        //HBox box = new HBox(); // Botão horizontal
        box.setAlignment(Pos.CENTER);
        box.setSpacing(10);

        Label labelTitulo = new Label("Escolha os layouts:");
        labelTitulo.setFont(new Font(24));

        box.getChildren().add(labelTitulo);
        box.getChildren().add(anchorPane);
        box.getChildren().add(borderPane);
        box.getChildren().add(flowPane);
        box.getChildren().add(gridPane);
        box.getChildren().add(stackPane);
        box.getChildren().add(tilePane);

       cenaMenu = new Scene(box, 400, 250);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
