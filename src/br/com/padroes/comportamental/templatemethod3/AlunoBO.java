package br.com.padroes.comportamental.templatemethod3;

public class AlunoBO extends CrudBO {
	
	@Override
	public Object antesIncluir(Object o) {
		super.antesIncluir(o);
		
		System.out.println("AlunoBO  (antesIncluir)");
		return o;
	}
	
	@Override
	public Object depoisIncluir(Object o) {
		super.depoisIncluir(o);
		System.out.println("AlunoBO  (antesIncluir)");
		return o;
	}
	
	@Override
	public Object incluir(Object o) {
		 super.incluir(o);
		System.out.println("AlunoBO  (incluir)");
		return o;
	}

}
