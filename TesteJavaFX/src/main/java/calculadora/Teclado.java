package calculadora;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import javafx.scene.layout.GridPane;

public class Teclado extends GridPane implements Consumer<String> {
	
	private final List<Consumer<String>> funcoes = new ArrayList<>();

	/*
	 * private List<Consumer<String>> funcoes = new ArrayList<>();
	 * private Botao botaoAC = new Botao("AC", this, "escuro");
	 * private Botao botaoMaisMenos = new Botao("±", this, "escuro");
	 * private Botao botaoPerc = new Botao("%", this, "escuro");
	 * private Botao botaoDiv = new Botao("÷", this, "operacao");
	 *
	 * private Botao botao7 = new Botao("7", this);
	 * private Botao botao8 = new Botao("8", this);
	 * private Botao botao9 = new Botao("9", this);
	 * private Botao botaoMult = new Botao("×", this, "operacao");
	 *
	 * private Botao botao4 = new Botao("4", this);
	 * private Botao botao5 = new Botao("5", this);
	 * private Botao botao6 = new Botao("6", this);
	 * private Botao botaoSub = new Botao("-", this, "operacao");
	 *
	 * private Botao botao1 = new Botao("1", this);
	 * private Botao botao2 = new Botao("2", this);
	 * private Botao botao3 = new Botao("3", this);
	 *
	 * private Botao botaoAdd = new Botao("+", this, "operacao");
	 * private Botao botao0 = new Botao("0", this, "duplo", "arredondado-e");
	 * private Botao botaoVirg = new Botao(",", this);
	 * private Botao botaoResultado = new Botao("=", this, "operacao", "arredondado-d");
	 */

	public Teclado() {
		setHgap(2);
		setVgap(2);

		Botao botaoAC = new Botao("AC", this, "escuro");
		add(botaoAC, 0, 0);
		Botao botaoMaisMenos = new Botao("±", this, "escuro");
		add(botaoMaisMenos, 1, 0);
		Botao botaoPerc = new Botao("%", this, "escuro");
		add(botaoPerc, 2, 0);
		Botao botaoDiv = new Botao("÷", this, "operacao");
		add(botaoDiv, 3, 0);

		Botao botao7 = new Botao("7", this);
		add(botao7, 0, 1);
		Botao botao8 = new Botao("8", this);
		add(botao8, 1, 1);
		Botao botao9 = new Botao("9", this);
		add(botao9, 2, 1);
		Botao botaoMult = new Botao("×", this, "operacao");
		add(botaoMult, 3, 1);

		Botao botao4 = new Botao("4", this);
		add(botao4, 0, 2);
		Botao botao5 = new Botao("5", this);
		add(botao5, 1, 2);
		Botao botao6 = new Botao("6", this);
		add(botao6, 2, 2);
		Botao botaoSub = new Botao("-", this, "operacao");
		add(botaoSub, 3, 2);

		Botao botao1 = new Botao("1", this);
		add(botao1, 0, 3);
		Botao botao2 = new Botao("2", this);
		add(botao2, 1, 3);
		Botao botao3 = new Botao("3", this);
		add(botao3, 2, 3);
		Botao botaoAdd = new Botao("+", this, "operacao");
		add(botaoAdd, 3, 3);

		Botao botao0 = new Botao("0", this, "duplo", "arredondado-e");
		add(botao0, 0, 4, 2, 1);
		Botao botaoVirg = new Botao(",", this);
		add(botaoVirg, 2, 4);
		Botao botaoResultado = new Botao("=", this, "operacao", "arredondado-d");
		add(botaoResultado, 3, 4);
		
		setOnKeyTyped(e -> accept(e.getCharacter()));
		botaoAC.requestFocus();
	}
	
	public void noCliqueChame(Consumer<String> funcao) {
		funcoes.add(funcao);
	}
	
	@Override
	public void accept(String t) {
		funcoes.forEach(fn -> fn.accept(t));
	}
}
