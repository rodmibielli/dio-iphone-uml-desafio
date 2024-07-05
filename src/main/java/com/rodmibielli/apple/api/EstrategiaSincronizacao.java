package com.rodmibielli.apple.api;

/**
 * Responsável por estratégia de sincronização de áudio e vídeo.
 * @author rodrigo
 * @since 1.0.0-SNAPSHOT
 */
public interface EstrategiaSincronizacao {

	/**
	 * Sincroniza uma música deste tipo para o reprodutor musical de destino.
	 * @param destino O reprodutor musical cujas musicas desta origem serão sincronizados.
	 */
	void sincronizarMusica(ReprodutorMusical destino);
	
	/**
	 * Sincroniza um vídeo deste tipo para o reprodutor de vídeo de destino.
	 * @param destino O reprodutor de vídeo cujos vídeos desta origem serão sincronizados.
	 */
	void sincronizarVideo(ReprodutorVideo destino);
}
