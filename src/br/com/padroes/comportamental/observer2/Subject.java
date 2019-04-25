package br.com.padroes.comportamental.observer2;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

	protected List<Observador> observers;
	
	public Subject() {
		observers = new ArrayList<Observador>();
	}
	
	public void add(Observador observador) {
		this.observers.add(observador);
	}
	
	public void remove(Observador observador) {
		this.observers.remove(observador);
	}
	
	public void notificar() {
		antesNotificar();
		executarNotificacao();
		depoisNotificar();
	}
	
	protected abstract void antesNotificar();
	protected abstract void depoisNotificar();
	
	protected void executarNotificacao() {
		Iterator iterator = new ListObserver(observers);
		for(iterator.first(); !iterator.isDone(); iterator.next()) {
			Observador obs =(Observador) iterator.currentItem();
			obs.update(this);
		}
		System.out.println("executarNotificacao");
	}
}
