package br.com.padroes.comportamental.visitor;

public interface IElement {

	void accept(IVisitor v);
}
