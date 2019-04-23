package br.com.padroes.estrutural.adapter2;

/**
 * Precisamos então, inicialmente, 
 * fornecer uma interface comum para o cliente, 
 * oferencendo o comportamento que ele necessita:
 * 
 * */
public interface ImageTarget {
	
	void carregarImagem(String nomeDoArquivo);
	
	void desenharImagem(int posX,int posY, int largura, int altura);

}
