package br.com.padroes.estrutural.adapter;

public class Client {

	/*
	 * Adapter de classe pois herda tanto da interface de api quanto da interface em comum
	 * 
	 * herança multipla e cada api teria seu adaptador possibilitando o crescimento exagerado de classes adaptadoras
	 * 
	 */
	public static void main(String[] args) {
		ImageTarget imagem = new SDLImagemAdapter();
		imagem.carregarImagem("test.png");
		imagem.desenharImagem(0, 0, 10, 10);
		
		imagem = new OpenGLImageAdapter();
		imagem.carregarImagem("test.png");
		imagem.desenharImagem(0, 0, 10, 10);

	}

}
