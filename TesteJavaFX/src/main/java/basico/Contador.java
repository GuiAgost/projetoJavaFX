package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Contador extends Application {

    private int contador = 0;

    private void atualizarLabelNumero (Label labelNumero) {
        labelNumero.setText(Integer.toString(contador));

        labelNumero.getStyleClass().remove("vermelho");
        labelNumero.getStyleClass().remove("verde");

        if (contador < 0){
            labelNumero.getStyleClass().add("vermelho");
        } else if (contador > 0){
            labelNumero.getStyleClass().add("verde");
        }
    }

    @Override
    public void start(Stage stage) throws Exception {
        Label labelTitulo = new Label("Contador.css");
        labelTitulo.getStyleClass().add("titulo");

        Label labelNumero = new Label("0");
        labelNumero.getStyleClass().add("numero");

        Button botaoDecremento = new Button("-");
        botaoDecremento.getStylesheets().add("botoes");
        botaoDecremento.setOnAction(e -> {
            contador--;
            atualizarLabelNumero(labelNumero);
        });

        Button botaoIncremento = new Button("+");
        botaoIncremento.getStylesheets().add("botoes");
        botaoIncremento.setOnAction(e -> {
            contador++;
            atualizarLabelNumero(labelNumero);
        });

        HBox boxBotoes = new HBox();
        boxBotoes.setAlignment(Pos.CENTER); // CENTRALIZA OS BOTÕES
        boxBotoes.setSpacing(10); /// CRIA O ESPAÇO ENTRE OS BOTÕES
        boxBotoes.getChildren().add(botaoDecremento);
        boxBotoes.getChildren().add(botaoIncremento);

        VBox boxConteudo = new VBox();
        boxConteudo.getStyleClass().add("conteudo");
        boxConteudo.setAlignment(Pos.CENTER); // CENTRALIZA O BOX PRINCIPAL
        boxConteudo.setSpacing(10);
        boxConteudo.getChildren().add(labelTitulo);
        boxConteudo.getChildren().add(labelNumero);
        boxConteudo.getChildren().add(boxBotoes);

        //String caminhoDoCss = getClass().getResource("/resources/Contador.css").toExternalForm();
        System.out.println("classpath=" + System.getProperty("java.class.path"));
        String caminhoCss = getClass().getResource("/basico/Contador.css").toExternalForm();

        Scene cenaPrincipal = new Scene(boxConteudo, 400, 400);
        cenaPrincipal.getStylesheets().add(caminhoCss);
        cenaPrincipal.getStylesheets().add("https://fonts.googleapis.com/css2?family=Oswald");
        stage.setScene(cenaPrincipal);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
