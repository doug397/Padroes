package br.com.padroes.comportamental.templatemethod;

public class TreinoMeioDaTemporada extends Treinos {

	@Override
	void preparoFisico() {
		System.out.println("Preparo Fisico Intenso");
		
	}

	@Override
	void jogoTreino() {
		System.out.println("Jogo Treino com Equipe Reserva");
		
	}

}
