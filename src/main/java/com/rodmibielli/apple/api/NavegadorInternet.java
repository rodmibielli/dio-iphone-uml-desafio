package com.rodmibielli.apple.api;

/**
 * Define um tipo de navegador de internet.
 * @author rodrigo
 * @since 1.0.0-SNAPSHOT
 */
public interface NavegadorInternet {

	/**
	 * Exibe uma página a partir de uma URL passada como parâmetro.
	 * @param url O endereço de URL.
	 */
	void exibePagina(String url);
	
	/**
	 * Adiciona nova aba no navegador.
	 */
	void adicionarNovaAba();
	
	/**
	 * Atualiza a página atual.
	 */
	void atualizarPagina();
}
