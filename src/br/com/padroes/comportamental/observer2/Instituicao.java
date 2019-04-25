package br.com.padroes.comportamental.observer2;

public class Instituicao extends Subject {

	private String cnpj= "000-0000-/0000";

	@Override
	protected void antesNotificar() {
		System.out.println("Instituicao (antesNotificar)");
	}
	
	@Override
	protected void depoisNotificar() {
		System.out.println("Instituicao (depoisNotificar)");
	}
	
	public String getCnpj() {
		return cnpj;
	}

}
