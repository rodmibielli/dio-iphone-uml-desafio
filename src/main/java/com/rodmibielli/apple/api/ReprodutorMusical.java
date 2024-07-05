package com.rodmibielli.apple.api;

/**
 * Define um tipo que reproduz músicas.
 * @author rodrigo
 * @since 1.0.0-SNAPSHOT
 */
public interface ReprodutorMusical {

	/**
	 * Toca uma música.
	 */
	void tocarMusica();
	
	/**
	 * Pausa a música em execução.
	 */
	void pausarMusica();
	
	/**
	 * Seleciona uma música específica.
	 * @param musica A música a ser selecionada.
	 */
	void selecionarMusica(String musica);
}
