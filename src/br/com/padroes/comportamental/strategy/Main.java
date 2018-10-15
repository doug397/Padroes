package br.com.padroes.comportamental.strategy;

public class Main {

	public static void main(String[] args) {
		
		Receita receita = new Receita();
		ImpostoStrategy strategy ;
		
		strategy = new ImpostoDez();
		receita.setImposto(strategy);
		System.out.println(receita.resultado());
		
		strategy = new ImpostoQuinze();
		receita.setImposto(strategy);
		System.out.println(receita.resultado());
	}

}
