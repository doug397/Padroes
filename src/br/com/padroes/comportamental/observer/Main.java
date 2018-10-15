package br.com.padroes.comportamental.observer;

public class Main {

	public static void main(String[] args) {
		DadosSubject dados = new DadosSubject();
		dados.attach(new DadosObserver(dados));


		dados.setState(new Dados(7, 3, 1));
		dados.setState(new Dados(2, 3, 1));

	}

}
