package br.com.padroes.estrutural.adapter2;

public class OpenGLImage {
	
	public void glCarregarImagem(String arquivo) {
		System.out.println("Imagem " + arquivo + " carregada.");
		
	}
	
	public void glDesenharImagem(int posicaoX, int posicaoY) {
		System.out.println("OpenGL imagem desenhada");
	}
	

}
