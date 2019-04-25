package br.com.padroes.comportamental.observer2;

public class ObserverConcreto implements Observador {

	@Override
	public void update(Subject subject) {
		System.out.println("Observer Notificado");
		Instituicao instituicao = (Instituicao) subject;
		System.out.println("Dado :" +instituicao.getCnpj());
		
	}

}
