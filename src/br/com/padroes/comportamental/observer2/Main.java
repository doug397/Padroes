package br.com.padroes.comportamental.observer2;

public class Main {

	public static void main(String[] args) {
		
		Subject subject = new Instituicao();
		
		subject.add(new ObserverConcreto());
		subject.add(new ObserverConcreto());
		subject.add(new ObserverConcreto());
		subject.add(new ObserverConcreto());
		
		subject.notificar();

	}

}
