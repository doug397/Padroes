package br.com.padroes.comportamental.templatemethod2;

public abstract class CrudAction {
	
	public void executarFiltrar() {
		antesFiltrar();
		filtrar();
		depoisFiltrar();
	}
	
	protected abstract void antesFiltrar();
	protected abstract void depoisFiltrar();
	protected abstract void filtrar();

}
