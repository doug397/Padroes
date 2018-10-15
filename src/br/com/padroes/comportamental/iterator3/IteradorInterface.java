package br.com.padroes.comportamental.iterator3;

public interface IteradorInterface {
	
	void first();

	void next();

	boolean isDone();

	Canal currentItem();

}
