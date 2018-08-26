package br.com.padroes.estrutural.adapter;

public class Client {

	public static void main(String[] args) {
		ImageTarget imagem = new SDLImagemAdapter();
		imagem.carregarImagem("test.png");
		imagem.desenharImagem(0, 0, 10, 10);
		
		imagem = new OpenGLImageAdapter();
		imagem.carregarImagem("test.png");
		imagem.desenharImagem(0, 0, 10, 10);

	}

}
