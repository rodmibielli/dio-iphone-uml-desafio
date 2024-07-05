package com.rodmibielli.apple.iphone.model;

import com.rodmibielli.apple.api.AparelhoTelefonico;
import com.rodmibielli.apple.api.EstrategiaSincronizacao;
import com.rodmibielli.apple.api.NavegadorInternet;
import com.rodmibielli.apple.api.SincronizadorDeAudioEVideoGenerico;

/**
 * Modela as funcionalidades do IPhone.
 * @author rodrigo
 * @since 1.0.0-SNAPSHOT
 */
public class IPhone extends SincronizadorDeAudioEVideoGenerico implements AparelhoTelefonico, NavegadorInternet {
	
	/**
	 * Instancia um novo IPhone.
	 * @param sincronizador O sincronizador responsável por sincronizar áudios e vídeos para este IPhone.
	 */
	public IPhone(EstrategiaSincronizacao sincronizador) {
		super(sincronizador);
	}

	/**
	 * @TODO: Implementar o método
	 */
	@Override
	public void tocarMusica() {
	}

	/**
	 * @TODO: Implementar o método
	 */
	@Override
	public void pausarMusica() {
	}

	/**
	 * @TODO: Implementar o método
	 */
	@Override
	public void selecionarMusica(String musica) {
	}

	/**
	 * @TODO: Implementar o método
	 */
	@Override
	public void tocarVideo() {
	}

	/**
	 * @TODO: Implementar o método
	 */
	@Override
	public void pausarVideo() {
	}

	/**
	 * @TODO: Implementar o método
	 */
	@Override
	public void selecionarVideo(String video) {
	}

	/**
	 * @TODO: Implementar o método
	 */
	@Override
	public void exibePagina(String url) {
	}

	/**
	 * @TODO: Implementar o método
	 */
	@Override
	public void adicionarNovaAba() {
	}

	/**
	 * @TODO: Implementar o método
	 */
	@Override
	public void atualizarPagina() {
	}

	/**
	 * @TODO: Implementar o método
	 */
	@Override
	public void ligar(String numero) {
	}

	/**
	 * @TODO: Implementar o método
	 */
	@Override
	public void atender() {
	}

	/**
	 * @TODO: Implementar o método
	 */
	@Override
	public void iniciarCorreioVoz() {
	}

}
