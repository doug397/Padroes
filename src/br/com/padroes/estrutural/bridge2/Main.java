package br.com.padroes.estrutural.bridge2;

public class Main {

	public static void main(String[] args) {
		Implemantor implemantor = new ConcreteImplementorB();
		
		Abstration abs = new RefinedAbstraction2(implemantor);
		abs.operation();

	}

}
