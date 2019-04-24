package br.com.padroes.comportamental.templatemethod3;

public abstract class CrudBO {
	
	public Object executarIncluir(Object o) {
		
		Object obj;
		obj = antesIncluir(o);
		obj = incluir(o);
		obj = depoisIncluir(o);
		
		return obj;
	}
	
	public Object antesIncluir(Object o) {
		System.out.println("CrudBO  (antesIncluir)");
		return o;
	}
	
	public Object incluir(Object o) {
		System.out.println("CrudBO  (incluir)");
		return o;
	}
	
	public Object depoisIncluir(Object o) {
		System.out.println("CrudBO  (depoisIncluir)");
		return o;
	}
	
	

}
