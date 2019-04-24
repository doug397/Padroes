package br.com.padroes.comportamental.templatemethod2;

public class Main {

	public static void main(String[] args) {
		
		CrudAction pessoaAction = new  PessoaAction();
		pessoaAction.executarFiltrar();

	}

}
