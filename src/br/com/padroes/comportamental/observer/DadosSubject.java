package br.com.padroes.comportamental.observer;

import java.util.ArrayList;
import java.util.List;

public class DadosSubject {
	
	protected List<IObserver> observers;
	protected Dados dados;
	
	public DadosSubject() {
		observers = new ArrayList<>();
	}
	
    public void attach(DadosObserver observer) {
    	observers.add(observer);
	}
	 
    public void detach(int indice) {
	      observers.remove(indice);
	}
    
    public void setState(Dados dados) {
        this.dados = dados;
        notifyObservers();
    }
     
    private void notifyObservers() {
        for (IObserver observer : observers) {
            observer.update();
        }
    }
     
    public Dados getState() {
        return dados;
    }
	
}
