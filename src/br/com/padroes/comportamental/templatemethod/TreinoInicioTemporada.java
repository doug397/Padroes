package br.com.padroes.comportamental.templatemethod;

public class TreinoInicioTemporada extends Treinos {

	@Override
	void preparoFisico() {
		System.out.println("Preparo Fisico Leve");
		
	}

	@Override
	void jogoTreino() {
		System.out.println("Jogo Treino com Equipe Junior");
		
	}

}
