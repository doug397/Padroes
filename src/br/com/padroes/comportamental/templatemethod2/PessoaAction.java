package br.com.padroes.comportamental.templatemethod2;

public class PessoaAction extends CrudAction {

	@Override
	public void antesFiltrar() {
		System.out.println("PessoaAction  (antesFiltrar)");
		
	}

	@Override
	public void depoisFiltrar() {
		System.out.println("PessoaAction  (depoisFiltrar)");
		
	}

	@Override
	public void filtrar() {
		System.out.println("PessoaAction  (filtrar)");
		
	}

}
