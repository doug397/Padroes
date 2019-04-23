package br.com.padroes.estrutural.adapter2;

public class Client {

	/*
	 * Adapter de Objeto herda da interface do cliente e tem uma referencia da classe da API
	 * 
	 *
	 * 
	 */
	public static void main(String[] args) {

		ImageTarget target = new ImagemAdapter();
		target.carregarImagem("test.jpj");
		target.desenharImagem(10, 10, 5, 5);
	}

}
