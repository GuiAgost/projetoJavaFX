package layout;

import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.layout.FlowPane;

public class TesteFlowPane extends FlowPane {

    public TesteFlowPane(){

        Quadrado q1 = new Quadrado();
        Quadrado q2 = new Quadrado();
        Quadrado q3 = new Quadrado();
        Quadrado q4 = new Quadrado();
        Quadrado q5 = new Quadrado();

        setHgap(10); // Espaçamento Horizontal
        setVgap(10); // Expaçamento Vertical
        setPadding(new Insets(10)); // Espaçamento entre as bordas e os quadrados

        setOrientation(Orientation.VERTICAL); // Os quadrados ficam em vertical
        setAlignment(Pos.CENTER_RIGHT); // Os quadrados ficam no lado direito

        getChildren().addAll(q1, q2, q3, q4, q5);
    }
}
