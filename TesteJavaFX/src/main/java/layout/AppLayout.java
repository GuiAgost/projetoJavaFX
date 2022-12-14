package layout;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class AppLayout extends Application {

    private Stage janela;
    private Scene cenaMenu;

    @Override
    public void start(Stage stage){
//        VBox temp = new VBox();
//        temp.getChildren().add(new Caixa().comTexto("1"));
//        temp.getChildren().add(new Caixa().comTexto("2"));
//        temp.getChildren().add(new Caixa().comTexto("3"));
//        temp.getChildren().add(new Caixa().comTexto("4"));
//        temp.getChildren().add(new Caixa().comTexto("5"));
//        temp.getChildren().add(new Caixa().comTexto("6"));
//        temp.getChildren().add(new Caixa().comTexto("7"));
//        Scene principal = new Scene(temp, 800, 600);
//        stage.setScene(principal);

        // UMA IDEIA: PODERIA CRIAR UM MENU!!
        //Parent raiz = new TesteAnchorPane();
        //Parent raiz = new TesteBorderPane();
        //Parent raiz = new TesteFlowPane();
        //Scene principal = new Scene(raiz, 800, 600);
        janela = stage;
        menu();

        janela.setScene(cenaMenu);
        janela.setTitle("Wizard :: Menu");
        janela.show();

        //stage.setScene(principal);
        //stage.setTitle("Gerenciadores de Layout");
        //stage.show();

    }

    private void menu(){
        Button anchorPane = new Button("TesteAnchorPane");
        anchorPane.setOnAction(e -> {
            Parent raiz = new TesteAnchorPane();
            Scene principal = new Scene(raiz, 800, 600);
            janela.setScene(principal);
            janela.setTitle("Wizard :: AnchorPane");
        });

        Button borderPane = new Button("TesteBorderPane");
        borderPane.setOnAction(e -> {
            Parent raiz = new TesteBorderPane();
            Scene principal = new Scene(raiz, 800, 600);
            janela.setScene(principal);
            janela.setTitle("Wizard :: BorderPane");
        });

        Button flowPane = new Button("TesteFlowPane");
        flowPane.setOnAction(e -> {
            Parent raiz = new TesteFlowPane();
            Scene principal = new Scene(raiz, 800, 600);
            janela.setScene(principal);
            janela.setTitle("Wizard :: FlowPane");
        });

        HBox box = new HBox();
        box.setAlignment(Pos.CENTER);
        box.setSpacing(10);

        Label labelTitulo = new Label("Escolha os itens:");
        labelTitulo.setFont(new Font(24));

        box.getChildren().add(labelTitulo);
        box.getChildren().add(anchorPane);
        box.getChildren().add(borderPane);
        box.getChildren().add(flowPane);

       cenaMenu = new Scene(box, 550, 250);

    }

    public static void main(String[] args) {
        launch(args);
    }
}
