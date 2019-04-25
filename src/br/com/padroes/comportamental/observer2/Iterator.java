package br.com.padroes.comportamental.observer2;

public interface Iterator {
	
	void first();
	void next();
	boolean isDone();
	Object currentItem();

}
