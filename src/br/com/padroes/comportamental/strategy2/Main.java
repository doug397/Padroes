package br.com.padroes.comportamental.strategy2;

public class Main {

	public static void main(String[] args) {
		
		Context contexto = new Context();
		
		contexto.setStrategy(new Algoritmo2());
		contexto.executarAlgoritmo();

	}

}
