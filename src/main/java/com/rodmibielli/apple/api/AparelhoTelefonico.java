package com.rodmibielli.apple.api;

/**
 * Define um tipo de aparelho telefonico com funcionalidades básicas.
 * @author rodrigo
 * @since 1.0.0-SNAPSHOT
 */
public interface AparelhoTelefonico {
	
	/**
	 * Efetua uma chamada telefônica.
	 * @param numero O número de telefone.
	 */
	void ligar(String numero);
	
	/**
	 * Atende uma chamada telefônica.
	 */
	void atender();
	
	/**
	 * Inicia o serviço de correio de voz.
	 */
	void iniciarCorreioVoz();
}
