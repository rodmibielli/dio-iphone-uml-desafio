package com.rodmibielli.apple.api;

/**
 * Define um tipo que reproduz vídeos.
 * @author rodrigo
 * @since 1.0.0-SNAPSHOT
 */
public interface ReprodutorVideo {

	/**
	 * Toca um video.
	 */
	void tocarVideo();
	
	/**
	 * Pausa o vídeo em execução.
	 */
	void pausarVideo();
	
	/**
	 * Seleciona um vídeo específico.
	 * @param video O vídeo a ser selecionado.
	 */
	void selecionarVideo(String video);
}
