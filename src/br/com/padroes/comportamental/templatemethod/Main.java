package br.com.padroes.comportamental.templatemethod;

public class Main {

	public static void main(String[] args) {

		Treinos treino = new TreinoInicioTemporada();
		
		treino.treinoDiario();
		
		treino = new TreinoMeioDaTemporada();
		
		treino.treinoDiario();

	}

}
