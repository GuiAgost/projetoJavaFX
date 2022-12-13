package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Wizard extends Application {

    private Stage janela;
    private Scene passo1;
    private Scene passo2;
    private Scene passo3;

    @Override
    public void start(Stage stage) {
        janela = stage;

        criaPasso1();
        criaPasso2();
        criaPasso3();

        janela.setScene(passo1);
        //janela.setScene(passo2);

        janela.setTitle("Wizard :: Passo 01");
        janela.show();
    }

    private void criaPasso1(){
        Button proximoPasso = new Button("Ir para passo 2 >>");
        proximoPasso.setOnAction(e -> {
            janela.setScene(passo2);
            janela.setTitle("Wizard :: Passo 02");
        });

        HBox box = new HBox();
        box.setAlignment(Pos.CENTER);
        box.getChildren().add(proximoPasso);

        passo1 = new Scene(box, 400, 400);
    }

    private void criaPasso2(){
        Button passoAnterior = new Button("<< Voltar p/ Passo 1");
        passoAnterior.setOnAction(e -> {
            janela.setScene(passo1);
            janela.setTitle("Wizard :: Passo 01");
        });

        Button proximoPasso = new Button("Ir para passo 3 >>");
        proximoPasso.setOnAction(e -> {
            janela.setScene(passo3);
            janela.setTitle("Wizard :: Passo 03");
        });

        HBox box = new HBox();
        box.setAlignment(Pos.CENTER);
        box.getChildren().add(passoAnterior);
        box.getChildren().add(proximoPasso);

        passo2 = new Scene(box, 400, 400);
    }
    private void criaPasso3(){
        Button passoAnterior = new Button("<< Voltar p/ Passo 2");
        passoAnterior.setOnAction(e -> janela.setScene(passo2));

        Button proximoPasso = new Button("Finalizar >>");
        proximoPasso.setOnAction(e -> System.exit(0));

        HBox box = new HBox();
        box.setAlignment(Pos.CENTER);
        box.getChildren().add(passoAnterior);
        box.getChildren().add(proximoPasso);

        passo3 = new Scene(box, 400, 400);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
