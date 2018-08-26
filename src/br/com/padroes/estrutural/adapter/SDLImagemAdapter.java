package br.com.padroes.estrutural.adapter;

public class SDLImagemAdapter extends SDL_Surface implements ImageTarget {

	@Override
	public void carregarImagem(String nomeDoArquivo) {
		SDL_CarregarSurface(nomeDoArquivo);
		
	}

	@Override
	public void desenharImagem(int posX, int posY, int largura, int altura) {
		SDL_DesenharSurface(largura, altura, posX, posY);
		
	}

}
